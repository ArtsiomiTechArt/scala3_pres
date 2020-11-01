package type_class

import scala.language.implicitConversions

object E_ImplicitConversions {
  
  case class Token(s: String)
  
  //old
  //implicit def stringToToken(s: String): Token = Token(s)
  
  object Givens {
    given strToToken as Conversion[String, Token] = Token(_)
  }
  
  import Givens.{given _}
  
  def getTokenValue(token: Token) = token.s
  
  getTokenValue("String")

}
