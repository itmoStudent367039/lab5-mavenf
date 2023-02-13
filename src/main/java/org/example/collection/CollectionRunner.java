package org.example.collection;

import org.example.commands.AddCommand;
import org.example.commands.CommandManager;
import org.example.commands.Type;
import org.example.objects.Product;

public class CollectionRunner {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        CommandManager manager = new CommandManager() {{
            addCommand(new AddCommand("add", Type.ONEARGUMENT, collection));
        }};
        manager.execute("add", new Object[] {new Product()});
    }
}