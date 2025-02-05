[![Platform](https://img.shields.io/badge/JDK-17.54.21-3D7FC6?style=for-the-badge&logo=openJdk&logoColor=F88A02)](https://openjdk.org/)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.0.20-3D7FC6?style=for-the-badge&logo=kotlin&logoColor=F88A02)](http://kotlinlang.org)
[![Gradle](https://img.shields.io/badge/gradle-8.8-02303A?style=for-the-badge&logo=gradle&logoColor=white)](https://developer.android.com/studio/releases/gradle-plugin)

# Personal Finance Manager Application

*Personal Finance Manager Application* adalah aplikasi manajemen keuangan yang sederhana. Aplikasi ini dapat membantu
melacak aktivitas keuangan seperti pemasukan atau pengeluaran, beserta keterangannya.

## Daftar isi

- [Features](#features)
- [Technology Used / Tech Stack](#technology-used--tech-stack)
- [Installation (How to run the project)](#installation-how-to-run-the-project)
- [Tree / Folder Structure](#tree--folder-structure)
- [Todos](#todos)
- [Flowchart](#flowchart)
- [Preview](#preview)
- [Demo](#demo)
- [Credit / Contributor(s)](#credit--contributors)

## Features

> - **Input Pemasukan dan Pengeluaran:** Pengguna dapat memasukan jumlah pemasukan atau pengeluaran bersama dengan
    keterangan.
> - **Perhitungan Saldo:** Aplikasi secara otomatis menghitung saldo akhir berdasarkan pemasukan dan pengeluaran.
> - **Riwayat Transaksi:** Menampilkan riwayat semua pemasukan dan pengeluaran.
> - **Analisis Keuangan:** Menampilkan jumlah total pemasukan, pengeluaran dan saldo akhir.

## Technology Used / Tech Stack
>- Programming Language: Kotlin
>- Build Tool: Gradle

## Installation (How to run the project)
To run the project locally, follow these steps:
### 1. Clone the repository
>- ```git clone https://github.com/zenmobiledev/personal-finance-manager.git ```
>- ```cd personal-finance-manager```

### 2. Open the project
>- Launch **IntelliJ IDEA**.
>- Select **File** > **Open** and navigate to the project directory.

### 3. Build the project
>- Ensure you have the necessary SDKs and dependencies installed.
>- Click on the **Build** menu and select **Build Project**.

### 4. Run the application
>- Navigate to the ```Main.kt``` file.
>- Click the green play button next to the ```main()``` function

## Tree / Folder Structure
```
personal-finance-manager/
├── assets/
│   ├── screenshot.png
│   └── demo.gif
├── flow/
│   └── flowchart.png
├── src/
│   └── main/
│       └── kotlin/
│           └── data/
│               ├── Finance.kt
│               ├── IBalance.kt
│               └── TransactionType.kt
│           └── features/
│               ├── CalculateBalance.kt
│               ├── FinancialAnalysis.kt
│               ├── IncomeAndExpense.kt
│               └── TransactionHistory.kt
│           └── main/
│               └── Main.kt        
│           └── utils/
│               ├── DateUtils.kt
│               ├── ReadLn.kt
│               └── TransactionTracker.kt
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```

## Todos
- [x] Input Pemasukan dan Pengeluaran
- [x] Perhitungan Saldo
- [x] Riwayat Transaksi
- [x] Analisis Keuangan

## Flowchart

| Image                            |
|----------------------------------|
| ![flowchart](assets/AppFlow.png) |

## Preview

| Halaman Menu Utama                | Halaman Pemasukan            | Halaman Pengeluaran            |
|-----------------------------------|------------------------------|--------------------------------|
| ![Main Page](assets/MainMenu.png) | ![Income](assets/Income.png) | ![Expense](assets/Expense.png) |

| Halaman Perhitungan Saldo                | Halaman Riwayat Transaksi                             | Halaman Analisis Keuangan                           |
|------------------------------------------|-------------------------------------------------------|-----------------------------------------------------|
| ![Calculate Balance](assets/Balance.png) | ![History Transaction](assets/HistoryTransaction.png) | ![Financial Analysis](assets/FinancialAnalysis.png) |

| Halaman Keluar Aplikasi         |
|---------------------------------|
| ![Exit App](assets/ExitApp.png) |

## Demo

https://github.com/user-attachments/assets/edf73eba-6207-48e8-98c9-e11cc503da98

## Credit / Contributor(s)
- [Zaenal Arif](https://github.com/zenmobiledev)
