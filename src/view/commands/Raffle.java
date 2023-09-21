package view.commands;

import view.ConsoleUI;

public class Raffle extends Command{
    public Raffle(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Разыграть лотерею игрушек";
    }
    public void execute(){
        consoleUI.getRaffle();
    }
}
