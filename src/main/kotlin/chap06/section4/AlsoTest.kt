package chap06.section4

import java.io.File

fun main() {
    data class Person(var name: String, var skills: String)
    val person = Person("Kildong", "Kotlin")

    val a = person.also {
        //it으로 복사 시, 객체의 참조가 온다.
        it.skills = "Java"
        "Success" //마지막 식은 반환된다
    }

    println("a $a")
    println("Person $person")
    println(makeDir("path"))
    println(makeDir2("path"))

}

//기존의 디렉터리 생성 함수
fun makeDir(path: String): File {
    val result = File(path)
    result.mkdirs()
    return result
}

//let과 also 를 통해 개선된 함수
//let은 식의 결과를 반환하고 그 결과인 it 이 다시 also 를 통해 넘어감.
//이때 mkdirs() 까지 한 결과가 아닌, 넘어온 result 만 반환.
fun makeDir2(path: String) = path.let{ File(it) }.also{ it.mkdirs()}
