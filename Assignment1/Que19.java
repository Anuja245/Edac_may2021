public class Que19 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number :");
        int num= sc.nextInt();
        sc.close();
        System.out.println("Binary number is: "+ Integer.toBinaryString(num));

    }   
}