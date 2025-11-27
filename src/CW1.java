public class CW1 {

    public static String doubleChar(String text){
        String str = "";
        for(int i = 0; i < text.length(); i++){
            //str = str.concat(Character.toString(text.charAt(i)));
            //str = str.concat(Character.toString(text.charAt(i)));

            str = str + text.charAt(i) + text.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }
}
