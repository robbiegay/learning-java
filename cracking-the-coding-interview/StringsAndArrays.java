// Cracking the Coding Interview: Interview Questions Ch. 1
// Todo: Practice creating StringBuilder, HashTable, and ArrayList

public class StringsAndArrays {
    // StringBuilder = takes in an array of strings, outputs a string of all array elements.
    static String StringBuilder(String[] words) {
        String sentence = "";
        for (String s : words) {
            if (sentence.length() == 0) {
                sentence = s;
            } else {
                sentence = sentence + " " + s;
            }
        }
        return sentence;
    }

    // Questions
    // 1.1 Implement a function to determine if a string has all unique characters
    static String uniqueChars(String word) {
        char[] wordArray = word.toCharArray();
        for (char letter : wordArray) {
            // word.pop(0);
            for (char compare : wordArray) {
                if (letter == compare) {
                    System.out.println("Match found: " + letter + " = " + compare);
                    break;
                }
            }
        }
        return "a";
    }

    public static void main(String[] args) {
        String[] testArray = {"hi", "my", "name", "is", "robbie"};
        System.out.println("Result of StringBuilder: " + StringBuilder(testArray));

        String testWord = "eoirgeroifj";
        uniqueChars(testWord);
    }
}
