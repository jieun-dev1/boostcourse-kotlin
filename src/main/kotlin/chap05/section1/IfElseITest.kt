package chap05.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if (score >= 90.0){
        grade = 'A'
    } else if (score in 80.0..89.9) { //범위연산자 사용하기
        grade = 'B'
    } else if (score >=70 && score <80) {
        grade = 'C'
    }

    println("score: $score, grade: $grade")
}
