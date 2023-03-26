package chap06.section4

fun main() {
    data class Person(var name: String, var skills: String)
    val person = Person("Kildong", "Kotlin")

    //여기서의 this 는 person 객체를 가리킴
    //also는 {it.skills = "Java"} 처럼 it 으로 받고 생략할 수 없음.
    person.apply { this.skills = "Swift" }
    println(person)

    val returnObj = person.apply {
        name = "Sean" //this 는 생략 가능
        skills = "Java" //this 없이 객체의 멤버에 여러 번 접근
    }

    //Run
    val returnObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success" // returnObj2 에 들어갈 수 있음.
    }

    println(person)
    println(returnObj)
    println(returnObj2)
}

