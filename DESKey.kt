private val pc1 = arrayOf(57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4)
private val pc2 = arrayOf(14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10, 23, 19, 12, 4, 26, 8, 16, 7, 27, 20, 13, 2, 41, 52, 31, 37, 47, 55, 30, 40, 51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32)
private val rotations = arrayOf(1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1)

fun main(args: Array<String>) {

    // Input
    val keyHex = readLine()!!.toString()

    val keyBinary = getKey(keyHex)

    val permOut = permutation(pc1.toIntArray(), keyBinary)

    var keyLeft = permOut.substring(0, 28)
    var keyRight = permOut.substring(28, 56)

    for (i in 0 until 16){
        keyLeft = keyLeft.substring(rotations[i], 28) + keyLeft.substring(0, rotations[i])
        keyRight = keyRight.substring(rotations[i], 28) + keyRight.substring(0, rotations[i])

        val outKey = permutation(pc2.toIntArray(), keyLeft + keyRight).toBigInteger(2).toString(16).toUpperCase()

        for (i in 0 until 12 - outKey.length)
            print("0")
        println(outKey)
    }
}

private fun getKey(keyHex: String) : String{

    // Split hex to 4 parts and convert to binary
    val keyBinary1 = Integer.toBinaryString(java.lang.Long.parseLong(keyHex.substring(0, 4), 16).toInt())
    val keyBinary2 = Integer.toBinaryString(java.lang.Long.parseLong(keyHex.substring(4, 8), 16).toInt())
    val keyBinary3 = Integer.toBinaryString(java.lang.Long.parseLong(keyHex.substring(8, 12), 16).toInt())
    val keyBinary4 = Integer.toBinaryString(java.lang.Long.parseLong(keyHex.substring(12, 16), 16).toInt())

    return handleLeftZeros(keyBinary1, 16) + handleLeftZeros(keyBinary2, 16) + handleLeftZeros(keyBinary3, 16) + handleLeftZeros(keyBinary4, 16)
}

private fun permutation(array: IntArray, input: String) : String {

    var out = ""
    var index = 1
    for (i in array){
        for (j in input){
            if (i == index){
                out += j
                break
            }
            index++
        }
        index = 1
    }

    return out
}

private fun handleLeftZeros(string: String, length: Int) : String{
    var zeros = ""

    for (i in 0 until (length - string.length))
        zeros += "0"

    return zeros + string
}