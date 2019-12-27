fun main(args: Array<String>) {

    // Inputs
    val inputs = readLine()!!.split(' ')
    val a = inputs[0].toInt(16)
    val b = inputs[1].toInt(16)

    print(handleLeftZeros((a xor b).toString(16)).toUpperCase())
    print(" ")
    print(multiply(a, b))

}

fun multiply(p1: Int, p2: Int): String {

    var result = 0
    var x = p1
    var y = p2

    while (y > 0){
        if(y % 2 == 1)
            result = modulus(result xor p1)

        y = y.shr(1)
        x = x.shl(1)
        x = modulus(x)
    }

    return handleLeftZeros(result.toString(16)).toUpperCase()
}

// performs modulus operation by GF(2^8)
fun modulus(mod: Int): Int {
    var m = mod
    if (m < 256)
        return m

    m = m xor 283
    return m
}

private fun handleLeftZeros(string: String) : String{
    var zeros = ""

    for (i in 0 until (2 - string.length))
        zeros += "0"

    return zeros + string
}