public class Grass
{
    public int calculateDaysToCut(double currentLength, double lengthLimit)
    {
        return (int) ((lengthLimit - currentLength) / 0.8);
    }
}