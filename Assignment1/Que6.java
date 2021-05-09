import java.util.Scanner;
public class Que6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = sc.nextInt();
        System.out.println("Input second number: ");
        int num2 = sc.nextInt();
        sc.close();
        int sub = num1-num2;
        int sum = num1+num2;
        System.out.println(num1+" + "+num2+" = "+sum);
        System.out.println(num1+" - "+num2+" = "+sub);
        System.out.println(num1+" x "+num2+" = "+num1*num2);
        System.out.println(num1+" / "+num2+" = "+num1/num2);
        System.out.println(num1+" mod "+num2+" = "+num1%num2);
    }    
}