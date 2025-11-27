public class CW2 {

    public static boolean sameStarChar(String text){
        for(int i = 1; i < text.length() - 1; i++){
            if(text.charAt(i) == '*'){
                if(text.charAt(i-1) == text.charAt(i+1)){
                    return true;
                }
            }
            //System.out.println(text.charAt(i));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("xa*az"));

        System.out.println(sameStarChar("*xkkaad*"));


    }
}

