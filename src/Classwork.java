public class Classwork {

    public static void main(String[] args) {
        String name = "Jonas";

        for(int i = 0; i < name.length(); i++){
            if (name.charAt(i) == 'n'){
                System.out.println("Found letter: " + name.charAt(i));
                // continue; // Jumps to next iteration
                break; // stops the loop (only the loop it's in)
            }
            System.out.println(name.charAt(i));
        }
    }

}
