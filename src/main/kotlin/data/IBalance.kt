package data

interface IBalance {
    fun getBalance(income: Int, expense: Int): Int = income - expense
}