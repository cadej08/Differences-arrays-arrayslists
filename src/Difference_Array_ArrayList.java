import java.util.ArrayList;

public class Difference_Array_ArrayList {
    public static void main(String[] args) {

        // ----------- ARRAY EXAMPLE -----------
        /*array holds a fixed number of values of the same type*/

        int[] numbersArray = new int[3]; /*created and array that holds 3 integers*/

        /*assigned values to the integers*/
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;

        /* prints array values using a loop*/
        System.out.println("Array elements:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("Index " + i + ": " + numbersArray[i]);
        }

        /* arrays cannot grow, if we try to add anything else we will get an error message*/
        /* example if we add another array: numbersArray[3] = 40; (would cause an error!)*/


        /* arrayList is flexible it can grow or shrink as needed.*/


        ArrayList<Integer> numbersList = new ArrayList<>();

        /*added elements to arraylist*/
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40); /*if we wanted we could continue to add more*/

        /*prints arraylist value in a loop*/
        System.out.println("\nArrayList elements:");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.println("Index " + i + ": " + numbersList.get(i));
        }

        /*removed element @ index 1 from arraylist*/
        numbersList.remove(1);

        /* prints updated arraylist*/
        System.out.println("\nArrayList after removing index 1:");
        System.out.println(numbersList);

        /*summary*/
        System.out.println("\nSummary of Differences:");
        System.out.println("- Arrays have a fixed size. You cannot add more items once it's full.");
        System.out.println("- ArrayLists can grow and shrink. You can add and remove items easily.");
        System.out.println("- Arrays can store simple types like int, char, etc.");
        System.out.println("- ArrayLists store objects (like Integer, String, etc.)");
        System.out.println("- ArrayLists have helpful built-in methods like add() and remove().");
    }
}
