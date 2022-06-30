fun main(args: Array<String>) {
    motto()
    userVerification("King Wanyama", "kingwanyama@gmail.com")
    average(52.3,45,85.2f)
    println(addition(43,55.4))
    login("Hezron")
    login("hezron28rutoh@gmail.com","12345678")
}
fun motto(){
    println("Hard work begat success")
}
fun userVerification(username:String, email:String) {
    println("Your username is $username and your email is $email")
}
fun average(x:Double,y:Int,z:Float){
    var results = (x + y + z)/3.0
    println("Hello your average is $results")
}
fun addition(x:Int,y:Double):Double{
    var answer = x + y
    return answer
}
fun login(name:String){
    println("Hello, your name is $name")
}
fun login(email:String,password:String){
    println("Hello, your email is $email and your password is $password")
}