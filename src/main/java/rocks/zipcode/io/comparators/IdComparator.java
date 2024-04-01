package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;
import java.util.function.ToLongFunction;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
      if(o1.getId().compareTo(o2.getId()) != 0){
          return o1.getId().compareTo((o2.getId()));
        } else{
        return o1.getId().compareTo(o2.getId());
      }
    }

}
