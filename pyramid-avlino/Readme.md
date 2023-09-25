# The pyramid problem. 
### Author of this code is Luis Angel Montiel Moreno.


## 1. Problem Description. 

You are given a graph pyramid of numbers, that is of depth N.
e.g. Here is a pyramid of depth 3


   5
  / \\
 6   4
/ \\ / \\
2   5   5


You need to calculate the value of largest path from the root to the bottom
For the given example is would be



   5
  /  
 6   4
  \\   
2   5  5


Hence, the answer would be 16.

When considering your algorithm, please take into consideration performance and
memory. We would like this to be done in O(N). You can allocate up to N memory.
Assume the pyramid is stored as a double array:

Array()() =

Array(0) = (5)

Array(1) = (6,4)

Array(2) = (2,5,5)


## 2. The Solution.

This code is the proposed solution to the given problem.

You will find two different implementations in Solution.Scala file. 

* a. A Bottom up approach with signature _maxPyramidPath(matrix,matrix.length)_

     Being optimal since it's using a memo table as usual for Dynamic Programming. With O( n<sup>2</sup> ) complexity. 


* b. A recursive inductive approach with signature _recMaxPyramidPath(matrix,matrix.length,0,0)_
 
     Being not optimal since being recursive recomputes same function several times with exponential complexity O( 2<sup>n</sup> ).

*Note*: The purpose of having two implementations are for testing purposes. For instance, it is possible to generate in automatic way random test cases and compare them.

There are two ways to run this project. 

1. Running the main as Standard Input
2. Running the test Cases Suite.

Inputs are in resources folder respectively.

## 3. Scala project details. 

The Scala project was created with maven using the following command: 

```
mvn archetype:generate -DarchetypeGroupId=net.alchim31.maven -DarchetypeArtifactId=scala-archetype-simple
```

as described in https://docs.scala-lang.org/tutorials/scala-with-maven.html
adding the jar plugin and additional test dependencies.

In IntelliJ set up jdk, scala plugin, scala jdk, and reload the maven pom.xml. 
