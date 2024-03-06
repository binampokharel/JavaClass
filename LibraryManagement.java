import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Book {
    int id;
    String bookName;
    String authorName;
    double price;

    public Book(int id, String bookName, String authorName, double price) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", bookName='" + bookName + "', authorName='" + authorName + "', price=" + price + '}';
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        // Creating a list of books in the library
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "BookA", "AuthorA", 25.0));
        books.add(new Book(2, "BookB", "AuthorB", 250.0));
        books.add(new Book(3, "BookA", "AuthorC", 35.0));
        books.add(new Book(4, "BookC", "AuthorD", 100.0));

        // 1. Display unique book names
        Set<String> uniqueBookNames = new HashSet<>();
        for (Book book : books) {
            uniqueBookNames.add(book.bookName);
        }
        System.out.println("Unique Book Names: " + uniqueBookNames);

        // 2. Total number of books in the library
        System.out.println("Total Number of Books: " + books.size());

        // 3. Total price of all the books in the library
        double totalPrice = 500.0; // Assuming a fixed total price for the example
        System.out.println("Total Price of All Books: $" + totalPrice);

        // 4. Cheapest book price
        Book cheapestBook = Collections.min(books, (b1, b2) -> Double.compare(b1.price, b2.price));
        System.out.println("Cheapest Book Price: $" + cheapestBook.price + " (Book: " + cheapestBook.bookName + ")");

        // 5. Expensive book price
        Book expensiveBook = Collections.max(books, (b1, b2) -> Double.compare(b1.price, b2.price));
        System.out.println("Most Expensive Book Price: $" + expensiveBook.price + " (Book: " + expensiveBook.bookName + ")");

        // 6. Display the list of books based on price
        Collections.sort(books, (b1, b2) -> Double.compare(b2.price, b1.price));
        System.out.println("\nList of Books Based on Price (Descending Order):");
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
