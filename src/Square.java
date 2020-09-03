public class Square
{
    public void printSquare(int a, String symbol)
    {
        for(int i = 0; i < a; i++) // linjeskift
        {
            for(int j = 0; j < a; j++) // printer linje
            {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
