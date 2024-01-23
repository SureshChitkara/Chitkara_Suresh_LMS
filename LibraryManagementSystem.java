/****************************************SC***************************************************
 * Name: Suresh Chitkara *
 * Course: Software Development I CEN-3024C-24667 *
 * Date: 1/22/2024 *
 * Description: The LibraryManagementSystem class provides a set of basic operations to interact with the library collection. It serves as the foundation for a console-based library management system, and additional features or improvements can be added based on specific requirements. 
 *****************************************SC****************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryManagementSystem { // SC Introduction to class LibraryManagementSystem 

    private List<Book> libraryCollection; // SC Declaring a private instance variable named libraryCollection in a Java class. 

    public LibraryManagementSystem() {
        this.libraryCollection = new ArrayList<>();
    }

    public void addBooksFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] bookInfo = line.split(",");
                if (bookInfo.length == 3) {
                    int id = Integer.parseInt(bookInfo[0]);
                    String title = bookInfo[1];
                    String author = bookInfo[2];
                    Book newBook = new Book(id, title, author);
                    libraryCollection.add(newBook);
                } else {
                    System.out.println("Invalid book information format: " + line);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void removeBookById(int bookId) {
        Iterator<Book> iterator = libraryCollection.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == bookId) {
                iterator.remove();
                System.out.println("Book removed: " + book);
                return;
            }
        }
        System.out.println("Book not found with ID: " + bookId);
    }

    public void listAllBooks() {
        if (libraryCollection.isEmpty()) {
            System.out.println("The library collection is empty.");
        } else {
            System.out.println("List of Books in the Library:");
            for (Book book : libraryCollection) {
                System.out.println(book);
            }
        }
    }
}
