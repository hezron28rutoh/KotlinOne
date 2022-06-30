package oop

fun main(args: Array<String>) {
    var firstStudent = Student("Faith", 30)
    firstStudent.viewResults()

    var firstBoardMember = BoardMember("Linet", 105)
    firstBoardMember.publishMagazine()
}


open class Teacher(open var name:String, open var age:Int) {
    fun viewResults(){
        println("Hello $name, you can view results")
    }
    fun publishMagazine(){
        println("Hello $name, you are $age years and you can publish a magazine")
    }
}
open class Student(name:String, age:Int):Teacher(name,age){
    fun sitForExam(){
        println("Hello, I can sit for Exam")
    }
}
class BoardMember(name:String, age:Int):Student(name,age){

}