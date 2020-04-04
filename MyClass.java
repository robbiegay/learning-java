public class MyClass {
    public static void main(String[] args) {
        
        // W3Schools Java Tutorial

        String myName = "Robbie";
        int myAge = 27, thisMonth = 4, thisYear = 2020;
        float decimalNum = 1.22f;
        char myChar = 'C';
        boolean isItTrue = true;

        System.out.println("Hello world, my name is " + myName + " I am " + myAge + " years old.");
        System.out.println("It is the " + thisMonth + "th month of the year " + thisYear + ".");
        System.out.println("My middle initial is " + myChar + ". Is this true? " + isItTrue);

        // Primitive data types: 8 of them

        // Int types
        byte myByte = 100; // 1 byte, values = -128 - 127
        short myShort = 1000; // 2 bytes, values = -32,768 - 32,767
        int myInt = 64000; // 4 bytes, values = -2bn~ - 2bn~
        long myLong = 4000000000L; // 8 bytes, values = -1e18 - 1e18
        
        // decimal types
        float myFloat = 0.1234567f; // 4 bytes, values up to 7 decimal places (positive or negative)
        double myDouble = 0.1234567890d; // 8 bytes, values up to 15 decimal places (pos or neg)
        float mySciNotation = 14e12f; // can also do scientific notation

        char myNewChar = 23; // 2 bytes, can be either a char ('r'), or numbers for ASCII

        boolean myBool = false; // 1 bit, true or false

        // Note on byte and bits -> a bit is 0 or 1, a byte is 8 bits -> giving values 0-255

        String testText = "This is a line of text";
        System.out.println(testText + "\nI added a new line");
        System.out.println("Hmm, I wonder what a 'carriage return' does? Now testing...\r...testing...");
        // Looks like a carriage return takes what is after it and inserts it at the beginning of the line
        // overwriting whatever was already there
        System.out.println("\tI can insert a tab");
        System.out.println("What does backspace do?\b...");
        // Intuitively, backspace deletes a word from your string
        System.out.println("What does form feed do?\f");
        // Form feed seems to insert a blank line, then a new line after that from a next paragraph
        System.out.println(testText);

        System.out.println("A random value, inclusive of 0, exclusive of 1: " + Math.random());

        int i = 0;
        while (i < 5) {
            System.out.println("Counting to 5: " + i);
            i++;
        }

        // for each -> for arrays
        String[] cars = {"Ford", "Toyota", "BMW", "Mustang"};
        for (String item : cars) {
            System.out.println("This is an item in the array: " + item);
        }

        // continue and break in loops
        int newTestInt = 0;
        while (true) {
            if (newTestInt == 0) {
                System.out.println("Print 0, 1, 3, 4, 5");
            } else if (newTestInt == 2) {
                System.out.println("Skip 2");
                newTestInt++;
                continue;
            } else if (newTestInt == 6) {
                System.out.println("End after 5");
                break;
            }
            System.out.println(newTestInt);
            newTestInt++;
        }
    }
}