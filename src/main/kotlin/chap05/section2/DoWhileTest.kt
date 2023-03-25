package chap05.section2

fun main() {

    do {
        println("Enter the number: ")
        val input = readLine()!!.toInt()

        for(i in 0 until input) {
            for (j in 0 until input){
                print((i + j)%input + 1) // 모듈러 연산자
            }
            println()
        }
    } while (input != 0)
}