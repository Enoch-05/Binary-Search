//Find an item in the one dimensional array myList, then if present, count how many of that item exists.
//Then output the item and its frequency. Write this program as a procedure.
import java.util.Scanner;
public class BinarySearch {
    private static int item;
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        System.out.println("Please enter the item to be found.");
        item = myObj.nextInt();
        Find();
    }
    public static void Find(){

        int [] myList = new int [] {0, 1, 6, 10, 11, 20, 23, 78, 90, 100};
        int upperBound = 9;
        int lowerBound = 0;
        int index;
        boolean Found = false;

        index = (lowerBound + upperBound)/2;

        while (lowerBound <= upperBound){
            if (myList[index] < item){
                lowerBound = index + 1;
            } else if (myList[index] == item ) {
                Found = true;
                break;
            } else {
                upperBound = index - 1;
            }
            index = (lowerBound + upperBound)/2;
        }

        if (Found){
            System.out.println("The item, " + item + ", was found.");
        } else{
            System.out.println("The item, " + item + ", was not found.");
        }
    }
}