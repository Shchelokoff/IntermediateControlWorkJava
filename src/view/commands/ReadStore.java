package view.commands;

import view.ConsoleUI;

public class ReadStore extends Command{
    public ReadStore(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Загрузить информация об игрушках из базы данных в магазина";
    }
    public void execute(){
        consoleUI.readStore();
    }
}
