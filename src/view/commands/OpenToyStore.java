package view.commands;

import view.ConsoleUI;

public class OpenToyStore extends Command{
    public OpenToyStore(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Посмотреть состав игрушек магазина для лотереи";
    }
    public void execute(){
        consoleUI.openToyStore();
    }
}
