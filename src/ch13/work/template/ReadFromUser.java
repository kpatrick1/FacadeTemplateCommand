package ch13.work.template;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUser extends BookReader {
    private static ArrayList<String> userBook = new ArrayList<String>();
    private static Scanner keyboard = new Scanner(System.in);

    @Override
    void initialize() {
        System.out.println("Enter Some Sentences.  Enter 'Exit' when you are complete.");
        String str;
        do {
            System.out.print("=>_");
            str = keyboard.nextLine();
            userBook.add(str);
        } while (!str.toUpperCase().equalsIgnoreCase("exit"));
    }

    @Override
    void startReading() {
        for (String ln : userBook) {
            System.out.println(ln);
        }
    }

    @Override
    void stopReading() {
        System.out.println("Stopped Reading");
    }
    @Override
    public boolean isInteractive() {return true;}
}
