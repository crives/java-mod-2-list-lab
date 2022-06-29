import java.util.ArrayList;
import java.util.List;

public class Library {

    public static List<Book> bookList = new ArrayList<Book>();

    public static void printBooks() {
        // If there are books in the library:
        System.out.println("");
        System.out.println("");
        System.out.println("These are the books in your library!");
        System.out.println("|");
        System.out.println("V");
        bookList.stream().forEach(System.out::println);

        // Else, print sad face or ASCII art
    }
}
