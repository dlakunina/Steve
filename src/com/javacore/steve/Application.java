package com.javacore.steve;

import com.javacore.steve.profile.ProfileController;
import com.javacore.steve.state.ApplicationState;


/**
 * The Application class is a CLI for the project com.javacore.steve. "Steve" is a programme, modelling some activities
 * of a forensic scientist. Moreover, the programme is capable of holding a simple conversation on some general
 * topics, such as weather, music preferences, news, etc...
 * So far the program supports two commands: CommandAuthor and CommandVersion, which are described in the corresponding
 * classes.
 *
 * @author dasha
 * @version 0.0.0
 */


public class Application {
    /**
     * The field APP_NAME stores the name of the application
     */
    static public final String APP_NAME = "Steve";
    /**
     * the field AUTHOR stores the name of the application's author
     */
    static public final String AUTHOR = "Daria";
    /**
     * the field VERSION stores the version data
     */
    static public final String VERSION = "0.0.0";
    static ApplicationState currentState;

    /**
     * The main entry point function.
     *
     * @param args the arguments of the programme.
     */
    public static void main(String[] args) {
        ProfileController profileController = new ProfileController();
        profileController.showProfile(1);
        /*changeState(new StateIdle(), "idle");
        String testCommand = "test command";
        currentState.onCommand(testCommand);

        //      for (int i = 0; i < 10; i++) {
        //        currentState.onCommand(commandName + i);
        // }

        //or maybe
        for (String commandName : args) {
            currentState.onCommand(commandName);
        }

      /*  System.out.println("Hello, my name is " + APP_NAME);
        //System.out.println("my author is " + AUTHOR);
        for (String commandName : args) {
            ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
            command.execute();
        }
        //command = CommandRegistry.INSTANCE.getCommand(commandName);
        //command.execute();
        //CommandRegistry.INSTANCE.listCommands();

        /*ACommand command = new ACommand("anonymous"){
            @Override
            public void execute(){
                System.out.println("Executing anonymous...");

            }*/


    }

    public static void changeState(ApplicationState newState, String commandName) {
        if (currentState != null) {
            currentState.exit();
        }
        currentState = newState;
        currentState.enter(commandName);
    }


}

