# HomeWorkSort
># TASK 1
## Solve the tasks:

### Implement direct  *selection sorting, bubble sorting and insertion sorting* for an array of characters:
____________________________________________________________________________________________________

`(char[] array = new char[];)`

Task Solving Memo:
__________________

1. Read the task condition several times.
2. Create an algorithm for solving a problem with several data sets (for example, integers and real numbers, sets with negative numbers, etc.).
3. Pay attention to the maximum allowable values.
4. Try to simplify the algorithm (if possible and understand how to do it)Simplify the algorithm (you can use pseudocode).
5. Write code in Java. Use comments.
6. Test the code using several input data sets in accordance with paragraph 2 and make sure that the written code is working properly.
7. The task is considered solved if the year was completed successfully in accordance with the condition and the output parameters correspond to the input parameters.
8. Place the solved task in an open Git repository.

># Task2
## Implement direct selection sorting, bubble sorting and insertion sorting for an array of strings:

`(String[] array = new String[];)`
Java does not use the operators >, < to compare objects. To find out which of the strings is lexicographically larger or smaller than the other, you need to call the compareTo method.
_________

For example:

String str1 = "Ivanov";

String str2 = "Petrov";

String str3 = "Ivanov";

System.out.println(str1.compareTo(str2));

// the expression str1.compareTo(str2) will return an integer value less than zero, because string str1 (Ivanov) is lexicographically smaller than string str2 (Petrov)

System.out.println(str2.compareTo(str1));

// the expression str2.compareTo(str1) will return an integer value greater than zero, because string str2 (Petrov) is lexicographically larger than string str1 (Ivanov)

System.out.println(str1.compareTo(str3));

// the expression str1.compareTo(str3) will return an integer value equal to zero, because string str1 (Ivanov) is lexicographically equal to string str3 (Ivanov)

Task Solving Memo:
___

1. Read the task condition several times.
2. Create an algorithm for solving a problem with several data sets (for example, integers and real numbers, sets with negative numbers, etc.).
3. Pay attention to the maximum allowable values.
4. Try to simplify the algorithm (if possible and understand how to do it)Simplify the algorithm (you can use pseudocode).
5. Write code in Java. Use comments.
6. Test the code using several input data sets in accordance with paragraph 2 and make sure that the written code is working properly.
7. The task is considered solved if the year was completed successfully in accordance with the condition and the output parameters correspond to the input parameters.
8. Place the solved task in an open Git repository.
