fun main(args: Array<String>) {

    // Inputs
    val inputs = readLine()!!.split(' ').map(String::toBigInteger)
    val x = inputs[0]
    val y = inputs[1]

    print(x.gcd(y))
}