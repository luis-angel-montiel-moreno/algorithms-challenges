# KMP Implementation
by Luis Angel Montiel Moreno. 


## Description. 
This is the Knuth-Morris-Pratt KMP String Matching Algorithm specified in [1].

Given a text T as an input string the task is to find all matching occurrences of pattern P as string in T. 

## Implementation

Observe that two methods were implemented.

i. Integer[] computePrefixFn(String P)
ii. HashSet<Integer> KMP_Matcher(String T, String P)

Where computePrefixFn(String P) is an optimized version of building an automata which also gives the longest length of prefix being also a suffix of P (see the test case).

And 

KMP_Matcher(String T, String P) returns the indexes of the occurrences of P in T. 


## References
[1] Cormen, Thomas H., Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein. Introduction to algorithms. MIT press, 2022.
