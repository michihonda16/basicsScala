trait Haircolour
trait Iterator [A]{
    def hasNext : Boolean
    def next() : A 
}

class IntIterator(to : Int) extends Iterator[Int]{
    private var current = 0
    override def hasNext: Boolean = current < to
    override def next() : Int = {
        if(hasNext){
            val t = current
            current += 1
            t
        } else 0
    }
}

val iterator = new IntIterator(10)
iterator.next()
iterator.next()


import scala.collection.mutable. ArrayBuffer

trait Pet{
    val name: String
}

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet















