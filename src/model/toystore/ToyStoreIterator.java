package model.toystore;

import model.toy.ToyItem;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ToyStoreIterator<T extends ToyItem<T>>  implements Iterator<T> {
    private int index;
    private PriorityQueue<T> toysCollection;
    private Iterator<T> iterator;
    public ToyStoreIterator(PriorityQueue<T> toysCollection) {
        iterator = toysCollection.iterator();
        this.toysCollection = toysCollection;
    }
    @Override
    public boolean hasNext() {
        return index < toysCollection.size();
    }
    @Override
    public T next() {
        return iterator.next();
    }
}
