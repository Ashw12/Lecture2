package Lecture2;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,n=4;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n;j++)
			{
				if(j==i ||(i+j)==(n-i))
						System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}


