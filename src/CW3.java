public class CW3 {

    public static String toBinary(int number){
        String intermediate = "";
        String binary = "";
        if(number == 0){
            return "0";
        }

        for(int i = number; i > 0; i = i / 2){
            if(i % 2 == 0){
                intermediate += "0";
            } else {
                intermediate += "1";
            }
        }

        for(int i = intermediate.length()-1; i >= 0 ; i--){
            binary += intermediate.charAt(i);
        }

        return binary;
    }

    public static void main(String[] args) {
        System.out.println(toBinary(5));
        System.out.println(toBinary(12));
        System.out.println(toBinary(0));
    }
}
