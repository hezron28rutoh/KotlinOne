package oop

fun main(args: Array<String>) {
    var firstAdmin = Admin("king",8900000.0, "king@gmail.com")
    firstAdmin.registerUser()
    println(firstAdmin.salary)
    firstAdmin.setPhoneNumber("0774544545")
    println(firstAdmin.getPhoneNumber())


}

class Admin {
    var name:String
    var salary:Double
    var email:String
    private var phoneNumber:String = ""
    private var idNumber:String = ""

    constructor(name:String, salary:Double, email:String){
        this.name = name
        this.salary = salary
        this.email = email
    }
    fun registerUser(){
        println("Yeah, I can register User")
    }
    fun suspendEmployee(){
        println("I can suspend user")
    }
    fun setPhoneNumber(phoneNumber:String){
        this.phoneNumber = phoneNumber
    }
    fun getPhoneNumber():String{
        return this.phoneNumber
    }
    fun setIdNumber(idNumber:String){
        this.idNumber = idNumber
    }
    fun getIdNumber():String{
        return this.idNumber
    }


}

