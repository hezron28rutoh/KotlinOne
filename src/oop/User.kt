package oop

fun main(args: Array<String>) {
    var firstUser = User("Ruto", "ruto@gmail.com", "qwerty", "qwerty")
    firstUser.register()
    firstUser.login()

    var secondUser = User("eMobilis", "emobilis@gmail.com", "123456","12345" )
    secondUser.login()

}



class User {
//    these are the user properties
    var name:String
    var email:String
    var password:String
    var confirmPassword:String

    constructor(name:String, email:String, password:String, confirmPassword:String){
        this.name = name
        this.email = email
        this.password = password
        this.confirmPassword = confirmPassword
    }
    fun register(){
        if (!password.equals(confirmPassword)){
            println({"Password don't match"})
        }else{
            println("User registered successfully")
        }
    }
    fun login(){
        if (email.equals("emobilis@gmail.com") && password.equals("123456")){
            println("Login Successful")
        }else{
            println("Login Failed")
        }
    }

}