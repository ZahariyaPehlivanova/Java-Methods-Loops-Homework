import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate3LetterWords02 {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write a word");
        String input = Console.nextLine();

        List<String> result = new ArrayList<String>();

        for (int a = 0; a < input.length(); a++) {
            for (int b = 0; b < input.length(); b++) {
                for (int c = 0; c < input.length(); c++) {
                    String letter = ""+input.charAt(a)+input.charAt(b)+input.charAt(c);
                    if (!result.contains(letter)) {
                        System.out.print(letter + " ");
                        result.add(letter);
                    }
                    else{
                        continue;
                    }
                }
            }
        }
    }
}
