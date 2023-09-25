package solution

import scala.annotation.tailrec
import scala.io.Source

object Solution {

  def main(args:Array[String]): Unit = {
    val is = System.in
    val lines = Source.fromInputStream(is).getLines()
    val n = lines.next().trim.toInt
    //val n = 15
    val indexesFib = (0 to n).toSeq.map( i => fib(i))
    indexesFib.foreach( f => print(f+"  "))

    println("")

    val indexesRecFib = (0 to n).toSeq.map(i => rfib(i))
    indexesRecFib.foreach(f => print(f + "  "))

    println("")

    val indexesTailRecFib = (0 to n).toSeq.map(i => tailRecfib(1, 0, i+1) )
    indexesTailRecFib.foreach(f => print(f + "  "))

  }

  def fib(n:Int): Int = {
    if(n==0) 0
    else if(n==1) 1
    else {
      var f1 = 0
      var f2 = 1
      var fib = 0
      var i = 0
      while (i < n-1) {
        fib = f1 + f2
        f1 = f2
        f2 = fib
        i = i + 1
      }
      fib
    }
  }

  def rfib(n:Int):Int = {
    if(n==0)
      0
    else if (n==1)
      1
    else
      rfib(n-1) + rfib(n-2)
  }

  @tailrec def tailRecfib(f1: Int, f2:Int, n: Int): Int = {
     if (n == 1)
       f2
     else
       tailRecfib(f1+f2, f1 , n - 1)
  }

}

