package subtask4

class StringParser {

    var substrings:Array<String> = emptyArray()

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        val regex = """\<[^\>]*\>|\[[^\]]*\]|\([^\)]*\)""".toRegex()
        val matchResults = regex.findAll(inputString)

        val matchResultsList = matchResults.toList()
        if(matchResultsList.isEmpty()){
            return emptyArray()
        }

        for(result in matchResultsList){
            val value = result.value
            if(value.isNotEmpty()) {
                val add = value.substring(1, value.length - 1)
                substrings += add
                substrings + getResult(add)
            }
        }

        return substrings
    }
}
