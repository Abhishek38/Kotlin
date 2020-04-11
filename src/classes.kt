

/*====================basic class operations===================*/
class Demo() {
    private var name: String = "This is legend"


    fun details(): Unit {
        println("This is a demo class i.e. $name")
    }
}

fun main(args: Array<String>): Unit {
    var data: String = "This is abhi"
    var obj = Demo()
    obj.details()
    var obj1 = Bahar()
    obj1.anderFun()
    var obj2 = Bahar.Ander()
    obj2.anderFun()
    var obj3 = outer().Inner().anderFun()
    //Inerface execution
    var blank: khali = object : khali {
        override fun foo() {
            println("Anonymous class is being executed")
        }
    }
    blank.foo()
    var objconstructor=Primaryconst("Abhishek",23)
    println("name is ${objconstructor.name} and the age is ${objconstructor.age}")
    var secconstructor=Secondaryconst("bappan",30,"Abb tak chappan")
    println("name is ${secconstructor.Firstname} and age is ${secconstructor.age} ")

}

/*=====================Nested class===========================*/
private class Bahar {
    fun anderFun(): Unit {
        println("I am inside the bahar class")
    }

    var kala = "This is kala"

    class Ander {

        fun anderFun(): Unit {
            println("I am inside the ander class ")//$kala--cannot access it here because the inner class is not been taged as inner class)
        }
    }
}

/*=====================Inner class===========================*/
//When a nested class is marked as inner class then we can access the data members of the outer class from the inner class......
private class outer {
    fun anderFun(): Unit {
        println("I am inside the bahar class")
    }

    var kala = "This is kala"

    inner class Inner {

        fun anderFun(): Unit {
            println("I am inside the ander class $kala")//can access it here because it has been taged here....
        }
    }
}

/*=====================Anonymous Inner class===========================*/
//Interfaces
interface khali {
    fun foo()
}
/*=====================Constructor===========================
* Primary constructor*/
class Primaryconst(val name:String,var age:Int){

}
/* Secondary constructor*/
class Secondaryconst(val Firstname:String,var age:Int){
    constructor(name:String,age: Int,message:String):this(name,age){
        /*this is refering here the call to the primary constructor made from the secondary constructor
        * Every secondary constructor should make a call to the primary constructor */

    }
}
