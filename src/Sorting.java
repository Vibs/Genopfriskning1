public class Sorting
{
    
    public String[] sortArrayAlphabeticallyOmvendt(String[] sA)
    {
        String temp = "";
        
        for(int i = sA.length - 1; i >= 0; i--) // hver gang loopet kører, bliver det rette ord sat på plads i
        {
            for(int j = i - 1; j >= 0; j--) // tjekker hvert ord efter index i burde stå på index i
            {
                if(sA[i].compareTo(sA[j]) > 0) // hvis ord på index j er alfabetisk før ord på index i
                {
                    temp = sA[i]; // gemmer ord på [i] i temp-variabel (så ordet ikke forsvinder)
                    sA[i] = sA[j]; // string[i] sættes til string[j], fordi vi er i if'en fordi j kommer først
                    sA[j] = temp; // string[j] sættes til at være string[i] (temp) for at de to værdier byttes om
                }
            }
        }
        return sA;
    }
    
    public String[] sortArrayAlphabetically(String[] sA)
    {
        String temp = "";
        
        for(int i = 0; i < sA.length; i++) // hver gang loopet kører, bliver det rette ord sat på plads i
        {
            for(int j = i + 1; j < sA.length; j++) // tjekker hvert ord efter index i burde stå på index i
            {
                if(sA[i].compareTo(sA[j]) > 0) // hvis ord på index j er alfabetisk før ord på index i
                {
                    temp = sA[i]; // gemmer ord på [i] i temp-variabel (så ordet ikke forsvinder)
                    sA[i] = sA[j]; // string[i] sættes til string[j], fordi vi er i if'en fordi j kommer først
                    sA[j] = temp; // string[j] sættes til at være string[i] (temp) for at de to værdier byttes om
                }
            }
        }
        return sA;
    }
    
    public void printStringArray(String[] sA)
    {
        for(int i = 0; i < sA.length; i++)
        {
            System.out.println(sA[i]);
        }
        
    }
}
