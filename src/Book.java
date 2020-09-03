public class Book
{
    private String name;
    private int ISBN;
    private int releaseDate;
    
    // constructor
    public Book(String name, int ISBN, int releaseDate)
    {
        this.name = name;
        this.ISBN = ISBN;
        this.releaseDate = releaseDate;
    }
    
    // setters
    public void setName(String name) { this.name = name; }
    public void setISBN(int ISBN) { this.ISBN = ISBN; }
    public void setReleaseDate(int releaseDate) { this.releaseDate = releaseDate; }
    
    // getters
    public String getName(){
        return name;
    }
    public int getISBN(){
        return ISBN;
    }
    public int getRelease(){
        return releaseDate;
    }
    
    @Override
    public String toString()
    {
        return "Name: " + name + "\nISBN: " + ISBN + "\nDate of release: " + releaseDate;
    }
    
}