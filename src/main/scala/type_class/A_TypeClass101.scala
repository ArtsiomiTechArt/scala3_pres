package type_class

object A_TypeClass101 {

  implicit class RichInt(i: Int) extends AnyVal {
    def triple = i * 3
  }
























  //--------------

  trait MathOps[T] {
    def plus(x: T, y: T): T
    def divide(x: T, y: Int): T
  }

  object implicits {
    implicit object MathOpsDouble extends MathOps[Double] { // Given
      def plus(x: Double, y: Double): Double = x + y
      def divide(x: Double, y: Int): Double = x / y
    }
  }

  object Main {
    def mean[T](xs: List[T])(implicit ops: MathOps[T]): T = { //Using
      ops.divide(xs.reduce(ops.plus(_, _)), xs.size)
    }
  }

}
