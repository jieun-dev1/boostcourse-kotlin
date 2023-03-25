package chap03.section1

//특징: 이름이 어디에 있든, 읽을 수 있다.

//정의할 때가 매개 변수고
fun sum(a:Int, b:Int): Int = a + b

fun sum2(a:Int, b:Int) = a + b //return 타입 안써줘도 됨.

fun max(a:Int, b:Int) = if(a > b) a else b

//Unit 리턴이 없는 형태
fun outfunc(name: String):Unit = println("Name: $name")
    //return Unit

fun main() {
    //지역 함수는 이름 선언 하기 전에 앞에 선언해야 한다
    //실제로 함수에 들어가는 것을 인자라고 한다.
    val result1 = sum(2,3)

    val a = 3
    val b = 5

    val result2 = max(a,b)
    outfunc("hel")
    println(result1)
    println(result2)

}

