import java.util.Scanner;
public class Que18 
{
    public static void main(String[] args) 
    {
        String b1,b2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Input the first binary number:");
        b1 = sc.next();
        System.out.println("Input the second binary number:");
        b2= sc.next();
        sc.close();
        int num1 = Integer.parseInt(b1,2);
        int num2 = Integer.parseInt(b2,2);
        int mul = num1*num2;
        System.out.println("Product of two binary numbers: "+Integer.toBinaryString(mul));
    }
}
