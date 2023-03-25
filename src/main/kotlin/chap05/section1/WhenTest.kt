package chap05.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    //switch 역할을 한다.

    //소괄호를 쓰는 When
//    when (score) {
//        in 90.0..100.0 -> grade = 'A'
//        in 80.0..89.9 -> grade = 'B'
//        in 70.0..79.9 -> grade = 'C'
//        else -> grade = 'F'
//    }

    //인수 없는 when 의 사용 - 다양한 조건을 걸때
    when {
        score >= 90.0 -> grade = 'A' // 인자 있는 when 과 다르게 조건식을 구성할 수 있음
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }

    println("score: $score, grade: $grade")
}
