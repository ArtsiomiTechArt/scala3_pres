package safety

object A_Explicit_Nulls {

  def main(args: Array[String]): Unit = {
    val x: Int | UncheckedNull = null
    
    val out = x.toString.trim().substring(2).toLowerCase()
    println(out)
  }
  
}
