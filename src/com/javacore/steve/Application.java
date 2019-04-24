package com.javacore.steve;

//import com.javacore.steve.state.ApplicationState;

//import com.javacore.steve.state.ApplicationState;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Application class is a CLI for the project com.javacore.steve. "Steve" is a program, modelling some activities
 * of a forensic scientist. Moreover, the programme is capable of holding a simple conversation on some general
 * topics, such as weather, music preferences, news, etc...
 * So far the program supports two commands: CommandAuthor and CommandVersion, which are described in the corresponding
 * classes.
 *
 * @author dasha
 * @version 0.0.0
 */


public class Application {

    //"SELECT id, firstName. lastName FRON Criminals";

    public static final String OP_GROUP = "(SELECT|DELETE)";
    public static final String FLD_GROUP = "([*a-zA-Z, ]+)";
    public static final String SPACE = "([\\s]+)";
    public static final String FROM_GROUP = "(FROM)";
    public static final String TBL_GROUP = "([a-zA-Z]+)$";


    // public static final String ALLOWED_DOMAIN_NAMES = "^([a-zA-Z0-9]+\\.)+(com|de|ru)$";

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


    /**
     * The main entry point function.
     *
     * @param args the arguments of the program.
     *             /*
     */
    public static void main(String[] args) {
        String query = "SELECT *, id, firstName, lastName FROM Criminals";
        Pattern pattern = Pattern.compile(OP_GROUP + SPACE + FLD_GROUP + SPACE + FROM_GROUP + SPACE + TBL_GROUP);
        Matcher matcher = pattern.matcher(query);
        if (matcher.find()) {
            System.out.println("Number of groups: " + matcher.groupCount());
            for (int i = 0, len = matcher.groupCount(); i <= len; i++) {
                System.out.println("Group" + i + ": " + matcher.group(i));
            }
        }

       /* List<String> list = new ArrayList<>();
        list.add("developer.apple.com");
        list.add("google.com");
        list.add("wrong.");
        list.add(".another");
        list.add("this is a wrong domain name");
        list.add("facebook.com");
        list.add("handelsblatt.de");
        list.add("facebook.com");

        list.add("nasa.gov");
        list.add("mail.ru");


        printList(list, ALLOWED_DOMAIN_NAMES);

       /* List<String[]> records = DataBase.readDataFile("/home/dasha/IdeaProjects/Steve/resources/Criminals.tbl");
        Table table = new Table("Criminals", Arrays.asList(new String[]{"id", "name", "deceased"}));

        for (String[] values : records) {
            Record record = new Record(table);
            record.setValues(values);
            table.insert(record);
        }


       /* DataBase db = new DataBase();
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                try{
                    Thread.sleep(1000);
                    db.select();
                } catch (InterruptedException e){
            }
        }

        Runnable runnable1 = new Runnable() {
             @Override
             public void run() {
                    try {
                        Thread.sleep(10000);
                        db.update();
                    } catch (InterruptedException e) {

                    }
            }
        };
            thread1.start();
            runnable1.start();*/
       /* List<String> columns = new ArrayList<>();
        columns.add("id");
        columns.add("firstName");
        columns.add("lastName");
        Table criminalTable = new Table("Criminals", columns);
        List<String> values = new ArrayList<>();
        List<String> values2 = new ArrayList<>();
        values.add("1");
        values.add("Vladimir");
        values.add("Tramp");
        values2.add("2");
        values2.add("Donald");
        values2.add("Timoshenko");
        criminalTable.insert(new Record(values));
        criminalTable.insert(new Record(values2));

        List<String> result = criminalTable.selectField("lastName");
        for (String s: result) {
            System.out.println(s);
        }
       ConsoleCanvas canvas = new ConsoleCanvas(20, 20);
        canvas.reset();
        canvas.drawSquare(3, 3, 5);
        canvas.draw();

        //ProfileController profileController = new ProfileController();
        //profileController.showProfile(51);
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

        // Two options for creating threads.

        // Runnable is an interface.
//        Runnable runnable1 = new Runnable() {
////            @Override
////            public void run() {
////                for (int i = 0; i < 100; i++) {
////                    System.out.printf("-");
////                    try {
////                        Thread.sleep(100);
////                    } catch (InterruptedException e) {
////
////                    }
////                }
////            }
////        };

//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.print(".");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//
//                    }
//                }
//                System.out.println("done!");
//            }
//        };

//        // Running two threads at the same time.
//        System.out.printf(thread.getState() + ""); // Prints thread state.
//        (new Thread(runnable1)).start();
//        thread.start();
//        System.out.printf(thread.getState() + "");

//        System.out.print("\nLoading");
//        thread.start();
    }

  /*  public static void printList(List<String> list) {
        System.out.println(list);
    }

    public static void printList(List<String> list, String filter) {
        for (String s : list) {
            if (s.matches(filter)) {
                System.out.println(s);
            }
        }
    }

    public static void foreachCleanup(List<String> list, String filter) {
        for (String s : list) {
            if (!s.matches(filter)) {
                list.remove(s);
            }
        }
    }

    public static void iteratorCeanup(List<String> list, String filter) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (!s.matches(filter)) {
                list.remove(s);
            }
        }
    }

   /* public static void changeState(ApplicationState newState, String commandName) {
        if (currentState != null) {
            currentState.exit();
        }
        currentState = newState;
        currentState.enter(commandName);
    }*/


}

