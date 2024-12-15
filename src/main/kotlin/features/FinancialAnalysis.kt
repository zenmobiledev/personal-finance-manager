package features

import utils.TransactionTracker

class FinancialAnalysis(private val finance: TransactionTracker) {
    // menampilkan riwayat semua Pemasukan dan Pengeluaran.
    fun financialAnalysisFeature() {
        println(
            """
            Total Pemasukan: ${finance.getTotalIncome()}
            Total Pengeluaran: ${finance.getTotalExpense()}
            Saldo Akhir: ${finance.getBalance()}
        """.trimIndent() + "\n"
        )
    }
}