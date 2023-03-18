package chapter2.section3

fun main() {
    var str1: String?
    str1 = null
    //분기를 하는 방법
    var len = str1?.length ?: -1
    println("str1: $str1, length: $len")

}