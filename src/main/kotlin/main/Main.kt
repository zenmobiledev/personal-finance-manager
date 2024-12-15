package main

import features.CalculateBalance
import features.FinancialAnalysis
import features.IncomeAndExpense
import features.TransactionHistory
import utils.ReadLn
import utils.TransactionTracker

/* TODO: Fitur Aplikasi
    1. Input Pemasukan dan Pengeluaran: Pengguna dapat memasukan jumlah pemasukan atau pengeluaran bersama dengan keterangan.
    2. Perhitungan Saldo: Aplikasi secara otomatis menghitung saldo akhir berdasarkan pemasukan dan pengeluaran.
    3. Riwayat Transaksi: Menampilkan riwayat semua pemasukan dan pengeluaran.
    4. Analisis Keuangan: Menampilkan jumlah total pemasukan, pengeluaran dan saldo akhir.
     */

/* TODO: Point Penilaian
    1. Basic Functionality (Variables and Data Types, Aritchmetic Operations, etc): (25 point)
    2. Control Flow (IF-Else, When, Looping): (20 point)
    3. Function Definition and Utilization: (25 point)
    4. OOP Concepts (Classes, Objects, Properties, Methods): (20 point)
    5. Collection Data Management (MutableList): (10 point)
 */

fun main() {
    val uiIncomeAndExpense = IncomeAndExpense(TransactionTracker)
    val uiCalculateBalance = CalculateBalance(TransactionTracker)
    val uiTransactionHistory = TransactionHistory(TransactionTracker)
    val uiFinancialAnalysis = FinancialAnalysis(TransactionTracker)

    do {
        /*
        User Interface
        Personal Finance Manager Application
         */
        println("Selamat Datang di Personal Finance Manager Application\nSilakan memilih angka dari 1 sampai 6")
        println("1. Pemasukan")
        println("2. Pengeluaran")
        println("3. Perhitungan Saldo")
        println("4. Riwayat Transaksi")
        println("5. Analisis Keuangan")
        println("6. Keluar")

        print("Input: ")
        val menu = ReadLn.convertStringToInt()

        when (menu) {
            1 -> uiIncomeAndExpense.incomeFeature()

            2 -> uiIncomeAndExpense.expenseFeature()

            3 -> uiCalculateBalance.calculationBalanceFeature()

            4 -> uiTransactionHistory.transactionHistoryFeature()

            5 -> uiFinancialAnalysis.financialAnalysisFeature()

            6 -> {
                println("Keluar Aplikasi.....\nTerima Kasih :)")
                break
            }

            else -> {
                println("Angka yang anda input tidak di ketahui")
            }
        }
    } while (menu in 1..6)
}