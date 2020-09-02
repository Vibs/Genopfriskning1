import java.util.*;

public class Main{
    
    public static void main(String []args)
    {
        
        
        // Opgave 1
        System.out.println("\nOPGAVE 1\n\n\n");
        
        ArrayList<String> vibesStringArrayList = new ArrayList<String>();
        vibesStringArrayList.add("Hej");
        vibesStringArrayList.add("Gruppe 5");
        
        Opgave1 opgave1 = new Opgave1();
        
        opgave1.doesArraylistContainString("Dinmor", vibesStringArrayList);
        opgave1.doesArraylistContainString("Johnny", vibesStringArrayList);
        opgave1.doesArraylistContainString("Hej", vibesStringArrayList);
        
        
        // Opgave 2
    /* toString-TEST-udskrivning
    Bog vibesBog = new Bog("VibesLækreBog", 246762487, 2020);
    System.out.println(vibesBog);
    */
        System.out.println("\nOPGAVE 2\n\n\n");
        
        BibliotekOpgave bibliotek = new BibliotekOpgave();
        
        bibliotek.addBog(new Bog("Java1", 123, 2007));
        bibliotek.addBog(new Bog("Peter Plys", 1236876, 2009));
        bibliotek.addBog(new Bog("Harry Potter", 123653, 2004));
        
        // test af erISBNPåListe:
        bibliotek.erISBNPåListe(new Bog("Star wars", 1236876, 2008));
        
        // Opgave 3
        // Test af dageTilGræsslåning-metoden (Græsset skal slås, inden værdien overstiges)
        System.out.println("\nOPGAVE 3\n\n");
        Græs græs = new Græs();
        Scanner scan = new Scanner(System.in);
        
        boolean harBrugerTastetForkert = true;
        
        
        System.out.print("Hvor højt er dit græs lige nu?: ");
        double currentLængde = scan.nextDouble();
        System.out.print("Hvor højt skal dit græs være før du vil slå det?: ");
        double længdeLimit = scan.nextDouble();
        
        System.out.println("Du skal slå dit græs om " + græs.dageTilGræsslåning(currentLængde, længdeLimit) + " dage.");
        
        // Opgave 4:
        System.out.println("\nOPGAVE 4\n\n\n");
        
        Kvadrat kvadrat = new Kvadrat();
        
        kvadrat.printKvadrat(8, '#');
        
        // Opgave 5:
        // MEN RUNES ER SUPER MEGET BEDRE!!!! SÅ KIG PÅ DEN!
        System.out.println("\nOPGAVE 5\n\n\n");
        System.out.println("Hvad er din sætning?:");
        String rettelse = scan.nextLine();
        String brugersSætning = scan.nextLine();
        
        ProperCase properCase = new ProperCase();
        
        System.out.println(properCase.ændrString(brugersSætning));
        
    }
    
    
    
}








