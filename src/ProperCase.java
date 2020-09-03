import java.util.Arrays;

public class ProperCase
{
    public String formatString(String stringToFormat)
    {
        String formattedString = ""; // String som skal returnes
        String[] words = stringToFormat.split(" ");
        
        for(String s : words)
        {
            if(s.toUpperCase().equals(s))
            {
                formattedString = formattedString + s + " ";
                continue; // kan enten skrive dette ELLER bare skrive else foran den næste if
            }
            if(s.length() > 3)
            {
                formattedString =
                        formattedString + s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ";
            }
            else
            {
                formattedString = formattedString + s.toLowerCase() + " ";
                // s = s.toLowerCase();
            }
        }
        return formattedString;
    }
}

