package model.toy;

import java.util.Comparator;

public class ToyComparatorByFrequency <E extends ToyItem> implements Comparator<E>{
    @Override
    public int compare(E o1, E o2) {
        return Double.compare(o2.getFrequency(), o1.getFrequency());
    }
}
