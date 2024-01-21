/****************************************SC***************************************************
 * Name: Suresh Chitkara *
 * Course: Software Development I CEN-3024C-24667 *
 * Date: 1/20/2024 *
 * Description: The Book Class creates objects which are ID, title, and author. It allows user to enter an id, title and author. 
 *****************************************SC****************************************************/
public class Book { // SC Introduction to Book Class.
    private int id; // SC Declaring a private integer variable id within the class. 
    private String title; // SC Declaring a private string variable title within the class.
    private String author; // SC Declaring a private string variable author within the class.

    public Book(int id, String title, String author) { // SC the constructor sets the id, title, and author attributes of the Book  
        this.id = id; // SC sets the value of the instance variable id of the current Book
        this.title = title; // SC sets the value of the instance variable title of the current Book
        this.author = author; sets the value of the instance variable id of the current Book
    }

    public int getId() { // SC It declares a public method named getId within the Book class
        return id; // SC When getId method is called, it will provide the value of the id attribute of the Book object.
    }

    public String getTitle() { // SC It declares a public method named getTitle within the Book class
        return title; // SC When the getTitle method is called, it will provide the value of the title attribute of the Book object 
    }

    public String getAuthor() { // SC It declares a public method named getAuthor within the Book class
        return author; // SC When the getAuthor method is called, it will provide the value of the author attribute of the Book object
    }

    @Override // SC overriding methods to ensure that your intention matches the actual behavior.
    public String toString() { // SC The toString method in Java is a method of the Object class that is intended to return a string representation of an object. 
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}'; // SC Representation of the Book object's state, making it useful for displaying information about the object. 
    }
}
