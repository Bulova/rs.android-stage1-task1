package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray = arrayOf(input.sum().minus(input.max()!!), input.sum().minus(input.min()!!)).toIntArray()
}
