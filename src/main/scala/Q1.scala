object Q1 {
  def toFahrenheit(a: Double): Double = {
    (a * 9/5) + 32
  }
  def calculateAverage(temp: List[Double]): Double = {
    val fValue: List[Double] = temp.map(toFahrenheit)
    val sum= fValue.reduce(_ + _)
    sum/fValue.length
  }

  def main(args: Array[String]): Unit = {
    val input: List[Double] =  List(0, 10, 20, 30)
    print("Average Fahrenheit temperature:")
    println(calculateAverage(input))
  }
}