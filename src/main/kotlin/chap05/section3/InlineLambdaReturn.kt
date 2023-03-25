package chap05.section3

fun main() {
    retFunc()
}

//인라인(inline)으로 선언되지 않은 람다식 함수에서 return을 사용할 때는 그냥 사용할 수 없습니다.
//return@label과 같이 라벨(label) 표기와 함께 사용해야 합니다

fun inlineLambda(a:Int, b:Int, out: (Int, Int) -> Unit) {
    out(a,b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{
        a, b ->
        val result = a+b
        if(result > 10) return@lit
        //라벨을 걸어주면, end 가 찍힘.
        println("result: $result")
    }
    println("end of retFunc")
}
