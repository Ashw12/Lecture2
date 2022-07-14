package Lecture2;

public class Pattern5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=0;
		int star=5;
		int row=1;
		while(row<=n) {
			//space
			int i=1;
			while(i<=space) {
			System.out.print("  ");
			i++;
		}
			int j=1;
			while(j<=star) {
				System.out.print("*"+" ");
				j++;
			}
			//next row
		star--;
		space++;
		row++;
		System.out.println();

		}

	}

}
