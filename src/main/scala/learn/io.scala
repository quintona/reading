import scalaz._, Scalaz._, effect._, IO._
import java.io._

object Main extends App {
  
  /*val x = IO{}
  val y = IO{}
  val z = x.flatMap{
    y.map{
      (x,y)
    }
  }*/

  val dirInIO = IO { new File(System.getProperty("user.dir")) } 
  def filesInIO = for (dir <- dirInIO) yield dir.listFiles()
  def namesInIO = for (theFiles ← filesInIO) yield theFiles.map(_.getName())
  def printNamesInIO = for (all ← namesInIO) yield all.map(println(_))
  val result = printNamesInIO
  println("Nothings happened yet, lets go!")
  result.unsafePerformIO
}