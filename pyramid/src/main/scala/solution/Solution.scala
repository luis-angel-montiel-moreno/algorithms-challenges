package solution

import java.io.InputStream
import scala.io._



object Solution{

  def main(args:Array[String]): Unit = {

    //println("hi, hi!")
    val is = System.in
    val matrix: Array[Array[Int]] = loadPyramidMatrix(is)
    val result = maxPyramidPath(matrix,matrix.length)
    println("The bottom up solution is: " + result)
    val result2 = recMaxPyramidPath(matrix,matrix.length,0,0)
    println("The recursive inductive solution is: " + result2)
  }

  def loadPyramidMatrix(is: InputStream): Array[Array[Int]] = {
    val lines = Source.fromInputStream(is).getLines()

    val n = lines.next().trim.toInt
    val matrix: Array[Array[Int]] = Array.ofDim[Int](n, n)

    var nodes: Array[String] = Array.ofDim[String](n)
    var irow = 0;
    while (irow < n) {
      nodes = lines.next().split(',')
      var crow = 0;
      while (crow < nodes.length) {
        matrix(irow)(crow) = nodes(crow).trim.toInt
        crow = crow + 1
      }
      irow = irow + 1
    }
    matrix

  }

  def maxPyramidPath(matrix: Array[Array[Int]], n:Int): Int = {
    val solution: Array[Array[Int]] = Array.ofDim[Int](2, n)

    var i, j: Int = 0
    i = n - 1
    j = 0
    while (j < n) {
      solution(i%2)(j) = matrix(i)(j)
      j = j + 1
    }

    var row: Int = n - 2;
    var col: Int = 0
    while (row >= 0) {
      col = 0
      while (col < row + 1) {
        val op1 = matrix(row)(col) + solution((row + 1)%2)(col)
        val op2 = matrix(row)(col) + solution((row + 1)%2)(col + 1)
        solution(row%2)(col) = Math.max(op1, op2)
        col = col + 1
      }
      row = row - 1
    }
    solution(0)(0)
  }

  def recMaxPyramidPath(matrix: Array[Array[Int]], n: Int, row:Int, col:Int): Int = {
    if(row == n){
      0
    } else {
      val op1 = matrix(row)(col) + recMaxPyramidPath(matrix, n, row + 1, col)
      val op2 = matrix(row)(col) + recMaxPyramidPath(matrix, n, row + 1, col + 1)
      Math.max(op1, op2)
    }
  }

}

