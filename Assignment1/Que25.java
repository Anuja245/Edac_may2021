import java.util.Scanner;
public class Que25 
{
    public static void main(String[] args) 
    {
        String b1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Input the  octal number:");
        b1 = sc.next();
        sc.close();
        int num1 = Integer.parseInt(b1,8);
        System.out.println("Decimal Number "+num1);
    }
}
