import java.util.ArrayList;

public class Library 
{
    private ArrayList<Book> books;

    public Library() 
    {
        books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void listBooks() 
    {
        for (Book book : books) 
        {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - " + (book.isAvailable() ? "Available" : "Not Available"));
        }
    }

    public void borrowBook(String title) 
    {
        for (Book book : books) 
        {
            if (book.getTitle().equalsIgnoreCase(title)) 
            {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) 
    {
        for (Book book : books) 
        {
            if (book.getTitle().equalsIgnoreCase(title)) 
            {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() 
    {
        for (Book book : books) 
        {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Available: " + (book.isAvailable() ? "Yes" : "No"));
            System.out.println("---------------------------");
        }
    }
}
