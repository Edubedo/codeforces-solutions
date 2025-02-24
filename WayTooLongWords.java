import java.util.Arrays;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        String[] words = new String[n+1]; // Declare array word with a length  of n+1

        for(int i = 0; i<n+1; i++) { // Traverse from 0 to limit
            words[i]=scanf.nextLine(); // We add every element to its position
        }

        for(int i = 0; i < n+1; i++) {
            if(words[i].length() <= n) {
                System.out.println(words[i]);
            }
            else {
                // Conversion
                System.out.print(words[i].charAt(0));
                System.out.print(words[i].length()-2);
                System.out.println(words[i].charAt(words[i].length()-1));
            }
        }
    }
}
