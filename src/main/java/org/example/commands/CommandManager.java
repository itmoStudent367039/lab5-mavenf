package org.example.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class CommandManager {
    List<Command> commandMap = new ArrayList<>();

    public void addCommand(Command command) {
        commandMap.add(command);
    }

    public void execute(String commandName) {
        byte count = 0;
        for (Command command: commandMap) {
            if (command.getName().equals(commandName)) {
                command.execute();
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Такой комманды нет");
        }
    }
}
