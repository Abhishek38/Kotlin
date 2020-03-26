import kotlin.math.roundToInt

fun main(args : Array<String>):Unit{
    //very basic stuff------------------------------------------------
println("hello kalu")
    //var is used to initialize local variables which are mutable(that can be changed)...
    //ONLY NUMBERS
    var d: Double =6.7 //takes 64 bits
    var y:Int =5//takes 32 bits
    var z:Float=4.44f//takes 32 bits
    var l:Long=123456789//takes 64 bits
    var b:Byte=127//takes 8 bits
    println("double value is=$d")
    println("int value is=$y")
    println("long value is=$l")
    println("byte value is=$b")
    println("float value is=$z")
    //....................................................................

    //********************************************************************
    /* characters */
    var ch:Char='a'
    var st:String ="Ssjhfd"
    val final="this string is constant i.e. this variable cannot have any other input other than this"
    //val is used to declare local constant(immutable) variables
    //....................................................................
    println("this is string st=$st and character ch=$ch with \nfinal string =$final")


    /*===============================Arrays=================================*/
    var ar:IntArray= intArrayOf(1,2,3,4,5)
    for ( a:Int in ar){
        println("Integer Array \n $a")
    }
    //.........................................................................

    /*============================Collections================================*/
   /* two types of collection
            /  \
     mutable  |  Immutable
        |     |      |
   Which can  | Which cannot
   be modified| be modified
   and has    | and does not
   Mutable in | have any prefix
   its Prefix |
    */

    val numbers: MutableList<Int> = mutableListOf(1, 6, 2,8,0,6)
    val lst:List<Int> =numbers
    val collect:MutableCollection<Int> = mutableSetOf(1,2,3,4,5)
    println(numbers.first())
    println(numbers.last())
    println(numbers.filter { it%2==0 })
    numbers.sort()
    for (j:Int in numbers)
        println(j)
        /*===========================Range=====================*/
    for (k in 1..7)
        print(k) //prints 1 to 7

    if(y in 1..10)//Equivalent of ->   if(y>=1 &&y<=10)
        print("found he number $y")





}
fun anotherFunction():Unit{

}


