// importing classes
// java.util is the java package (java.util.* -> import the entire package)
// java.util.Scanner imports the Scanner class
import java.util.Scanner;

public class JavaClasses {

    // w3schools Java Classes section

    // Java is an OOP language
    // Meaning, everything revolves arounds classes and objects
    // and their methods (functions) and attributes (values associated with them)

    // A class is like a template (ex. cars)
    // An object is an instance of that template (ex. volvo)
    // Methods of the class cars can be used by volvo (ex. volvo.drive() )
    // Attributes of cars can be accessed by volvo (ex. volvo.weight)

    // Classes = capitalize the first letter

    // Can have different classes in the same directory, and can call new classes from the other file
    
    int x = 5;

    public static void main(String[] args) {
        JavaClasses myObj1 = new JavaClasses();
        JavaClasses myObj2 = new JavaClasses();
        System.out.println("results: " + myObj1.x + " and another result: " + myObj2.x);

        // Uses a class initializer that takes in two parameters
        Cars volvo = new Cars(100, 2020);
        System.out.println("My car weights " + volvo.weight + " pounds.\nMy car is a " + volvo.year + " model.");
    
        // Using abstract classes and methods
        Student myStudent = new Student();
        myStudent.yearInSchool = 3;
        myStudent.printText();
        System.out.println("Now I define more attributes of 'myStudent', and more info is printed.");
        myStudent.age = 21;
        myStudent.occupation = "baker";
        myStudent.printText();

        // Testing private var and Getter/Setter
        myStudent.setName("Rob");
        System.out.println(myStudent.getName());

        // Using an imported class: Java's Scanner

        // Creates a new Scanner object, intaking the System's inputs
        Scanner myScanner = new Scanner(System.in);
        // Asks user for a username
        System.out.println("Enter a username:");
        // Scanner reads whatever is inputted here
        String username = myScanner.nextLine();
        // Returns the data gathered by the Scanner object
        System.out.println("Your username is: " + username);
    }    
}