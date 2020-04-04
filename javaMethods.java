public class javaMethods {
    static void myMethod() {
        System.out.println("This line runs from my method!");
    }

    static void name(String fname, String lname) {
        System.out.println("Hello, " + fname + " " + lname + ".");
    }

    // method overloading -> allows you to have multiple parameter type options
    static int myFunc(int x) {
        return x;
    }
    static double myFunc(double x) {
        return x;
    }

    public static void main(String[] args) {
        myMethod();
        name("Robbie", "Gay");
        int x = myFunc(1);
        System.out.println("You entered the variable " + x + ".");
        double y = myFunc(1.0);
        System.out.println("You entered the variable " + y + ".");
    }
}