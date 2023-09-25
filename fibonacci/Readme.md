# The Fibonacci Interview Problem. 
### Author of this code is Luis Angel Montiel Moreno.


## 1. Interview Problem Description. 

Given n as input
Generate as output the fibonacci sequence until n numbers.

E.g.

 0  1  1  2  3  5  8  13  21 ....


## 2. The Solution.

This code is the proposed solution to the given problem.

You will find three different implementations in Solution.Scala file. 

* a. A linear no memory approach with signature _fib(n:Int)_

     Being optimal since it's not using a memo table as usual for Dynamic Programming. With O( n ) complexity.
     
     However the use of memo table is better for handling several queries in O(1) once the table is computed in O(n) complexity.    


* b. A recursive inductive approach with signature _rfib(n:Int)_
 
     Being not optimal since being recursive recomputes same function several times with exponential complexity O( 2<sup>n</sup> ).
     
     E.g. Expanding the recursive tree rf(8) computes same function in exponential way.

  
       rf(8)

       --- rf(7)

       ------ rf(6)

       ------ rf(5)

       --- rf(6)

       -------rf(5)

       -------rf(4)




* c. A tail recursive inductive approach with signature _tailRecfib(f1: Int, f2:Int, n: Int)_
     
     which must be called as 
 
     _tailRecfib(1, 0, n+1)_


There are two ways to run this project. 

1. Running the main as Standard Input
2. Running the test Cases Suite.


## 3. Scala project details. 

The Scala project was created with maven using the following command: 

```
mvn archetype:generate -DarchetypeGroupId=net.alchim31.maven -DarchetypeArtifactId=scala-archetype-simple
```

as described in https://docs.scala-lang.org/tutorials/scala-with-maven.html
adding the jar plugin and additional test dependencies.

In IntelliJ set up jdk, scala plugin, scala jdk, and reload the maven pom.xml. 
