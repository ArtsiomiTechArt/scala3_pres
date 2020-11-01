package enums

object B_Enums_Dotty {
  
  enum Color(val rgb: Int) {
    case Green extends Color(0x00FF00)
    case Red   extends Color(0xFF0000)
  }

  val red = Color.Red
  val position = red.ordinal
  Color.valueOf("Red")
  Color.values

  def main(args: Array[String]): Unit = {
    println(Color.Red)
    println(Color.Red.ordinal)
    println(Color.valueOf("Red"))
    Color.values.foreach(print)
  }
  

}
