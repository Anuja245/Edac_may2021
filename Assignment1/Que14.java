public class Que14 
{
    public static void main(String[] args) 
    {
        String s1 = "* * * * * * ====================================";
        String s2 = " * * * * *  ====================================";
        String s3 = "================================================";
        
        for(int i=0;i<4;i++)
        {
            System.out.println(s1);
            System.out.println(s2);
        }
        System.out.println(s1);

        for(int i=0;i<=6;i++)
            System.out.println(s3);
    }    
}