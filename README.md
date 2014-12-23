CSci112.Lab4.java
=================

Lab #4 for CSci 112. I also taught this Lab. 

INHERITANCE

Objectives:
  - Working with inheritance.

1) In blackboard, under Lab 6, get the driver code I have provided.

2) You will need to create a Shape class that has:
  a) A private double variable for area.
  b) A public setArea for the variable.
  c) A public getArea for the variable.
  
3) You will also need to create a Square class and a Rectangle class both extend Shape, each having:
  a) A private height variable.
  b) A private width variable.
  c) A constructor that initializes the height and width and calls setArea with (height * width) as the parameters.
  d) Do not make any other methods for these classes, they only need the constructor.
  
4) The classes only need the methods I have said are needed. Square and Rectange have a"is a" relationship to Shape,          therefore they can use (have knowledge of) the methods in the Shape class.
5) In both Square and Rectangle classes, change the Constructor (don't delete code just comment out the unneded code that     called the set method) of each class so the instead of calling the setArea method in the Shape class you use the           variable area, from Shape, (do not declare a variable area in Square or Rectangle) and initialize it to equal height *     width. (You will have to do something to the area variable in Shape for this to work). Run the program and see if the      output is the same as before.
5) Create a Constructor in the Shape class that takes in a double and initializes the variable area. In the Square and        Rectangle class (these will now have errors), using the key word super in the Constructor of Square and Rectangle, call    the Constructor of the Shape class (comment out, do not delete, the one line of unneeded code that initialized area).
  
   Run the program.
