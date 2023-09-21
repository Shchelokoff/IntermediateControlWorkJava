package view;

import view.commands.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> menuList;
    public Menu(ConsoleUI consoleUI) {
        menuList = new ArrayList<>();
        menuList.add(new AddToyInStore(consoleUI));
        menuList.add(new OpenToyStore(consoleUI));
        menuList.add(new Raffle(consoleUI));
        menuList.add(new SaveStore(consoleUI));
        menuList.add(new ReadStore(consoleUI));
        menuList.add(new Finish(consoleUI));
    }
    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < menuList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(menuList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public void execute(int choice){
        Command command = menuList.get(choice-1);
        command.execute();
    }
    public int getSize(){
        return menuList.size();
    }
}
