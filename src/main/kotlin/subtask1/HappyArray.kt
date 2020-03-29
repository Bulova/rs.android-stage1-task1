package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {

        var happyArray = emptyArray<Int>()

        for(x in sadArray.withIndex()){
            if(x.index == 0
                || x.index == sadArray.lastIndex
                || x.value < sadArray[x.index - 1] + sadArray[x.index + 1]){

                happyArray += x.value
            }
        }

        if(sadArray.size != happyArray.size){
            return convertToHappy(happyArray.toIntArray())
        } else {
            return happyArray.toIntArray()
        }
    }
}
