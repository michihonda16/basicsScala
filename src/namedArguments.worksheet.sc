def printName(first : String, last: String): Unit = {
    println(first + " " + last)
}

printName("John", "Smith")
printName(first = "john", "smith")
printName(last = "smith", "John")
printName(last = "smith", first = "john")

