package trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;


public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        return 0;
    }
}