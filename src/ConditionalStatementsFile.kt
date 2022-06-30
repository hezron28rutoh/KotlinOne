fun main(args: Array<String>) {
    var age = 18
    if (age < 18){
        println("Go Home")
    }else{
        println("Welcome to the party")
    }

//    GRADING SYSTEM
            //IF STATEMENT
    var marks = 80
    if (marks < 40){
        println("E")
    }else if (marks < 50){
        println("D")
    }else if (marks < 60){
        println("C")
    }else if (marks < 70){
        println("B")
    }else{
        println("A")
    }
//    BETTING SYSTEM
    var bettingnumber = 3
    when(bettingnumber){
        1->{
            println("Oops!! You've Lost")
        }
        2-> {
            println("Oops!! You've Lost")
        }
        3-> {
            println("Congrats!! You won")
        }
        4-> {
        println("Oops!! You've Lost")
    }
        else->{
            println("Please enter a number from 1 to 4 to bet")

        }        }
}