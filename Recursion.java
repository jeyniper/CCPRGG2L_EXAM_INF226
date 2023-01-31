import java.util.Scanner;
public class Removeletters {

    private static final String VOWELS = "aeiou";
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String fullName=scan.nextLine();
        fullName=fullName.toLowerCase();
        char lastLetter = fullName.charAt(fullName.lastIndexOf(" ") + 1);
        System.out.print("Output: ");
        if (VOWELS.indexOf(lastLetter) != -1) {
            System.out.println(removeLetters(fullName));
        } else {
            System.out.println(removeLetters(fullName.replaceAll("[aeiou]", "")));
        }
    }
    
     public static String removeLetters(String name) {
        
        if (name.length() == 0) return "";
        if (VOWELS.indexOf(name.charAt(0)) == -1) {
            return name.charAt(0) + removeLetters(name.substring(1));
        } else {
            return removeLetters(name.substring(1));
        }
    }
    
    
}
