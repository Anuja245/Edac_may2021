import java.util.Scanner;
public class Que22 
{
    public static void main(String[] args) 
    {
        String b1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Input the  binary number:");
        b1 = sc.next();
        sc.close();
        System.out.println("Decimal Number "+Integer.parseInt(b1,2));
    }
}
