fun main(args: Array<String>) {

    // Inputs
    val size = readLine()!!.toInt()
    val arr = readLine()!!.split(' ').map(String::toInt)
    val outArr = IntArray(size)

    // Check duplicates
    if (arr.distinct().size < arr.size){
        print("IMPOSSIBLE")
        return
    }

    // Check items > size
    for (item in arr){
        if (item > size){
            print("IMPOSSIBLE")
            return
        }
    }

    for (i in 0 until size)
        outArr[arr[i] - 1] = i + 1

    // Print output
    print(outArr.joinToString(" "))

}

