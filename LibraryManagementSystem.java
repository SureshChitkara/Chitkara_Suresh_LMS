public class LibraryManagementSystem {
    private List<Book> libraryCollection;

    public LibraryManagementSystem() {
        this.libraryCollection = new ArrayList<>();
    }

    public void addBooksFromFile(String filePath) {
        // Read and parse the text file
        // Validate and add each book to the collection
    }

    public void removeBookById(int bookId) {
        // Search for the book with the specified ID
        // Validate and remove the book from the collection
        // Display success/error message
    }

    public void listAllBooks() {
        // Display ID, title, and author of each book in the collection
        // Display a message if the collection is empty
    }
}
