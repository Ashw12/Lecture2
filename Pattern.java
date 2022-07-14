                            package Lecture2;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int star=n;
		int row=1;
		while(row<=n) {
			//star pattren
			int i=1;
			while(i<=star) {
				System.out.print("*"+" ");
				i++;
			}
			//next line prepartion
			row++;
			System.out.println();
		}

	}

}
