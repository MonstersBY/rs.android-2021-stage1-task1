package subtask1

class HappyArray {


    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArray = sadArray.toMutableList()
        var id = 0
        while (id < sadArray.size - 1 ){
            if (id != 0 && sadArray[id-1] + sadArray[id+1] < sadArray[id]){
                sadArray.removeAt(id)
                id--
            }else id++
        }
        return sadArray.toIntArray()
    }
}
