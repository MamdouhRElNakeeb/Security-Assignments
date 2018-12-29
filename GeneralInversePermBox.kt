fun main(args: Array<String>) {

    // Inputs
    val sizes = readLine()!!.split(' ').map(String::toInt)
    val inputs = readLine()!!.split(' ').map(String::toInt)

    // Check duplicates
    if (inputs.distinct().size < sizes[0]){
        print("IMPOSSIBLE")
        return
    }

    if (sizes[0] > sizes[1]){
        print("IMPOSSIBLE")
        return
    }

    val outArr = arrayOfNulls<Int>(sizes[0])
    var i = 1
    for (item in inputs){
        if (outArr[item - 1] == null)
            outArr[item - 1] = i

        i++
    }

    // Print output
    print(outArr.joinToString(" "))
}