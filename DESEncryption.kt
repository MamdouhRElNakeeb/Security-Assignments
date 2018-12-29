private val boxes = arrayOf(
    arrayOf(
        arrayOf(14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7),
        arrayOf(0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8),
        arrayOf(4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0),
        arrayOf(15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13)
    ),
    arrayOf(
        arrayOf(15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10),
        arrayOf(3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5),
        arrayOf(0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15),
        arrayOf(13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9)
    ),
    arrayOf(
        arrayOf(10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8),
        arrayOf(13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1),
        arrayOf(13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7),
        arrayOf(1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12)
    ),
    arrayOf(
        arrayOf(7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15),
        arrayOf(13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9),
        arrayOf(10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4),
        arrayOf(3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14)
    ),
    arrayOf(
        arrayOf(2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9),
        arrayOf(14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6),
        arrayOf(4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14),
        arrayOf(11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3)
    ),
    arrayOf(
        arrayOf(12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11),
        arrayOf(10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8),
        arrayOf(9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6),
        arrayOf(4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13)
    ),
    arrayOf(
        arrayOf(4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1),
        arrayOf(13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6),
        arrayOf(1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2),
        arrayOf(6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12)
    ),
    arrayOf(
        arrayOf(13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7),
        arrayOf(1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2),
        arrayOf(7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8),
        arrayOf(2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11)
    )
)
private val expansion = arrayOf(32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 13, 14, 15, 16, 17, 16, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1)
private val straight = arrayOf(16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25)
private val pc1 = arrayOf(57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4)
private val pc2 = arrayOf(14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10, 23, 19, 12, 4, 26, 8, 16, 7, 27, 20, 13, 2, 41, 52, 31, 37, 47, 55, 30, 40, 51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32)
private val rotations = arrayOf(1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1)
private val initialPerm = arrayOf(58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7)
private val inverseInitialPerm = arrayOf(40, 8, 48, 16, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27, 34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25)

fun main(args: Array<String>) {

    // Inputs
    val keyHex = readLine()!!.toString()
    val inputHex = readLine()!!.toString()
    val reps = readLine()!!.toInt()

    val keys = getKeys(keyHex)

    var msg = inputHex

    for (i in 0 until reps){
        msg = encrypt(msg, keys)
    }

    print(msg)
}

private fun encrypt(msg: String, keys: Array<String>) : String {

    val permOut = permutation(initialPerm.toIntArray(), hexToBinary(msg))

    var msgLeft = permOut.substring(0, 32)
    var msgRight = permOut.substring(32, 64)

    for (i in 0 until 16){

        val temp = msgRight

        msgRight = DES(keys[i], msgRight)
        msgRight = getXOR(msgRight, msgLeft)
        msgLeft = temp
    }

    // Swapping
    msgLeft = msgRight.also { msgRight = msgLeft }

    return binaryToHex(permutation(inverseInitialPerm.toIntArray(), msgLeft + msgRight))
}

private fun getKeys(keyHex: String) : Array<String> {

    val keys = Array(16) {""}
    val keyBinary = hexToBinary(keyHex)

    val permOut = permutation(pc1.toIntArray(), keyBinary)

    var keyLeft = permOut.substring(0, 28)
    var keyRight = permOut.substring(28, 56)

    for (i in 0 until 16){
        keyLeft = keyLeft.substring(rotations[i], 28) + keyLeft.substring(0, rotations[i])
        keyRight = keyRight.substring(rotations[i], 28) + keyRight.substring(0, rotations[i])

        val outKey = permutation(pc2.toIntArray(), keyLeft + keyRight).toBigInteger(2).toString(16).toUpperCase()

        keys[i] = handleLeftZeros(outKey, 12)
    }

    return keys
}

private fun DES(keyHex: String, input: String) : String {

    val inputBinary = permutation(expansion.toIntArray(), input)
    val keyBinary = hexToBinary(keyHex)

    val xorRes = getXOR(inputBinary, keyBinary)

    var hexPerm = ""

    for (i in 0 until 8){

        val str = xorRes.substring(i * 6, i * 6 + 6)
        val row = ("" + str[0] +  str[5]).toInt(2).toString(10).toInt()
        val col = str.substring(1, 5).toInt(2).toString(10).toInt()

        hexPerm += decimalToHex(boxes[i][row][col].toString())

    }

    val binaryPerm = handleLeftZeros(hexToBinary(hexPerm), hexPerm.length * 4)

    return permutation(straight.toIntArray(), binaryPerm)
}

private fun getXOR(input1: String, input2: String) : String {
    val result = (input1.toBigInteger(2) xor input2.toBigInteger(2)).toString(2)
    return handleLeftZeros(result, input1.length)
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

private fun hexToBinary(hex: String) : String {
    return handleLeftZeros(hex.toBigInteger(16).toString(2), hex.length * 4)
}

private fun binaryToHex(binary: String) : String {
    return handleLeftZeros(binary.toBigInteger(2).toString(16).toUpperCase(), 16)
}
private fun decimalToHex(decimal: String) : String {
    return decimal.toBigInteger(10).toString(16).toUpperCase()
}