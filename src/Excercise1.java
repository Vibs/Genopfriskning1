import java.util.*;
public class Excercise1
{
    
    public boolean isStringOnList(String stringToFind, ArrayList<String> listToCheck)
    {
        for(String s : listToCheck) // for each String (s) in the library ... kør hvad der står i for-each'ens krop
        {
            if(s.equals(stringToFind))
            {
                System.out.println("The String " + s + " has been found");
                return true;
            }
        }
        // vi når kun denne linje, hvis stringToFind IKKE er på listen
        listToCheck.add(stringToFind);
        System.out.println("The String, " + stringToFind + ", was not found, but has been added to the ArrayList");
        
        return false;
    }
}

