package Lecture2;

public class Pattren9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int n=5;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			//space
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("*"+" " );
				j++;
		}
          space--;
            star +=2;
            row++;
            System.out.println();
	}

}
}
	
	
