import java.util.Scanner;

public class discount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=200;
        int b=75;
        int c=500;
        System.out.println("Enter quantity for a: ");
        int n = sc.nextInt();
        System.out.println("Enter quantity for b: ");
        int o = sc.nextInt();
        System.out.println("Enter quantity for c: ");
        int m = sc.nextInt();

        double Product = (a*n) + (b*o) + (c*m);
        Product = Product-0.1*Product;
        System.out.println("Discounted Price: "+Product);
        Product = Product+(0.05*Product);
        System.out.println("Price with added Tax: "+Product);

        
    }
}
