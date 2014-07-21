import scalaz._, Scalaz._, effect._, IO._

object EitherMain extends App {

	val v = "test".left[Int]

	println(v)
}