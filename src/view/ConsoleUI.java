package view;

import presenter.Presenter;
import java.util.Scanner;

public class ConsoleUI implements View {
    private static final String INPUT_ERROR = "Вы ввели неверное значение";
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private Menu menu;
    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new Menu(this);
    }
    @Override
    public void print(String text) {
        System.out.println(text);
    }
    @Override
    public void start() {
        hello();
        while (work){
            printMenu();
            execute();
        }
    }
    public void finish() {
        System.out.println("Досвидания!");
        work = false;
    }
    public void addToyInStore() {
        System.out.println("Введите название игрушки");
        String name = scanner.nextLine();
        System.out.println("Укажите вероятность выигрыша игрушки в лотереи: ");
        int frequency = Integer.parseInt(scanner.nextLine());
        presenter.addToyInStore(name, frequency);
        System.out.println("Игрушка успешно добавлена для розыгрыша в лотерею");
    }
    public void getRaffle() {
        System.out.println("Вам выпал следующий приз: ");
        presenter.getRaffle();
    }
    private void hello(){
        System.out.println("Доброго времени суток!");
    }
    public void openToyStore(){
        presenter.getToyStoreInfo();
    }
    private void execute(){
        String line = scanner.nextLine();
        if (checkTextForInt(line)){
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)){
                menu.execute(numCommand);
            }
        }
    }
    private boolean checkTextForInt(String text){
        if (text.matches("[0-9]+")){
            return true;
        } else {
            inputError();
            return false;
        }
    }
    private boolean checkCommand(int numCommand){
        if (numCommand <= menu.getSize()){
            return true;
        } else {
            inputError();
            return false;
        }
    }
    public void saveStore() {
        presenter.saveStore();
    }
    public void readStore() {
        presenter.readStore();
    }
    private void printMenu(){
        System.out.println(menu.menu());
    }
    private void inputError(){
        System.out.println(INPUT_ERROR);
    }
}
