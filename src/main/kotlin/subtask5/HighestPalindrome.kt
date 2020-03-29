package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val reverseString = digitString.reversed()
        var count = 0

        for (i in 0 until n/2) {
            if (digitString.get(i) != reverseString.get(i)) {
                count += 1
            }
        }

        var result = ""

        if(count == 0){
            result = digitString
        } else if (count <= k) {
            var changeTimes = k
            for (i in 0 until n/2) {
                if (digitString.get(i) != reverseString.get(i)) {
                    if(changeTimes > 1){
                        result += 9
                        changeTimes -= 2
                    } else if(digitString.get(i).toInt() > reverseString.get(i).toInt()) {
                        result += digitString.get(i)
                    } else {
                        result += reverseString.get(i)
                    }
                }
                else{
                    result += digitString.get(i)
                }
            }
            result += result.reversed()
        } else{
            result = "-1"
        }

        return result
    }
}
