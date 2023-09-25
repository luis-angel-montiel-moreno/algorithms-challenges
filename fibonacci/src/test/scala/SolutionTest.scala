import org.scalatest.FunSuite
import org.scalatest.Matchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import solution.Solution



@RunWith(classOf[JUnitRunner])
class SolutionTest extends FunSuite with Matchers {

  test("Test Linear Fibonacci Case.") {
    val n = 15
    val actualFib = (0 to n).toSeq.map(i => Solution.fib(i).toString).mkString("  ")
    println(actualFib)


    actualFib should be ("0  1  1  2  3  5  8  13  21  34  55  89  144  233  377  610")

  }

  test("Test Recursive Fibonacci Case.") {
    val n = 15
    val actualFib = (0 to n).toSeq.map(i => Solution.rfib(i).toString).mkString("  ")
    println(actualFib)


    actualFib should be("0  1  1  2  3  5  8  13  21  34  55  89  144  233  377  610")

  }

  test("Test Tail Recursive Fibonacci Case.") {
    val n = 15
    val actualFib = (0 to n).toSeq.map(i => Solution.tailRecfib(1, 0, i + 1).toString).mkString("  ")
    println(actualFib)

    actualFib should be("0  1  1  2  3  5  8  13  21  34  55  89  144  233  377  610")

  }


}



