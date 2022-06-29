import java.util.Scanner;

/*
 * Let's create a Library class that holds books. We will need to create the Book class as well, 
 * and we'll define a book as something with the following properties:

Title
Genre
Number of pages
This library will hold books that the user defines, 
so create a loop that asks the user for information about a single book, 
then create the book and add it to the library. 
Then loop again and ask the user if they want to add another book.

Tips:

Since you don't know how many books the user is going to create, it makes sense to store the books in a List, 
so you can simply add a book every time you go through your loop
Your Library class will hold the list of books
You will need a "runner" class that has the loop logic to gather the book information from the user
 */
public class LibraryRunner {

    public static Scanner sc = new Scanner(System.in);
    public static boolean repeat = true;
    public static void main(String[] args) {

        System.out.println("\nWelcome to the Virtual Book Library, where you can create books!");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Let's begin by adding some books!");
        System.out.println(".");
        System.out.println(".");
        
        while (repeat) {
            System.out.println("\nWould you like to add a book? (Type 'yes' or 'no'!)");
            String addBookAnswer = sc.nextLine();

            boolean cont = addBookAnswer.toLowerCase().equals("yes");
        
            if (cont) {
                System.out.println("\nWhat would you like this book to be called?");
                String title = sc.nextLine();
                System.out.println("\nWhat genre is this book?");
                String genre = sc.nextLine();
                System.out.println("\nHow many pages does this book have?");
                int numPages = sc.nextInt();

                Book newBook = new Book(title, genre, numPages);
                Library.bookList.add(newBook);
                
                // Loop back to beginning for user input (y or no)
                String str = sc.nextLine();

            } else {
                repeat = false;
                Library.printBooks();
            }
        }
    }
}
