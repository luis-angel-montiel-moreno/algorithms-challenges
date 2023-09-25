import org.scalatest.FunSuite
import org.scalatest.Matchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.io.Source

import solution.Solution

@RunWith(classOf[JUnitRunner])
class SolutionTest extends FunSuite with Matchers {

  test("Test Bottom Up Sample Case.") {
    val is = getClass.getClassLoader
      .getResourceAsStream("input_sample.in")

    val matrix: Array[Array[Int]] = Solution.loadPyramidMatrix(is)
    val result = Solution.maxPyramidPath(matrix, matrix.length)

    result should be (16)

  }

  test("Test Bottom Up Input To Solve.") {
    val is = getClass.getClassLoader
      .getResourceAsStream("input_to_solve.in")

    val matrix: Array[Array[Int]] = Solution.loadPyramidMatrix(is)
    val result = Solution.maxPyramidPath(matrix, matrix.length)

    result should be(34)

  }

  test("Test Recursive Inductive Sample Case.") {
    val is = getClass.getClassLoader
      .getResourceAsStream("input_sample.in")

    val matrix: Array[Array[Int]] = Solution.loadPyramidMatrix(is)
    val result = Solution.recMaxPyramidPath(matrix, matrix.length,0,0)

    result should be(16)

  }

  test("Test Recursive Inductive Input To Solve.") {
    val is = getClass.getClassLoader
      .getResourceAsStream("input_to_solve.in")

    val matrix: Array[Array[Int]] = Solution.loadPyramidMatrix(is)
    val result = Solution.recMaxPyramidPath(matrix, matrix.length,0,0)

    result should be(34)

  }


  test("Test Bottom Up against Recursive Inductive: Sample Input To Solve.") {
    val is = getClass.getClassLoader
      .getResourceAsStream("input_sample.in")

    val matrix: Array[Array[Int]] = Solution.loadPyramidMatrix(is)
    val expected = Solution.recMaxPyramidPath(matrix, matrix.length, 0, 0)
    val actual = Solution.maxPyramidPath(matrix, matrix.length)

    assert(actual==expected)

  }


  test("Test Bottom Up against Recursive Inductive: Input To Solve.") {
    val is = getClass.getClassLoader
      .getResourceAsStream("input_to_solve.in")

    val matrix: Array[Array[Int]] = Solution.loadPyramidMatrix(is)
    val expected = Solution.recMaxPyramidPath(matrix, matrix.length, 0, 0)
    val actual = Solution.maxPyramidPath(matrix, matrix.length)

    assert(actual == expected)

  }


}



