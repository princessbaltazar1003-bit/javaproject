package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<String> Names = new ArrayList<String>();

        // Add names
        Names.add("Arnel");
        Names.add("Bianca");
        Names.add("Jame");
        Names.add("Ivy");
        Names.add("Camilla");
        Names.add("Anna");

        System.out.println(Names);
        System.out.println("Total Names are " + Names.size());

        // Remove Anna
        System.out.println("Remove Anna");
        Names.remove(5);   // removes Anna
        System.out.println(Names);
        System.out.println("Total Names are " + Names.size());

        // Update Ivy
        System.out.println("Update Ivy");
        Names.set(3, "Ivy Joy"); // updated name
        System.out.println(Names);

        // Validate Anna is not there in the list
        if (Names.contains("Anna")) {
            System.out.println("Anna is still present in the list");
        } else {
            System.out.println("Anna is not present in the list");
        }

        // Sort the names
        Collections.sort(Names);
        System.out.println("After sorting the names");
        System.out.println(Names);

        // Print all the names using for-each loop
        for (String Name : Names) {
            System.out.println(Name);
        }

        // Add one more Jame
        Names.add("Jame");
        System.out.println(Names);
    }
}
