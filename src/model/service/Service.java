package model.service;

import model.fileHandler.FileHandler;
import model.toy.Toy;
import model.toystore.ToyStore;

public class Service {
    private ToyStore<Toy> toyStore;
    private ToyStore<Toy> serviceToyStore;
    private int idToy;
    private FileHandler fileHandler;
    public Service(ToyStore<Toy> serviceToyStore) {
        this.serviceToyStore = serviceToyStore;
    }
    public Service() {
        serviceToyStore = new ToyStore<Toy> ();
        fileHandler = new FileHandler();
    }

    public void AddToyInStore(String name, int frequency) {
        Toy toy = new Toy(name, frequency);
        if (toyStore != null) {
            toyStore.addToy(toy);
        }
        else {
            serviceToyStore.addToy(toy);
        }
    }
    public void getRaffle() {
        Toy toy = serviceToyStore.getToy();
        System.out.println(toy);
    }
    public String getToyStoreInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        if (toyStore != null) {
            stringBuilder.append("Список игрушек:\n");
            for (Toy toy : toyStore) {
                stringBuilder.append(toy);
                stringBuilder.append("\n");
            }
        }
        else {
            stringBuilder.append("Список игрушек:\n");
            for (Toy toy : serviceToyStore) {
                stringBuilder.append(toy);
                stringBuilder.append("\n");
            }
        }
            return stringBuilder.toString();
    }
    public void saveStore() {
        fileHandler.save(serviceToyStore, "src\\toystore.out");
        System.out.println("Экспорт в (toystore.out) успешно завершён");
    }
    public void readStore() {
        toyStore = (ToyStore<Toy>) fileHandler.loading("src\\toystore.out");
        System.out.println("Импорт из (toystore.out) успешно завершён\n" + toyStore);
    }
}
