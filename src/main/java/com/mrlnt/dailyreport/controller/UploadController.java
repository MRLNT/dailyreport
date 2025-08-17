package com.mrlnt.dailyreport.controller;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.OutputStream;

@Controller
public class UploadController {

    @GetMapping("/upload")
    public String uploadPage() {
        return "upload"; // view: upload.html
    }

    @PostMapping("/process")
    public void handleFileUpload(@RequestParam("file") MultipartFile file, HttpServletResponse response) throws Exception {

        // 1. Load template
        InputStream templateStream = new ClassPathResource("templates/15082025 Report Pass Masuk GAC.xlsx").getInputStream();
        Workbook templateWorkbook = new XSSFWorkbook(templateStream);
        Sheet targetSheet = templateWorkbook.getSheetAt(0);

        // 2. Baca file upload (epass-report.xlsx)
        Workbook sourceWorkbook = new XSSFWorkbook(file.getInputStream());
        Sheet sourceSheet = sourceWorkbook.getSheetAt(0);

        // Gunakan Set untuk memastikan PASS ID unik
        java.util.Set<String> uniquePassIds = new java.util.HashSet<>();

        int targetRowIndex = 10; // mulai dari row 11 di template
        for (int i = 1; i <= sourceSheet.getLastRowNum(); i++) { // mulai row index 1 (B2 dst)
            Row sourceRow = sourceSheet.getRow(i);
            if (sourceRow == null) continue;

            // === PASS ID (kolom A di epass) ===
            Cell sourceCellA = sourceRow.getCell(0);
            String valueA = (sourceCellA != null) ? sourceCellA.toString().trim() : "";

            if (valueA.isEmpty() || uniquePassIds.contains(valueA)) {
                continue;
            }
            uniquePassIds.add(valueA);

            // === STATUS (kolom B di epass) ===
            Cell sourceCellB = sourceRow.getCell(1);
            String status = (sourceCellB != null) ? sourceCellB.toString().trim().toUpperCase() : "";
            String mappedStatus = "";
            if (status.equals("OPENED") || status.equals("CLOSED")) {
                mappedStatus = "Ya";
            } else if (status.equals("NOT_OPENED")) {
                mappedStatus = "Tidak";
            }

            // === ACTIVITY (kolom C di epass) ===
            Cell sourceCellC = sourceRow.getCell(2);
            String valueC = (sourceCellC != null) ? sourceCellC.toString().trim() : "";

            // === VISITED DATE (kolom G di epass) ===
            Cell sourceCellG = sourceRow.getCell(6);
            String valueG = (sourceCellG != null) ? sourceCellG.toString().trim() : "";

            // === Tulis ke template ===
            Row targetRow = targetSheet.getRow(targetRowIndex);
            if (targetRow == null) {
                targetRow = targetSheet.createRow(targetRowIndex);
            }

            // Kolom E (index 4) → STATUS mapped
            Cell targetCellE = targetRow.getCell(4);
            if (targetCellE == null) {
                targetCellE = targetRow.createCell(4);
            }
            targetCellE.setCellValue(mappedStatus);

            // Kolom F (index 5) → VISIT DATE
            Cell targetCellF = targetRow.getCell(5);
            if (targetCellF == null) {
                targetCellF = targetRow.createCell(5);
            }
            targetCellF.setCellValue(valueG);

            // Kolom H (index 7) → PASS ID
            Cell targetCellH = targetRow.getCell(7);
            if (targetCellH == null) {
                targetCellH = targetRow.createCell(7);
            }
            targetCellH.setCellValue(valueA);

            // Kolom J (index 9) → ACTIVITY
            Cell targetCellJ = targetRow.getCell(9);
            if (targetCellJ == null) {
                targetCellJ = targetRow.createCell(9);
            }
            targetCellJ.setCellValue(valueC);

            targetRowIndex++;
        }

        sourceWorkbook.close();

        // 3. Response langsung download
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=Report_Pass_Masuk_GAC.xlsx");

        OutputStream out = response.getOutputStream();
        templateWorkbook.write(out);
        templateWorkbook.close();
        out.close();
    }
}
