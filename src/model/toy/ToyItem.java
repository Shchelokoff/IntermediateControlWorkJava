package model.toy;

import java.io.Serializable;

public interface ToyItem<T> extends Serializable {
    void setId(long id);
    long getId();
    int getFrequency();
}
