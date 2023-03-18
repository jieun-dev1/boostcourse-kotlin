package chap03.section1

fun normalVarargs(vararg a:Int) {
    for (num in a) {
        print("$num ")
    }
}

fun main() {
    normalVarargs(1)
    normalVarargs(1,2,3,4)
}

//초기값을 위한 인자는 Float형
//초기값에 아무런 인자를 입력하지 않으면 0을 기본 사용
//두번째부터 받아들일 인자는 가변형 인자로 모두 실수형 Float (vararg 할당)
fun avgFunc(initial: Float=0f, vararg numbers: Float):Double {
    var result = 0f
    for(num in numbers) {
        result+=num;
    }
    println("result:$result, size:${numbers.size}")
    //초기값은 두번째 부터 나열된 인자의 최종 평균 결과에 더함
    //반환값은 모든 인자의 평균값으로 마찬가지로 실수형 Double
    val avg =  result/numbers.size + initial
    return avg.toDouble()
}

fun main2() {
    val result = avgFunc(5f, 100f, 90f, 80f)
    println("avg result: $result")
}