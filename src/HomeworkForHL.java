import java.util.Scanner;

public class HomeworkForHL {


    public static String toHexadecimal(int number){
        String intermediate = "";
        String hex = "";

        // If statement that returns 0 if 0 is used as input
        if(number == 0){
            return "0";
        }

        // The converter
        for(int i = number; i > 0; i = i / 16){ // Automatically divides, used to get to the consecutive whole number
            int remainder = i % 16; // This is the remainder. It's used for getting the decimal value into hexadecimal

            if (remainder <= 9){
                intermediate = intermediate.concat(String.valueOf(remainder));
                // Simple if statement that converts any decimal number to its
                // representative in hexadecimal. Since numbers from 0 to 9
                // are the same in hexadecimal, I can use this method which takes
                // an integer and gets it value in String.

            } else if (remainder == 10) {
                intermediate = intermediate.concat("A");
            } else if (remainder == 11) {
                intermediate = intermediate.concat("B");
            } else if (remainder == 12) {
                intermediate = intermediate.concat("C");
            } else if (remainder == 13) {
                intermediate = intermediate.concat("D");
            } else if (remainder == 14) {
                intermediate = intermediate.concat("E");
            } else if (remainder == 15) {
                intermediate = intermediate.concat("F");
            }
            // For decimal values 10 to 15, ifs are used.

        }
        //System.out.println(intermediate);


        // Flips the string into the correct order
        for(int i = intermediate.length()-1; i >= 0 ; i--){
            // It works by starting from the last index of a String
            // by taking it and putting in a reversed order

            hex += intermediate.charAt(i);
        }

        return hex;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.println("~~Welcome to Decimal-to-Hexadecimal converter~~");
        System.out.println("Type any decimal number. Or type -1 to exit.");

        while(true){

            // Try Catch is used because I can allow only for integers to be passed
            // and if a String, double or any other type is passed, it catches an exception

            try{
                System.out.print("Type a number: ");
                userInput = scanner.nextInt();
                if(userInput >= 0){
                    System.out.println("Decimal: " + userInput +" --> Hexadecimal: "+ toHexadecimal(userInput));
                }else if (userInput == -1){
                    // Allows the user to exit if '-1' is typed
                    System.out.println("Exited The Program");
                    break;
                }else {
                    // This ensures that no non-negative integers are passed
                    System.out.println("Invalid Value");
                    scanner.nextLine();
                }
            } catch (Exception e){
                System.out.println("Something went wrong. Try an integer instead...");
                scanner.nextLine();
            }

        }
    }
}
