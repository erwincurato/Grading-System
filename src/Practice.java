import java.math.BigDecimal;
import java.math.RoundingMode;

public class Practice {
    public static void main(String[] args) {
       print(discount(1235, 50));
        print(discount(1000, 20));
        print(discount(599, 25));
    }
    public static double discount(int originalprice, int discountpercentage){
        double discountprice = originalprice * (discountpercentage / 100.0);
        double price = originalprice - discountprice;
        BigDecimal pricedecimal = new BigDecimal (price).setScale(2, RoundingMode.HALF_UP);
        return pricedecimal.doubleValue();
    }
    static double print (double value){
        System.out.println(value);
        return value;
    }
}
