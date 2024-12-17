package features

import utils.ReadLn
import utils.TransactionTracker

class IncomeAndExpense(private val finance: TransactionTracker) {
    // Input Pemasukan
    fun incomeFeature() {
        print("Input Pemasukan: ")
        val inputIncome = ReadLn.convertStringToInt()
        print("Input Keterangan: ")
        val inputInformation = ReadLn.getInputOrNull()

        if (inputIncome != 0 && inputInformation != "") {
            finance.addIncome(
                amountIncome = inputIncome,
                info = inputInformation
            )
            println("Input pemasukan berhasil di rekam!\n")
        } else {
            println("Input yang kamu masukan salah atau kosong!\n")
        }
    }

    // Input Pengeluaran
    fun expenseFeature() {
        print("Input Pengeluaran: ")
        val inputExpense = ReadLn.convertStringToInt()
        print("Input Keterangan: ")
        val inputInformation = ReadLn.getInputOrNull()

        if (inputExpense != 0 && inputInformation != "") {
            finance.addExpense(
                amountExpense = inputExpense,
                info = inputInformation
            )
            println("Input pengeluaran berhasil di rekam!\n")
        } else {
            println("Input yang kamu masukan salah atau kosong!\n")
        }
    }
}