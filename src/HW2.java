public class HW2 {

    public static int getDigitCount(int number){
        if(String.valueOf(number).contains("-")){
            return -1;
        }

        return String.valueOf(number).length();
        // Converting into a String to get the digit count
    }

    public static int reverse(int number){
        int reversedNumber = 0;

        // Number reversing logic
        while(number != 0)
        {
            int digit = number % 10;
            reversedNumber = reversedNumber*10 + digit;

            number /= 10;
        }
        //System.out.println("reversed: " + reversedNumber);
        return reversedNumber;

    }

    public static String numbersToWords(int number){
        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number); // calls a method and gives the count of digits
        String finalNumber = "";

        if(digitCount == -1){
            return "Invalid Value";
        }


        for(int i = 0; i < digitCount; i++){
            // The way this works is that it takes digit count into consideration
            // it goes on until it reaches the value of digitCount
            // It'll divide with a remainder 0 by 10 and will concatenate "Zero" as shown in the 'if'
            int result = reversedNumber % 10;
            reversedNumber /= 10;

            if(result == 0){
                finalNumber += "Zero ";
            }else if (result == 1){
                finalNumber += "One ";
            } else if (result == 2) {
                finalNumber += "Two ";
            } else if (result == 3) {
                finalNumber += "Three ";
            } else if (result == 4) {
                finalNumber += "Four ";
            } else if (result == 5) {
                finalNumber += "Five ";
            } else if (result == 6){
                finalNumber += "Six ";
            } else if (result == 7) {
                finalNumber += "Seven ";
            } else if (result == 8) {
                finalNumber += "Eight ";
            } else if (result == 9) {
                finalNumber += "Nine ";
            }

        }
        return finalNumber;
    }

    public static void main(String[] args) {
        System.out.println(numbersToWords(123));
        System.out.println(numbersToWords(1010));
        System.out.println(numbersToWords(1000));
        System.out.println(numbersToWords(-12));
    }
}
