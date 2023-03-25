package chap02.section2

fun main() {
    var a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a+2}"//문자열에 표현식 사용
    println("str1: \"$str1\", str2: \"$str2\"")

    var b: String = "hello"
    var z: String? = null // null 이 가능하게도 선언 가능. 타입에 물음표를 붙인다. String은 null 이 불가능함. oo?은 Nullable
    println("z = $z")
}