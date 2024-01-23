/****************************************SC***************************************************
 * Name: Suresh Chitkara *
 * Course: Software Development I CEN-3024C-24667 *
 * Date: 1/22/2024 *
 * Description: The LibraryManagementSystem class provides a set of basic operations to interact with the library collection. It serves as the foundation for a console-based library management system, and additional features or improvements can be added based on specific requirements. 
 *****************************************SC****************************************************/
import java.io.BufferedReader; /* SC Import bufferedreader */
import java.io.FileReader; /* SC Import filereader */
import java.io.IOException; /* SC Import ioexception. */
import java.util.ArrayList; /* SC Import arraylist */
import java.util.Iterator; /* SC Import iterator */
import java.util.List; /* SC Import list */

public class LibraryManagementSystem { /* SC Introduction to class LibraryManagementSystem */

    private List<Book> libraryCollection; /* SC Declaring a private instance variable named libraryCollection in a Java class. */ 

    public LibraryManagementSystem() { /* SC Construcotr for LibraryManagementSystem. */
        this.libraryCollection = new ArrayList<>(); /* SC Initialize the libraryCollection variable with a new instance of ArrayList<Book>. */
    }

    public void addBooksFromFile(String filePath) { /* SC This method allows you to populate the library collection by reading book information from a text file. */
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { /* SC Ensures that the BufferedReader is closed properly, preventing resource leaks and providing a cleaner and more concise way of managing resources in Java. */
            String line; /* SC Variable is intended to store each line read from the file during the processing of the BufferedReader within the addBooksFromFile method. */
            while ((line = br.readLine()) != null) { // SC Loop construct that reads lines from a BufferedReader (br) until the end of the file is reached (when br.readLine() returns null).
                String[] bookInfo = line.split(","); // SC This line is often used when dealing with comma separated values where information is separated by a specific character.
                if (bookInfo.length == 3) { // SC The condition would be false (bookInfo.length is not equal to 3), and the code inside the else block would be executed, handling the case of an invalid or incomplete line.
                    int id = Integer.parseInt(bookInfo[0]); // SC Parses the first element of the bookInfo array into an integer. 
                    String title = bookInfo[1]; // SC This line is part of the process of extracting information from each line of the file, where each line represents a book with an ID, title, and author. 
                    String author = bookInfo[2]; // SC This line is responsible for extracting the author of the book from the bookInfo array.
                    Book newBook = new Book(id, title, author); // SC This line is crucial in the process of creating Book objects from the data read from the file, and these objects can then be added to the libraryCollection for further management in the library management system.
                    libraryCollection.add(newBook); // SC After processing all the lines in the file within the while loop, the libraryCollection would contain Book objects representing each book from the file, and the library is now populated with this information.
                } else { // SC Else statement
                    System.out.println("Invalid book information format: " + line); // SC Print message if invlid information format.
                }
            }
        } catch (IOException | NumberFormatException e) { // SC Handle thes exception.
            e.printStackTrace(); // SC Print the stack trace of the caught exception (e) to the standard error stream.
        }
    }

    public void removeBookById(int bookId) { // SC Method to remove book from library.
        Iterator<Book> iterator = libraryCollection.iterator(); // SC This loop iterates through the books in the libraryCollection using the iterator, and the hasNext() method checks if there are more books to iterate. 
        while (iterator.hasNext()) { // SC Initiates a loop that iterates through the elements in the libraryCollection using the Iterator
            Book book = iterator.next(); // SC The line is inside the while loop and is responsible for retrieving the next Book object from the libraryCollection using the iterator.
            if (book.getId() == bookId) { // SC The line checks whether the ID of the current Book object (book) matches the specified bookId.
                iterator.remove(); // SC The line used to remove the current Book object from the libraryCollection during iteration.
                System.out.println("Book removed: " + book); // SC Print message after book has been removed.
                return; // SC Return statement ensures that the method exits at that point.
            }
        }
        System.out.println("Book not found with ID: " + bookId); // SC Print message if the id in the while loop does not match any of book id in the collection.
    }

    public void listAllBooks() { // SC Method is used to display information about all books in the library collection. 
        if (libraryCollection.isEmpty()) { // SC condition method if library is empty.
            System.out.println("The library collection is empty."); // SC Print message if library is empty.
        } else { // SC Else statement
            System.out.println("List of Books in the Library:"); // SC Print message if library has books.
            for (Book book : libraryCollection) { // SC For loop to check book in the libraryCollection
                System.out.println(book); // SC prints every book in the libraryCollection.
            }
        }
    }
}
