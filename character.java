import java.util.Scanner;
import java.lang.Character;
public class character {
    public static void main(String[] argv){
        char ch;
        Scanner cin = new Scanner(System.in);
        ch = cin.nextLine().charAt(0);

        System.out.printf("%d",Character.isLetter(ch)?1:0);
        System.out.printf("%d",Character.isDigit(ch)?1:0);
        System.out.printf("%d",Character.isWhitespace(ch)?1:0);
        System.out.printf("%d",Character.isUpperCase(ch)?1:0);
        System.out.printf("%d",Character.isLowerCase(ch)?1:0);
        System.out.printf("%c",Character.toUpperCase(ch));
        System.out.printf("%c",Character.toLowerCase(ch));
        System.out.println(Character.toString(ch));
        //similarly, there is isDigit, isWhiteSpace, isUpperCase, isLowerCase,
        //to UpperCase, toLowerCase, toString.

    } 
}
