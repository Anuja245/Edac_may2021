import java.util.Scanner;
public class Que17
{
    public static void main(String[] args) 
    {
        String b1,b2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st binary no. : ");
        b1=sc.next();
        System.out.println("Enter 2nd binary no. : ");
        b2=sc.next();
        sc.close();
        int num1 = Integer.parseInt(b1,2);
        int num2 = Integer.parseInt(b2,2);
        int sum=num1+num2;
        System.out.println("Additon is : "+Integer.toBinaryString(sum));
    }    
}
