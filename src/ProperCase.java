public class ProperCase{
    
    public String ændrString(String brugersSætning){
        String ændretBrugerString = "";
        String fundetOrd = "";
        
        int b = 0;
        for(int i = 0; i < brugersSætning.length(); b++){
            // while til at finde ord for ord og gemme i fundetOrd
            while(true){
                if(brugersSætning.charAt(i) == ' ' || i == brugersSætning.length())
                {
                    i++;
                    break;
                }
                // én char ad gangen bliver tilføjet til fundetOrd-stringen
                fundetOrd = fundetOrd + Character.toString(brugersSætning.charAt(i));
                i++;
            }
            
            // check if upperCase
            boolean fundetOrdErMedStoreBogstaver = true;
            
            for(int j = 0; j < fundetOrd.length(); j++){
                
                if(!(Character.isUpperCase(fundetOrd.charAt(j))))
                {
                    fundetOrdErMedStoreBogstaver = false;
                }
            }
            
            if(fundetOrdErMedStoreBogstaver){
                // Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
            }
            else if(fundetOrd.length() > 3)
            {
                
                // Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
                fundetOrd = fundetOrd.toLowerCase();
                
                String konverteretFundetOrd = Character.toString(Character.toUpperCase(fundetOrd.charAt(0)));
                
                for(int k = 1; k < fundetOrd.length(); k++){
                    
                    konverteretFundetOrd = konverteretFundetOrd + fundetOrd.charAt(k);
                }
                
                fundetOrd = konverteretFundetOrd;
            }
            else // if(fundetOrd.length() <= 3)
            {
                
                // Ord på max. 3 bogstaver skal skrives med småt.
                fundetOrd = fundetOrd.toLowerCase();
            }
            
            ændretBrugerString = ændretBrugerString + fundetOrd + " ";
            fundetOrd = "";
        }
        return ændretBrugerString;
    }
}

