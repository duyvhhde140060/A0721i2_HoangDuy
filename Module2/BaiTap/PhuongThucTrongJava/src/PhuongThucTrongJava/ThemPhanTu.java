package PhuongThucTrongJava;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("nhap do dai cua mang");
		int n = in.nextInt();
		
		int []a = new int[n];
		int [] b = new int [n];
		for(int i = 0; i < n; i++) {
			System.out.println(" Nhap phan tu thu: "+(i+1));
			a[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Nhap vi tri can chen");
	int index = in.nextInt();
	System.out.println("nhap so can chen");
	int index1 = in.nextInt();
	if(index <= 1 || index >= n -1) {
		System.out.println(" không chèn được phần tử vào mảng");
	}
	else {
		for(int i = 0; i < n; i++) {
			if(i == index) {
				b[i] = index1;
				
			}
			else {
				b[i] = a[i];
			}
		}
		System.out.println("Mảng sau khi đc chèn là: "+ Arrays.toString(b));
	}
	}
	


}
