package trien_khai_interface_comparator;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];

        circles[0] = new Circle(2.5);
        circles[1] = new Circle(5.2);
        circles[2] = new Circle(1.0);

        System.out.println("Pre - sort:");
        for (Circle o : circles) {
            System.out.println(o);
        }

        Arrays.sort(circles, new CircleComparator());

        System.out.println("After sorted:");
        for (Circle o : circles) {
            System.out.println(o);
        }
    }
}
© 2021 GitHub, Inc.
Terms
Privacy
