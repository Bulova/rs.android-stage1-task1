package subtask3

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairSum: Int = (bill.sum() - bill[k])/2
        return if (fairSum == b) "Bon Appetit" else "${b.minus(fairSum)}"
    }
}
