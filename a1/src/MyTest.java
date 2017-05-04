
public class MyTest {
    public static void main(String[] args) {

        // Test MyString class
        //testMyString("");
        //testMyString(" ");
        //testMyString("\t");
        //testMyString("Test");
        //testMyString("\t 0 \t test 1  TEST 2 \t \t\t  ");

        testMyString("", "");
        testMyString(" ", "");
        testMyString("", " ");
        testMyString(" ", " ");
        testMyString("abc", "ab");
        testMyString("ab", "abc");
        testMyString("abc", "bc");
        testMyString("Abc", "abC");

        System.out.println("____________________________________________________________________________________");
        System.out.println("Any output above this line indicates there are errors in one of more of your methods");
    }

    // A method to test the MyString class
    public static void testMyString(String s1, String s2) {
        if (s1.equals(s2) != MyString.equals(s1, s2))
            printErrorMessage("Error in method: MyString.equals(s1, s2)", s1, s2);

        if (s1.equalsIgnoreCase(s2) != MyString.equalsIgnoreCase(s1, s2))
            printErrorMessage("Error in method: MyString.equalsIgnoreCase(s1, s2)", s1, s2);

        if (s1.startsWith(s2) != MyString.startsWith(s1, s2))
            printErrorMessage("Error in method: MyString.startsWith(s1, s2)", s1, s2);

        if (s1.endsWith(s2) != MyString.endsWith(s1, s2)) {
            System.out.println(s1 + " " + s2);
            printErrorMessage("Error in method: MyString.endsWith(s1, s2)", s1, s2);
        }
    }

    // A method to print a message to the console
    public static void printErrorMessage(String message, char ch) {
        System.out.println(message);
        System.out.println("ch is: '" + ch + "'");
        System.exit(0); // This statement terminates the program
    }

    // A method to print a message to the console
    public static void printErrorMessage(String message, String str) {
        System.out.println(message);
        System.out.println("str is: \"" + str + "\"");
        System.exit(0); // This statement terminates the program
    }

    // A method to print a message to the console
    public static void printErrorMessage(String message, String str, char ch1, char ch2) {
        System.out.println(message);
        System.out.println("str is: \"" + str + "\"");
        System.out.println("ch1 is: '" + ch1 + "'");
        System.out.println("ch2 is: '" + ch2 + "'");
        System.exit(0); // This statement terminates the program
    }

    // A method to print a message to the console
    public static void printErrorMessage(String message, String s1, String s2) {
        System.out.println(message);
        System.out.println("s1 is: \"" + s1 + "\"");
        System.out.println("s2 is: \"" + s2 + "\"");
        System.exit(0); // This statement terminates the program
    }
}