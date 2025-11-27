public class HW1 {

    public static int getEvenDigitSum(int number){

        String stringedNumber = String.valueOf(number);
        int sum = 0;
        int lastDigit;
        if (number < 0){
            return -1;
        }

        for(int i = 0; i < stringedNumber.length(); i++){
            // String.valueOf() converts a number to a string
            if(number % 2 == 0){
                lastDigit = number % 10;
                sum += lastDigit;
                number = number / 10;
            }
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
