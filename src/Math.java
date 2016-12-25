/**
 * Created by Roksolyana Lebedenko on 25.12.2016.
 */
public class Math implements IMath{

    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double divide(double x, double y) {
        return x/y;
    }
}
