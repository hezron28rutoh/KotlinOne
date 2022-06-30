fun main(args: Array<String>) {
    var marks = 40
    var results = if (marks < 50){
        "E"
    }else if (marks < 60){
        "D"
    }else if (marks < 70){
        "C"
    }else if (marks < 80){
        "B"
    }else{
        "A"
    }
println(results)

    var bettingNumber = 2
    var BettingResults = when(bettingNumber){
        1->{
            "Oops!! You Lost"
        }
        2->{
            "Congrats! You Won"
        }
        3->{
            "Oops!! You Lost"
        }
        4->{
            "Oops!! You Lost"
        }
        else->{
            "Please enter a number from 1-4"
        }
    }
    print(BettingResults)

}