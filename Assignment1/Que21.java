import java.util.Scanner;;
public class Que21 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number :");
        int num= sc.nextInt();
        sc.close();
        System.out.println("Octal number is: "+ Integer.toOctalString(num));
    }
}
