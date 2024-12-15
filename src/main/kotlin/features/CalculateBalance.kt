package features

import utils.TransactionTracker

class CalculateBalance(private val finance: TransactionTracker) {
    // Perhitungan Saldo
    fun calculationBalanceFeature() {
        println("Saldo Akhir: ${finance.getBalance()}\n")
    }
}