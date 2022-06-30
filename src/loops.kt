fun main(args: Array<String>) {
//    WHILE LOOP
        var countOne = 0
    while (countOne <= 5){
        println(countOne)
        countOne++
    }
//DO... WHILE LOOP
    var countTwo = 10
    do {
        println(countTwo)
        countTwo++
    }while ( countTwo <= 15)

//    REPEAT LOOP
    repeat(10){
        println("Good Morning")
    }
//    FOR IN LOOP
    var names = arrayOf("King","Faith","Shanky","Linet","Brian","Masetu")
//    names sort()
    names.sortDescending()
    for (jina in names){
        println(jina)
    }
    var ascendingNumbers = 0 ..20
    for (nambari in ascendingNumbers) {
        println(nambari)
    }
    var descendingNumber = 20 downTo 0
    for (n in descendingNumber){
        println(n)
    }


}