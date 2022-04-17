//Blocks////////////
println({
    val x =1 + 1
    x+1
})

//Functions////////////
val addOne = (x: Int) => x + 1
println(addOne(1))

val add = (x: Int, y: Int) => x + y
println(add(1, 2))

val getTheAnswer = ()=> 42
println(getTheAnswer())

//Method////////////
def add_x_y (x: Int, y: Int): Int = x + y
println(add_x_y (1 ,2))

def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
println(addThenMultiply(2, 3)(4))

def name: String = System.getProperty("user.name")
println("Hello, " + name + "!")

def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
}
println(getSquareString(2.25))

//classes////////////
class Greeter(prefix: String, suffix: String){
    def greet(name: String): Unit =
        println(prefix + name + suffix)
}

val greeter = new Greeter ("Hello, ","!")
greeter.greet("Scala developer")

case class Point(x: Int, y:Int)

val point = Point(1,2)
val anotherPoint = Point(1,2)
val yetAnotherPoint = Point(2,2)

if (point == anotherPoint){
    println(s"$point and $anotherPoint are the same")
} else {
    println(s"$point and $anotherPoint are different")
}

if(point == yetAnotherPoint){
    println(s"$point and $yetAnotherPoint are the same")
} else {
    println(s"$point and $yetAnotherPoint are different")
}

//objects////////////   
object IdFactory {
    private var counter = 0
    def create(): Int ={
        counter += 1
        counter
    }
}

val newId: Int = IdFactory.create()
println(newId)

val newerId: Int = IdFactory.create()
println(newerId)

val newestId: Int = IdFactory.create()
println(newestId)

//traits////////////   
trait Greeter {
    def greet(name: String): Unit
}











