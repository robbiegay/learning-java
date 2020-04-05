// Testing abstract classes and methods; encapsulation

abstract class Person {
    public int age = -1;
    public String occupation = "";
    // Abstract method, creates an empty method for all classes that subclass (extend) Person
    abstract void printText();

    // encapsulation
    private String name;

    // Getter -> Make read only by omitting Setter
    public String getName() {
        return name;
    }

    // Setter -> Make write only by omitting Getter
    public void setName(String newName) {
        this.name = newName;
    }
}

class Student extends Person {
    public int yearInSchool;
    public void printText() {
        System.out.println("I am a student. I am in my " + yearInSchool + " year.");
        if (age != -1 && occupation != "") {
            System.out.println("I am " + age + " years old. I work as a " + occupation);
        }
    }
}