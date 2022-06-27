package dev.panda.java;

public class Program1 {
    public static void main(String[] args) {

        //Primitive Data Types
        int number = 10;
        double decimalNumber = 3.5;
        boolean trueFalse = true;
        char letter = 'A';

        //Non-Primitive Data Types
        Integer number2 = 10;
        Double double2 = 3.5;
        Boolean boolean2 = true;
        Character character = 'A';

        int result = printMessage("Test!");
        System.out.print(result);
    }
    private static int printMessage(String message) {
     System.out.print(message);
     return 12;
    }
}
