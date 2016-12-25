/**
 * Created by Roksolyana Lebedenko on 25.12.2016.
 */
public class ProxyMath implements IMath{

    private Math m;

    @Override
    public double add(double x, double y) {
        if (m == null){
            m = new Math();
        }
        return m.add(x, y);
    }

    @Override
    public double divide(double x, double y) {
        if (m == null){
            m = new Math();
        }
        return m.divide(x, y);
    }
}
