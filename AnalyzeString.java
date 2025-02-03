import java.util.*;

public class identifyChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, specialChars = 0, spaces = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digits++;
            } else if (Character.isLetter(c)) {
                char C = Character.toLowerCase(c);
                if (C == 'a' || C == 'e' || C == 'i' || C == 'o' || C == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isWhitespace(c)) {
                spaces++;
            } else {
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + specialChars);
    }
}
