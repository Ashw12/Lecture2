package Lecture2;

import java.util.*;
public class Pattern21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=2*n-3;
		int space=1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("*"+" ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==n)
				k++;
			while(k<=star) {
				System.out.print("*"+" ");
				k++;
			}
			star++;
			space-=2;
			row++;
			System.out.println();
		}
		

	}




	}


