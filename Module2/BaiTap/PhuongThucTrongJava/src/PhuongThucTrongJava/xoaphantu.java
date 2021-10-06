package PhuongThucTrongJava;

import java.util.Arrays;
import java.util.Scanner;

public class xoaphantu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []mang = new int[n];
		int []mang2 = new int[n-1];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ: " +(i+1));
			mang[i] = in.nextInt(); 
		}
		System.out.println(Arrays.toString(mang));
		System.out.println("nhap phan tu can xoa trong mang: ");
		int n1 = in.nextInt();
		for(int i = 0; i < n; i++) {
			if(n1 == mang[i]) {
				mang2[i] = mang[i+1];
				i += 1;
			}
			else {
				mang2[i] = mang[i];
			}
		}
		System.out.println(Arrays.toString(mang2));
	}
}
