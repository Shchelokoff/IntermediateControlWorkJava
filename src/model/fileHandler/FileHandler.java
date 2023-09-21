package model.fileHandler;

import model.toy.Toy;
import model.toystore.ToyStore;
import java.io.*;

public class FileHandler implements Writable {
    @Override
    public Object save(Serializable serializable, String path) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            objectOutputStream.writeObject(serializable);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    @Override
    public Object loading(String path) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {
            Object object = objectInputStream.readObject();
            if (object instanceof ToyStore) {
                return (ToyStore<Toy>) object;
            } else {
                throw new IllegalArgumentException("Invalid object type");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}