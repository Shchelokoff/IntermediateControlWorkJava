package view.commands;

import view.ConsoleUI;

public class SaveStore extends Command{
    public SaveStore(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сохранить информацию об игрушках в базу данных магазина";
    }
    public void execute(){
        consoleUI.saveStore();
    }
}