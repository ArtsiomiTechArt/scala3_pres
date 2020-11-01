package type_class

object D_TypeClass_Dotty {
  
  trait SemiGroup[T]:
    extension [T](x: T) {
      def combine(y: T): T
    }

  trait Monoid[T] extends SemiGroup[T]:
    def unit: T
  


  object Givens {
    
    given Monoid[Int]:
      extension [Int](x: Int) {
        def combine(y: Int): Int = x
      }
      def unit: Int = 0
  }
  
  object Main {
    import Givens.{given _}
    
    def combineItWithoutType[T](monoid: T)(using Monoid[T]): T = {
      monoid.combine(monoid)
    }
    
    def combineItContextBound[T: Monoid](monoid: T): T = {
      monoid.combine(monoid)
    }

    combineItWithoutType(4)
    combineItContextBound(4)
  }
     

}
