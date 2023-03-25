package chap04.section4

fun a() = b() //최상위 함수이므로, b() 함수가 나중에 선언되었더라도, 사용 가능.
fun b() = println("b") // b함수의 선언
fun c() {
//    fun d() = e()
    //오류. d() 는 지역함수기 때문에 e 가 먼저 선언 되어야.
    fun e() = println("e")
}

fun main() {
    a() // 최상위 함수는 어디서든 호출될 수 있다.
//    e()
//c 함수 내에 정의된 e() 는 c의 블록 ({})을 벗어난 곳에서 사용할 수 없음.
}