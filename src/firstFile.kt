import kotlin.math.roundToInt

fun main(args : Array<String>):Unit{
    //very basic stuff------------------------------------------------
println("hello kalu")
    //var is used to initialize local variables which are mutable(that can be changed)...
 var x: Double =6.7
    var y  :Int =5
    var z:Float=4.44f
    var s1:String ="Ssjhfd"
    val final="this string is constant i.e. this variable cannot have any other input other than this"
    //val is used to declare local constant(immutable) variables

    println("this value is ${x.roundToInt().toString()} and value of y is $y")
}
fun anotherFunction():Unit{

}


