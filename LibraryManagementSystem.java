import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> libraryCollection;

    // Constructor
    public LibraryManagementSystem() {
        this.libraryCollection = new ArrayList<>();
    }

    // Method to add books from a file
    public void addBooksFromFile(String filePath) {
        try {
            // Implementation as provided in the previous response
            // ...
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }
    }

    // Method to remove a book by ID
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

    // Method to list all books
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
