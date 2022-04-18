import java.lang.reflect.Constructor
class User 
val user1 = new User

class Point(var x : Int, var y : Int){
    def move(dx: Int, dy: Int): Unit = {
        x = x + dx
        y = y + dy
    }
    override def toString : String = 
        s"($x, $y)"
}

val point1 = new Point(2, 3)
println(point1.x)
println(point1)

class Constructor (var x: Int = 0, var y: Int = 0)

val origin = new Constructor
val constructor1 = new Constructor(1)
println(constructor1.x)
println(constructor1.y)

val constructor2 = new Constructor(y = 2)
println(constructor2)


