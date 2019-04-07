package com.javacore.steve.command;

/**
 * ACommand is an abstract class from which all other specific command subclasses are to inherit.
 * Every command has a name, a description and has an execute() method.
 */


public abstract class ACommand {
    /**
     * name or alias of the command
     */
    protected String name;
    /**
     * the command description
     */
    protected String description;

    /**
     * Constructs a command.
     *
     * @param name command name.
     */
    public ACommand(String name) {
        this.name = name;
    }

    /**
     * Executes a command. Should be overridden in a specific command subclass.
     */
    public void execute() {
        System.out.println("command \"" + name + "\"is not implemented");
    }
}
