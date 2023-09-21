package view.commands;

import view.ConsoleUI;

public class AddToyInStore extends Command {
    public AddToyInStore(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить игрушку в магазин для лотереи";
    }
    public void execute(){
        consoleUI.addToyInStore();
    }
}