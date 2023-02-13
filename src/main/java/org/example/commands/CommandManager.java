package org.example.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class CommandManager {
    List<Command> commandMap = new ArrayList<>();

    public void addCommand(Command command) {
        commandMap.add(command);
    }

    public void execute(String commandName,Object[] args)  {
        AtomicBoolean executed = new AtomicBoolean(false);
        commandMap.stream().filter(a -> a.getName().equals(commandName)).findAny().ifPresent(a -> {a.execute(args); executed.set(true);});
        if (!executed.get()) {
            System.out.println("Такой команды нет");
        }
    }
}
