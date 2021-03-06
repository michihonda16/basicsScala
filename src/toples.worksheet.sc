val ingredient = ("Sugar", 25)
println(ingredient)
println(ingredient._1)
println(ingredient._2)

val (name, quantity) = ingredient
println(name)
println(quantity)

/////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////

val planets = 
    List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6), ("Mars", 227.4), ("Jupiter", 778.3))
planets.foreach{
    case("Earth", distance) =>
        println(s"Our planet is $distance million kilometers from the the sun")
    case(planets_name, distance) =>
        println(s"$planets_name is $distance million kilometers from the the sun")
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
val numPairs = List((2, 5), (3, -7), (20, 56))
for ((a,b) <- numPairs){
    println(a * b)
}
