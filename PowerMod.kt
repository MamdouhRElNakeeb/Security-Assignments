fun main(args: Array<String>) {

    // Inputs
    val inputs = readLine()!!.split(' ').map(String::toBigInteger)
    var a = inputs[0]
    var b = inputs[1]
    var c = inputs[2]

    println(a.modPow(b, c))
}