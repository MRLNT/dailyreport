# 📊 Daily Report - Java Project  

![Java](https://img.shields.io/badge/Java-17-red?logo=openjdk&logoColor=white)  
![Gradle](https://img.shields.io/badge/Gradle-Build%20Tool-green?logo=gradle&logoColor=white)  
![Platform](https://img.shields.io/badge/Platform-Windows%20%7C%20Linux%20%7C%20Mac-blue)  

<p align="center">
  <img src="https://media.giphy.com/media/XAxylRMCdpbEWUAvr8/giphy.gif" width="120px" alt="Java Logo Animation"/>
</p>

---

## 🚀 Deskripsi
**Daily Report** adalah aplikasi berbasis **Java + Gradle** yang digunakan untuk mengelola dan memproses laporan harian.  
Repo ini cocok untuk belajar pemrograman Java dasar, Gradle, dan manajemen proyek.  

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
Tambahkan ke ~/.bashrc atau ~/.zshrc:
export JAVA_HOME=/usr/lib/jvm/java-17
export PATH=$JAVA_HOME/bin:$PATH
source ~/.bashrc
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


<p align="center"> Dibuat dengan ☕ Creamy Latte dengan Gula Terpisah :D </p>
