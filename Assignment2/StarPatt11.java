/*
*****
 *****
  *****
   *****
    *****
*/

class StarPatt11
{
	public static void main(String args[])
	{
		for(int row=1; row<=5;row++)
		{
			for(int space=1; space<row; space++)
			{
				System.out.print(" ");
			}
			for(int col=1; col<=5; col++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}