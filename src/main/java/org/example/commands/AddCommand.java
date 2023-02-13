package org.example.commands;

import org.example.collection.MyCollection;
import org.example.objects.Product;

public class AddCommand implements Command {
    private String name;
    private Type type;
    MyCollection collection;
    public AddCommand(String name, Type type, MyCollection collection) {
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
        collection.addElement((Product) args[0]);
    }
}
