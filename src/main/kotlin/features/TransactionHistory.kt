package features

import data.TransactionType
import utils.TransactionTracker

class TransactionHistory(private val finance: TransactionTracker) {
    // menampilkan riwayat transaksi
    fun transactionHistoryFeature() {
        val history = finance.getTransactionHistory()
        val totalIncome = history.filter { it.transactionType == TransactionType.INCOME }
        val totalExpense = history.filter { it.transactionType == TransactionType.EXPENSE }

        // mengecek apakah ada riwayat transaksi Pemasukan atau tidak
        if (totalIncome.isNotEmpty()) {
            println("---------- Transaksi Pemasukan ----------")
            for (i in totalIncome) {
                println(
                    """
                    Pemasukan: ${i.amount}
                    Keterangan: ${i.information}
                """.trimIndent() + "\n"
                )
            }
        } else {
            println("========== TIDAK ADA RIWAYAT TRANSAKSI PEMASUKAN ==========")
        }

        // mengecek apakah ada riwayat transaksi Pengeluaran atau tidak
        if (totalExpense.isNotEmpty()) {
            println("---------- Transaksi Pengeluaran ----------")
            for (i in totalExpense) {
                println(
                    """
                    Pengeluaran: ${i.amount}
                    Keterangan: ${i.information}
                """.trimIndent() + "\n"
                )
            }
        } else {
            println("========== TIDAK ADA RIWAYAT TRANSAKSI PENGELUARAN ==========")
        }
    }
}