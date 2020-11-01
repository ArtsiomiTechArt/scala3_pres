package type_class

trait Exts {
  extension (i: Int) {
    def triple: Int = i * 3
  }

  extension [T](list: List[T]) {
    def second: T = list.tail.head
  }
}

object Extensions {
  
  given intOps as Exts
  
  @main def run() = {
    val i: Int = 5
    println(i.triple)

    val listInt: List[Int] = (1 to 5).toList
    println(listInt.second)
  }

}