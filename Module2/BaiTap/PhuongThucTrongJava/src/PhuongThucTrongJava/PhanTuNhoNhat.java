package PhuongThucTrongJava;

import java.util.Scanner;

public class PhanTuNhoNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cua mang");
		int n = in.nextInt();
		int [] nn = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println(" nhap phan tu thu: "+i);
			nn[i] = in.nextInt();
		}
		int n1 = nn[0];
		for(int i = 0; i < n; i++) {
			if(n1 > nn[i]) {
				n1 = nn[i];
			}
		}
		System.out.println("Phan tu nho nhat cua mang la: "+n1);
	}

}
