package luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getNameProduct().compareTo(o2.getNameProduct());
    }
}
