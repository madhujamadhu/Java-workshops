
import java.util.Arrays;
import java.util.Collections;

public class Pric {
    public static void main(String[] args) {
        Double[] price={20.4,40.5,50.9,100.4,200.6};
        System.out.println("original price");
        System.out.println(Arrays.toString(price));
        Arrays.sort(price);
        System.out.println("price in ascending order");
        System.out.println(Arrays.toString(price));
        Arrays.sort(price,Collections.reverseOrder());
        System.out.println("price in descending order");
        System.out.println(Arrays.toString(price));
    }
    
}
