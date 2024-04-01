package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
         if(o1.getName().compareTo(o2.getName()) != 0){
            return o1.getName().compareTo((o2.getName()));
        } else{
            return o1.getName().compareTo(o2.getName());
        }
    }
}
