import java.util.ArrayList;
public class Library
{
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public void addBog(Book bog)
    {
        books.add(bog);
    }
    
    public boolean isISBNonList(Book book)
    {
        for(Book foundBook : books)
        {
            
            if(foundBook.getISBN() == book.getISBN())
            {
                System.out.println("ISBN was found on the list");
                return true;
            }
        }
        // vi når kun herned, hvis der ikke er nogen bøger med samme ISBN på listen
        System.out.println("ISBN is not on the list");
        return false;
    }
}