package presenter;

import model.service.Service;
import view.View;

public class Presenter {
    private View view;
    private Service service;
    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }
    public void addToyInStore(String name, int frequency) {
        service.AddToyInStore(name, frequency);
    }
    public void getToyStoreInfo() {
        String info = service.getToyStoreInfo();
        view.print(info);
    }
    public void getRaffle() {
        service.getRaffle();
    }
    public void saveStore() {
        service.saveStore();
    }
    public void readStore() {
        service.readStore();
    }
}
