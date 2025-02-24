import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the w
        int w = scanner.nextInt();
        // Must be event and greater than 1
        if((w%2==0) && w > 2) { // We dont accept ood numbers
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

/*
Problem
* */

