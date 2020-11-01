package enums

class A_Enums_101 {
  
  
  object Color extends Enumeration {
    val Green = Value("Green")
    val Red = Value("Red")
  }
  
  Color.withName("Green")
  
  sealed trait Color {
    def rgb: Int
  }
  
  case object Green extends Color {
    def rgb = 0x00FF00
  }
  case object Red extends Color {
    def rgb = 0xFF0000
  }

}
