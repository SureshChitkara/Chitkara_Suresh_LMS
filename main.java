public class main {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addBooksFromFile("books.txt");
        lms.listAllBooks();
        lms.removeBookById(2);
        lms.listAllBooks();
    }
}
