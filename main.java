/****************************************SC***************************************************
 * Name: Suresh Chitkara *
 * Course: Software Development I CEN-3024C-24667 *
 * Date: 1/23/2024 *
 * Description: The main class is the entry point of a LibraryManagementSystem
 *****************************************SC****************************************************/
import java.util.Scanner; /* SC Scanner utility helps detect user input to execute an output. */

public class main { /* SC Main class begins. */
    public static void main(String[] args) { /* SC The main method creates an instance of LibraryManagementSystem, adds books from a file, and interacts with users through a simple console menu. */ 
        LibraryManagementSystem lms = new LibraryManagementSystem(); /* SC Creates a new instance of the LibraryManagementSystem class. */

        System.out.println("List of Books:"); /* SC When code is run, message displays and shows list of books from the text file. */
        lms.listAllBooks(); /* SC The method displays a list of all books currently in the library's collection. */

        System.out.print("Enter the ID of the book to remove: "); /* SC User is asked to enter ID of the book they want to be removed. */
        int bookIdToRemove = scanner.nextInt(); /* SC Through the scanner, it will determine what ID the user entered. */
        lms.removeBookById(bookIdToRemove); /* SC The method to remove the book will be performed after the ID is found. */

        System.out.println("Updated List of Books:");  /* SC Message shows the updated ist of books after the remove method has been performed. */
        lms.listAllBooks(); /* SC Method lists the books after the removeBookById has been done. */

        
        scanner.close(); /* SC Scanner is closed. */
    }
}

     
