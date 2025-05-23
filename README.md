# Difference-Arrays-ArrayLists

This Java project demonstrates the differences between **arrays** and **ArrayLists** in Java.

## Purpose
To help understand:
- The static nature of arrays (fixed size)
- The dynamic and flexible nature of ArrayLists
- Syntax differences when declaring, accessing, and modifying data

## Files
- `Difference_Array_ArrayList.java` — Main source file that contains examples and comments

## Key Differences Demonstrated
| Feature         | Array                   | ArrayList                 |
|----------------|--------------------------|---------------------------|
| Size           | Fixed                    | Dynamic (can grow/shrink) |
| Syntax         | `int[] arr = new int[3];`| `ArrayList<Integer> list = new ArrayList<>();` |
| Access         | `arr[0]`                 | `list.get(0)`             |
| Modification   | `arr[1] = 5;`            | `list.set(1, 5);`         |
| Adding Elements| Not possible after init  | `list.add(10);`           |

## How to Run
1. Open in IntelliJ or any Java IDE
2. Run `Difference_Array_ArrayList.java`
3. View the console output to compare how arrays and ArrayLists behave

## Author
Jose Cadena
