package model.toystore;

import model.toy.Toy;
import model.toy.ToyItem;
import java.io.Serializable;
import java.util.*;

public class ToyStore<E extends ToyItem<E>> implements Iterable<E>, Serializable {
    private long toyId;
    private final PriorityQueue<E> toyCollection;
    public ToyStore() {
        toyCollection = new PriorityQueue<>();
    }
    public boolean addToy(E toy){
        if (toy == null) {
            return false;
        }
        if (!toyCollection.contains(toy)){
            toyCollection.add(toy);
            toy.setId(toyId++);
            return true;
        }
        return false;
    }
    public String toyStoreInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список игрушек:\n");
        for (Object toy: toyCollection){
            stringBuilder.append(toy);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public Toy getToy() {
        Toy toy = (Toy) toyCollection.poll();
        return toy;
    }
    public int sizeToyCollection() {
        return toyCollection.size();
    }

    @Override
    public String toString() {
        return toyStoreInfo();
    }
    @Override
    public Iterator<E> iterator() {
        return toyCollection.iterator();
    }
}
