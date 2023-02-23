# Year-11-Unit-7-ArrayLists-Tutorial-DominoPile

# Name:Amanda
# Name: Alayna

### __Part 1: Domino__

Create a class to represent a single domino.

A domino consists of 2 sides, we'll call them "top" and "bottom". Each side holds an integer representing the number of dots it has.

Create the following functions:
- Default Constructor - sets the top and bottom to 0.
- Overloading Constructor - takes in 2 integers and puts the first one into top and the second one into bottom.
- Getters
- Setters
- toString that displays the domino as a fraction (top/bottom) - Don't do actual math on this.
- flip() - switches the order of the top and bottom values.
- settle() - compares the top and bottom values and orders them so the smaller number is on top. (use flip to do this once the smaller value has been identified)
- compareTo(Domino other)
  - Compares the smallest value of each domino.
    - If this < other - return -1
    - If this > other - return 1
    - If this == other Compare the larger value of each domino
      - If this < other - return -1
      - If this > other - return 1
      - If this == other - return 0
- compareToWeight(Domino other)
  - Counts the total number of dots on each ½ of the Domino and compares it to the total number on the other domino.
    - Returns -1 if this < other
    - Returns 1 if this > other
    - Returns 0 if this == other
- canConnect(Domino other)
  - Returns true if the 2 dominos have a common value on either side, otherwise it returns false. There are 4 possible ways of having a common value.
    - this.top → other.top
    - this.top → other.bottom
    - this.bottom → other.top
    - this.bottom → other.bottom

### __Part 2: DominoPile__

This class contains 1 Instance variable: An ArrayList of Dominos called pile.

Implement the following Methods:
- Default Constructor - Sets the pile to an empty arraylist of dominos.
- newStack6() - puts in a complete set of dominoes from 0,0 to 6,6. Keep in mind that there are no repeated tiles (if there is already a 0,1, there can't be a 1,0). You must use a nested for-loop to solve this.
- shuffle() - puts the dominos in a random order within the stack.
  - Option #1 - take all the values out of the original pile in a random order and add them to a new pile. Make the original pile equal to the new pile.
  - Option #2 - loop a large number of times simply grabbing 2 random tiles at a time and swapping their places.
