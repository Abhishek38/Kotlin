/*===================Basic Inheritance==========*/
open class Papa{
    fun bol() {
        println("This is papa speaking")
    }
}
class child :Papa(){//inhritance is done by using ' : ' operator..

}
/*===================Basic Inheritance==========*/
open class Mummy{
    open fun bol():Unit{
        println("This is mummy speaking")
    }
}
class baccha:Mummy(){
    override fun bol():Unit{
        println("This is child speaking")

    }

}
fun main(args:Array<String>):Unit{
    var a= child().bol()
    var b=baccha().bol()
}
