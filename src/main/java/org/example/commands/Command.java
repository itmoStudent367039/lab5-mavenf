package org.example.commands;

public interface Command {
    String getName();
    Type getType();
    void execute();
}
