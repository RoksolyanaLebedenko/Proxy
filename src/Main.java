/**
 * Created by Roksolyana Lebedenko on 25.12.2016.
 */
public class Main {
    public static void main(String args[]){
        IMath ex = new ProxyMath();
        System.out.println("Sum of 3 and 4 =  " + ex.add(3, 4));
        System.out.println("Division of 8 and 2 = " + ex.divide(8, 2));
    }
}
