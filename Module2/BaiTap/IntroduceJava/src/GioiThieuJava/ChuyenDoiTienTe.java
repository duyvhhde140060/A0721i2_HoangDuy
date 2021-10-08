package GioiThieuJava;

import java.util.Scanner;

public class ChuyenDoiTienTe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("nhap so dola can doi sang vnd");
		int dola = in.nextInt();
		double vnd = dola * 23000;
		System.out.println("So vnd la: "+vnd);
	}

}
