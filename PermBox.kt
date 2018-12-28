import java.math.BigInteger

fun main(args: Array<String>) {

    // Inputs
    val outSize = readLine()!!.toInt()
    val permBox = readLine()!!.split(' ').map(String::toInt)
    val permBoxSize = readLine()!!.toInt()
    val inputHex = readLine()!!.toString()

    var inputBinary = Integer.toBinaryString(java.lang.Long.parseLong(inputHex, 16).toInt())

    var zeros = ""

    // Handle left zeros
    for (i in 0 until (permBoxSize - inputBinary.length)){
        zeros += "0"
    }
    inputBinary = zeros + inputBinary

    var hexOut = ""

    for (item in permBox){
        hexOut += inputBinary[(item - 1) % inputBinary.length]
    }

    println(BigInteger(hexOut,2).toString(16).toUpperCase())
}

