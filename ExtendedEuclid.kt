import java.math.BigInteger

fun main(args: Array<String>) {

    // Inputs
    val inputs = readLine()!!.split(' ').map(String::toBigInteger)
    val m = inputs[0]
    val n = inputs[1]

    val mulInv: BigInteger
    val addInv: BigInteger

    try {
        mulInv = n.modInverse(m)
        addInv = m - n.mod(m)
    }
    catch (e: ArithmeticException){
        println("IMPOSSIBLE")
        return
    }

    print(addInv)
    print(" ")
    print(mulInv)

}