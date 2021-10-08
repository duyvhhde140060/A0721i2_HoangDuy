package PhuongThucTrongJava;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so cot cua mang");
		int c = in.nextInt();
		System.out.println("Nhap so dong cua mang");
		int d = in.nextInt();
		int number[][] = new int[d][c];
		for(int i = 0; i < d; i++) {
			for(int j = 0; j < c; j++) {
				System.out.println("nhap phan tu thu"+i+""	 +j);
				number[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < d; i++) {
			  System.out.printf("\n");
			for(int j = 0; j < c; j++) {
				  System.out.print("\t"+number[i][j]);
				 
		
	}

}
		int ln = number[0][0];
		for(int i = 0; i < d; i++) {
			  System.out.printf("\n");
			for(int j = 0; j < c; j++) {
				if(ln < number[i][j]) {
					ln = number[i][j];
				}
				
		
	}
}
		System.out.println("phan tu lon nhat la: "+ln);
	}
}
