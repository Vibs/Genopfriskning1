import java.util.*;

public class Main
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // EXCERCISE 1
        System.out.println("\n       EXCERCISE 1\n");
        
        ArrayList<String> vibesStringArrayList = new ArrayList<String>(Arrays.asList("Hej", "String", "Gruppe 5",
                "sidste String"));
        
        Excercise1 excercise1 = new Excercise1();
    
        System.out.print("Which String would you like to check is in the ArrayList?: ");
        String stringToCheck = scanner.nextLine();
        
        excercise1.isStringOnList(stringToCheck, vibesStringArrayList);
        
        
        // EXCERCISE 2
        System.out.println("\n       EXCERCISE 2\n");
        
        Library library = new Library();
        
        library.addBog(new Book("Java1", 123, 2007));
        library.addBog(new Book("Peter Plys", 1236876, 2009));
        library.addBog(new Book("Harry Potter", 123653, 2004));
    
        System.out.print("Which book would you like to check is on the list?\n" +
                                   "Name of the book: ");
        String userBookName = scanner.nextLine();
        System.out.print("ISBN-number of the book: ");
        int userBookISBN = scanner.nextInt();
        System.out.print("Release date of the book: ");
        int userBookReleaseDate = scanner.nextInt();
        
        library.isISBNonList(new Book(userBookName, userBookISBN, userBookReleaseDate));
        
        // EXCERCISE 3
        System.out.println("\n       EXCERCISE 3\n");
        
        Grass grass = new Grass();
        
        System.out.print("What is the current height of your grass?: ");
        double currentLength = scanner.nextDouble();
        System.out.print("What is the maximum height you want you grass to be?: ");
        double lengthLimit = scanner.nextDouble();
        
        System.out.println("You have to cut your grass in " + grass.calculateDaysToCut(currentLength, lengthLimit) +
                                   " days.\n");
        
        // EXCERCISE 4:
        System.out.println("\n       EXCERCISE 4\n");
        
        Square square = new Square();
    
        System.out.print("How big do you want the sides of your square to be?: ");
        int sideLength = scanner.nextInt();
        System.out.print("Which symbol would you like to use?: ");
        String symbol = scanner.next();
        
        square.printSquare(sideLength, symbol);
        
        // EXCERCISE 5:
        System.out.println("\n       EXCERCISE 5\n");
        
        System.out.print("Which sentence would you like to convert?: ");
        String catcher = scanner.nextLine(); // catcher et linjeskift, I think
        String userSentence = scanner.nextLine();
        
        ProperCase properCase = new ProperCase();
    
        System.out.println(properCase.formatString(userSentence));
        
        // EXCERCISE 6:
        System.out.println("\n       EXCERCISE 6\n");
        
        System.out.println("Please enter 5 words (press 'Enter' after each word): ");
        
        String[] sA = new String[5];
        
        for(int i = 0; i < 5; i++)
        {
            sA[i] = scanner.nextLine();
        }
        
        Sorting sorting = new Sorting();
        
        String[] sSA = new String[5];
        
        sSA = sorting.sortArrayAlphabeticallyOmvendt(sA);
        
        // sSA = sorting.sortArrayAlphabetically(sA);
        sorting.printStringArray(sSA);
    
        // EXCERCISE 7:
        System.out.println("\n       EXCERCISE 7\n");
        
        Search search = new Search();
    
        System.out.println(search.findIndex(sSA, "musefælde"));
    
    
    }
    
    
    
}








