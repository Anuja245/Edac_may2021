import java.util.Scanner;
public class Que24 
{
    public static void main(String[] args) 
    {
        String b1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Input the  binary number:");
        b1 = sc.next();
        sc.close();
        int num1 = Integer.parseInt(b1,2);
        System.out.println("Octal Number "+Integer.toOctalString(num1));
    } 
}
