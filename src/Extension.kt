/*Through Extension method we can declare methods of a particular class even outside its scope */

class goku{
    var trans="Super saiyan"
    fun transformation():Unit{
        println(trans)
    }
}
fun main(args:Array<String>){
   var g1= goku()
    g1.trans="super saiyan 2"

   var g2= goku()
    g2.trans="super saiyan 3"
    var g3= goku()
    g3.trans=g1.powerup(g2)
    g3.transformation()
    Basic.readme()//calling with the name of a class like a static object of a class in java

}
fun goku.powerup(arg:goku):String{ //this method of class goku is declared outside its scope
    var g=goku()
    g.trans=this.trans +" powered up to "+arg.trans
    return g.trans

}
/*=================================OBJECT EXTENTION===================*/
class Basic(){
    companion object{
        fun readme(){
            println("hey there")
        }
    }
}