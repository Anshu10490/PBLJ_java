import java.util.Scanner;

class Book {
    protected String title, author, type;
    protected double price;

    public Book(String type, String title, String author, double price) {
        this.type = type;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println(type + " Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[2];
        
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Type: ");
            String type = sc.next();
            sc.nextLine(); 
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            books[i] = new Book(type, title, author, price);
        }
        
        System.out.println("\nBook Details:");
        for (Book book : books) {
            book.display();
            System.out.println();
        }
        
        sc.close();
    }
}
