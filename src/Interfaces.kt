interface Ddemo {
    var myStr: String //abstract data member
    fun one()  //abstract method
    fun string() = println("This is string")//abstract function with default value


}

class Implementation : Ddemo {
    override var myStr: String = "This is the one"
    override fun one() {
        println("this is lion sin escanor")

    }
}
interface A{
    fun escanor(){
        println("this is Lion sin")
    }

}
interface B {
    fun Aqua() {
        println("The dumb godess")
    }

}
class multipleInheritance:A,B{}
fun main(args:Array<String>):Unit{
    var obj=Implementation()
    print("the message displayed by the interface is ${obj.myStr} i.e ")
    obj.one()
    obj.string()
    var obj2=multipleInheritance()
    obj2.escanor()
    obj2.Aqua()


}