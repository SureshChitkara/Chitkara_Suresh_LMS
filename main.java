/****************************************SC***************************************************
 * Name: Suresh Chitkara *
 * Course: Software Development I CEN-3024C-24667 *
 * Date: 1/23/2024 *
 * Description: The main class is the entry point of a LibraryManagementSystem
 *****************************************SC****************************************************/
public class main { /* SC Main class begins. */
    public static void main(String[] args) { /* SC The main method creates an instance of LibraryManagementSystem, adds books from a file, and interacts with users through a simple console menu. */ 
        LibraryManagementSystem lms = new LibraryManagementSystem(); /* SC Creates a new instance of the LibraryManagementSystem class. */
        lms.addBooksFromFile("books.txt"); /* SC The method attempts to read books from the specified file path. */
        lms.listAllBooks(); /* SC The method displays a list of all books currently in the library's collection. */
        lms.removeBookById(2); /* SC Method removes book from the collection depending on the ID which is 2. */
        lms.listAllBooks(); /* SC Method lists the books after the removeBookById has been done. */
    }
}
