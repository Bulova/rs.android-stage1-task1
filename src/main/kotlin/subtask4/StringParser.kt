package subtask4

class StringParser {

    var substrings:Array<String> = emptyArray()

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        val regex = """(\<[^\>]*\>|\[[^\]]*\]|\([^\)]*\))*""".toRegex()
        val matchResults = regex.findAll(inputString)

        for(result in matchResults){
            val value = result.value
            if(value.isNotEmpty()) {
                val add = value.substring(1, value.length - 1)
                substrings += add
                //return getResult(add)
            }
        }

        return substrings
    }
}
