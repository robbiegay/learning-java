import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Logger {
    static Scanner myScanner;

    static String fName;
    static String lName;
    static String occupation;
    static String hometown;

    static void runLogger() {
        myScanner = new Scanner(System.in);
        fName = "";
        lName = "";
        occupation = "";
        hometown = "";
        String fileName = "";

        System.out.println("Please enter the FIRST name of the person to be logged:");
        fName = myScanner.nextLine();
        System.out.println("Logged info:\nFirst Name: " + fName);
        System.out.println("Please enter the LAST name of the person to be logged:");
        lName = myScanner.nextLine();
        System.out.println("Logged info:\nFirst Name: " + fName + "\nLast Name: " + lName);
        System.out.println("Please enter the OCCUPATION of the person to be logged:");
        occupation = myScanner.nextLine();
        System.out.println("Logged info:\nFirst Name: " + fName + "\nLast Name: " + lName + "\nOccupation: " + occupation);
        System.out.println("Please enter the HOMETOWN of the person to be logged:");
        hometown = myScanner.nextLine();
        System.out.println("Is this information correct?\nFirst Name: " + fName + "\nLast Name: " + lName + "\nOccupation: " + occupation + "\nHometown: " + hometown);
        
        System.out.println("Please type 'true' or 'false':");
        Boolean isInformationCorrect = myScanner.nextBoolean();
        if (isInformationCorrect) {
            // Create the new file
            try {
                File myFile = new File(fName.toLowerCase() + "_" + lName.toLowerCase() + ".txt");
                if (myFile.createNewFile()) {
                    fileName = myFile.getName();
                    System.out.println("New file created: " + fileName);
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("Failed to create new file.");
                e.printStackTrace();
            }
            // Write to the file
            try {
                FileWriter myWriter = new FileWriter(fileName);
                myWriter.write("First Name: " + fName + "\nLast Name: " + lName + "\nOccupation: " + occupation + "\nHometown: " + hometown);
                myWriter.close();
                System.out.println("Information saved to file.");
            } catch (IOException e) {
                System.out.println("Failed to save information to file.");
                e.printStackTrace();
            }
        } else {
            runLogger();
        }

        System.out.println("Would you like to log another person? (true/false)");
        Boolean keepGoing = myScanner.nextBoolean();
        if (keepGoing) {
            runLogger();
        }
    }

    public static void main(String[] args) {
        System.out.println("~~~ WELCOME TO THE PERSON LOGGER SYSTEM ~~~");
        runLogger();
        System.out.println("Thank you for use the PERSON LOGGER SYSTEM!");
        System.out.println("~~~~~~~~~~~~~~~~~ GOODBYE ~~~~~~~~~~~~~~~~~");
    }
}