object Q2 {
  def countLetterOccurrences(words: List[String]): Int = {
    val length: List[Int] = words.map(_.length)
    length.reduce(_+_)
  }
  def main(args: Array[String]): Unit = {
    val input = List("apple", "banana", "cherry", "date")

    print("Total count of letter occurrences:")
    println(countLetterOccurrences(input))
  }
}