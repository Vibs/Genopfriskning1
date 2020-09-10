public class Search
{
    public int findIndex(String[] sA, String s)
    {
        for(int i = 0; i < sA.length; i++)
        {
            if(sA[i].compareTo(s) == 0) // brug compareTo og ikke equals - fordi de to stringobjekter indeholder
                // samme værdi, men de er ikke det samme objekt!!!!
            {
                return i;
            }
        }
        return -1;
    }
}
