package utils

import data.Finance
import data.IBalance
import data.TransactionType
import java.text.SimpleDateFormat
import java.util.*

object TransactionTracker : IBalance {
    private val transaction = mutableListOf<Finance>()
    private var income = 0
    private var expense = 0

    private val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    private val date = Date()
    private val formatTime = formatter.format(date)

    fun addIncome(amountIncome: Int, info: String) {
        income += amountIncome
        transaction.add(
            Finance(
                transactionType = TransactionType.INCOME,
                amount = amountIncome,
                information = info,
                date = formatTime
            )
        )
    }

    fun addExpense(amountExpense: Int, info: String) {
        expense += amountExpense
        transaction.add(
            Finance(
                transactionType = TransactionType.EXPENSE,
                amount = amountExpense,
                information = info,
                date = formatTime
            )
        )
    }

    fun getBalance(): Int {
        return getBalance(income, expense)
    }

    fun getTotalIncome(): Int = transaction.filter { it.transactionType == TransactionType.INCOME }.sumOf { it.amount }

    fun getTotalExpense(): Int =
        transaction.filter { it.transactionType == TransactionType.EXPENSE }.sumOf { it.amount }

    fun getTransactionHistory(): List<Finance> = transaction
}