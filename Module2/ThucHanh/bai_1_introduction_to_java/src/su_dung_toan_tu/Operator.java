package su_dung_toan_tu;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        float area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = sc.nextFloat();

        System.out.print("Enter height: ");
        height = sc.nextFloat();

        area = width * height;
        System.out.println("Area is: " + area);
    }
}
