# 📊 Daily Report - Java Project  

![Java](https://img.shields.io/badge/Java-17-red?logo=openjdk&logoColor=white)  
![Gradle](https://img.shields.io/badge/Gradle-Build%20Tool-green?logo=gradle&logoColor=white)  
![Platform](https://img.shields.io/badge/Platform-Windows%20%7C%20Linux%20%7C%20Mac-blue)  

<p align="center">
  <img src="https://media.giphy.com/media/XAxylRMCdpbEWUAvr8/giphy.gif" width="120px" alt="Java Logo Animation"/>
  <img src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/bd0421ae-15ce-4a9a-909c-018bf93cf5fc/db6r9fm-10b823e1-f101-4bc6-b71c-a81e2c3fef12.gif?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2JkMDQyMWFlLTE1Y2UtNGE5YS05MDljLTAxOGJmOTNjZjVmY1wvZGI2cjlmbS0xMGI4MjNlMS1mMTAxLTRiYzYtYjcxYy1hODFlMmMzZmVmMTIuZ2lmIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.5Bw8q1jeFn8kuacYbyuYAbtlehzjJvT68CIeuw8uvfY" width="120px" alt="NightFall">
</p>

---

## 🚀 Deskripsi
**Daily Report** adalah aplikasi berbasis **Java + Gradle** yang digunakan untuk mengelola dan memproses laporan harian di kala shifting.  

---

## 📥 Instalasi Java (Windows / Linux / Mac)

### 1. Download JDK (Java Development Kit)
👉 [Unduh JDK di Adoptium Temurin](https://adoptium.net/)  

### 2. Install JDK
- **Windows**: Jalankan installer `.msi` dan ikuti wizard.  
- **Linux/Mac**: Extract / install sesuai package manager (contoh: `apt`, `yum`, `brew`).  

### 3. Tambahkan `JAVA_HOME` ke Environment Variables

#### Windows
1. Buka: `Edit the system environment variables`  
2. Klik **Environment Variables**  
3. Tambahkan variable baru:  
JAVA_HOME=C:\Program Files\Java\jdk-17
4. Edit **Path** → tambahkan baris:  
%JAVA_HOME%\bin
5. Cek instalasi via PowerShell/CMD:  
java -version
javac -version

#### Linux/Mac
1. Tambahkan ke ~/.bashrc atau ~/.zshrc:
export JAVA_HOME=/usr/lib/jvm/java-17
export PATH=$JAVA_HOME/bin:$PATH
2. Reload Shell:
source ~/.bashrc
3. Cek Instalasi:
java -version
javac -version

## 🔧 Cara Clone & Jalankan Project
### 1. Clone repository
git clone https://github.com/MRLNT/dailyreport.git
cd dailyreport

### 2. Build project dengan Gradle
./gradlew clean build

### 3. Jalankan aplikasi
./gradlew run

## 🎯 Fitur Utama
### ✅ Dapat di-build menggunakan Gradle
### ✅ Cross-platform (Windows, Linux, Mac)
### ✅ Struktur project rapi sesuai standar Java
### ✅ Mudah dijalankan di terminal atau IDE


<p align="center"> Dibuat dengan ☕ Creamy Latte Gula Terpisah :D </p>