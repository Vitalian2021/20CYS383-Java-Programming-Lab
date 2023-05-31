import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> u21cys = new ArrayList<String>();
        ArrayList<Integer> rollno = new ArrayList<>();

        rollno.add(3);
        rollno.add(5);
        rollno.add(7);
        rollno.add(9);


        u21cys.add("CB.EN.U4CYS22026");
        u21cys.add("CB.EN.U4CYS22027");
        u21cys.add("CB.EN.U4CYS22028");
        u21cys.add("CB.EN.U4CYS22029");
        u21cys.add("CB.EN.U4CYS22030");
        // Get the iterator
        Iterator<String> it = u21cys.iterator();
        Iterator<Integer> it2 = rollno.iterator();
        // Print the cars using the iterator
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println(it2.next());
        System.out.println(it2.next());
        System.out.println(it2.next());
        System.out.println(it2.next());
    }
}