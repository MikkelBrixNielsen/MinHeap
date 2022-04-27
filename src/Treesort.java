//Mikkel Brix Nielsen (mikke21)
//Nicolai Larsen (dalar21)
//Steffen Bach (stbac21)

import java.util.Scanner;
import java.util.ArrayList;

public class Treesort {
    public static void main(String[] args) {
        DictBinTree tree = new DictBinTree(); //makes new tree
        Scanner scanner = new Scanner(System.in); //initializes scanner
        while ( scanner.hasNextInt() ) { //continously checks if another int is available
            tree.insert(scanner.nextInt()); //inserts next integer into tree
        }
        System.out.println(                                               ); //prints a new line
        tree.orderedTraversal().forEach(System.out::println); //prints each element of arraylist
    }
}
