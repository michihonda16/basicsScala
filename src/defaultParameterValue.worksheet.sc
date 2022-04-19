def log(message : String, level : String = "INFO") =println(s"$level: $message")
log("System starting")
log("User not found", "WARNING")

class Point(val x: Int = 0, val y: Int = 0){
    override def toString : String = 
        s"($x, $y)"
}
val point1 = new Point(1,1)

