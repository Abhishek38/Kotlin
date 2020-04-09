
fun main(args: Array<String>):Unit{
    ifesle(6)
    When(3)
    WhenAnother(2)
    DoWhile(10)
    println("The value after the change is ${tripleMe(10)}")
    brkAndContinue();





}
/*=====================If-Else==============================*/
fun ifesle(i:Int):Unit{
    if (i in 1..10)
        println("value is in range")
    else
        println("value out of range")

}
/*=====================(When = switch)=============================*/
fun When(i:Int):Unit{
    when(i){
        1->println("==$i")
        2->println("==$i")
        else->{
            println("i is neither 1 or 2")
        }
    }
}
/*=====================When==============================*/
fun WhenAnother(i:Int):Unit {
    when (i) {
        1, 2 -> println("==$i")

        else -> {
            println("i is neither 1 or 2")
        }
    }
}
/*=====================When==============================*/
fun DoWhile( i:Int):Unit{
    var x=i
    do{
        x+=10
        println("Value is ==$x inside the do while loop")
    }while (x<100)
}
fun tripleMe(i:Int):Int =3*i;

fun brkAndContinue():Unit{
    myTag@ for (i in 1..10){
        if (i==6){
            println("inside the if statement with the value = $i\n hence it will be breaking the for loop")
        break@myTag}
        else{
            println("inside the else statement with value =$i")
            continue@myTag
        }
    }
}
