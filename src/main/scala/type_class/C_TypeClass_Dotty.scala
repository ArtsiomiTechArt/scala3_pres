package type_class

import type_class.C_TypeClass_Dotty.MathOps

import scala.language.implicitConversions

object C_TypeClass_Dotty {

  trait MathOps[T] {
    def plus(x: T, y: T): T
    def divide(x: T, y: Int): T
  }

  object Givens {
    given MathOps[Double] {
      def plus(x: Double, y: Double): Double = x + y
      def divide(x: Double, y: Int): Double = x / y
    }
    
    given intMath as MathOps[Int] {
      def plus(x: Int, y: Int): Int = x + y
      def divide(x: Int, y: Int): Int = x / y
    }
  }

  object DottyTypeClasses {
    
    //import Givens.{given  MathOps[?]}
    //import Givens.{given  MathOps[Double]}
    import Givens.{given _}
    
    //import Givens.intMath
    
    def mean[T](xs: List[T])(using ops: MathOps[T]): T = {
      ops.divide(xs.reduce(ops.plus(_, _)), xs.size)
    }

    println(
      mean(List[Double](1d, 2d, 3d))
    )
  }

}
