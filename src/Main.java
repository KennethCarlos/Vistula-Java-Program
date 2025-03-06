import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of the product: ");
        double cost = sc.nextDouble();
        double vat = 0.23;
        double finalPrice = cost +(cost*vat);

        System.out.println ("The cost of the product is: " + cost);
        System.out.println("The cost of the product with vat is: " + finalPrice);
        System.out.println("The value without vat is: " +cost*10000);//something is wrong with this
        System.out.println("The value with vat is: " + finalPrice*10000);

        System.out.println(" ");
        System.out.println( "Now using big decimal");
        System.out.println("The cost of the product is: " + String.format("%.2f", cost));
        System.out.println("The cost of the product with vat is: " + String.format("%.2f",finalPrice));
        System.out.println("The value without vat is: " +  String.format("%.2f",cost*10000));
        System.out.println("The value with vat is: " +  String.format("%.2f",finalPrice*10000));



    }
}