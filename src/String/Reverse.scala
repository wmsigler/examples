package String

object Reverse extends App {
  val string = "Reverse this string!"
  println("Original: " + string)

  val reversedString = string.reverse
  println("Standard: " + reversedString)

  val reversedManual = (for (i <- string.length - 1 to 0 by -1) yield string(i)).mkString
  println("  Manual: " + reversedManual)
}
