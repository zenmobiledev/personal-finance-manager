package utils

import data.Finance
import data.IBalance
import data.TransactionType

object TransactionTracker : IBalance {
    private val transaction = mutableListOf<Finance>()
    private var income = 0
    private var expense = 0

    fun addIncome(amountIncome: Int, info: String) {
        income += amountIncome
        transaction.add(
            Finance(
                transactionType = TransactionType.INCOME,
                amount = amountIncome,
                information = info,
                date = DateUtils.getDateTime()
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
                date = DateUtils.getDateTime()
            )
        )
    }

    fun getBalance(): Int = getBalance(income, expense)

    fun getTotalIncome(): Int = transaction.filter { it.transactionType == TransactionType.INCOME }.sumOf { it.amount }

    fun getTotalExpense(): Int =
        transaction.filter { it.transactionType == TransactionType.EXPENSE }.sumOf { it.amount }

    fun getTransactionHistory(): List<Finance> = transaction
}