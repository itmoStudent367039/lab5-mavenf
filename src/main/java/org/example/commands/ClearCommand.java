package org.example.commands;

import org.example.collection.MyCollection;

public class ClearCommand implements Command {
    private String name;
    private Type type;
    private MyCollection collection;
    public ClearCommand(String name, Type type, MyCollection collection) {
        this.name = name;
        this.type = type;
        this.collection = collection;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void execute(Object[] args) {
        collection.clear();
    }
}
