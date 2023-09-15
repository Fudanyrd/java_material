import java.util.Scanner;
public class string {
    public static void main(String[] argv){
        //method: indexOf, subString, compareTo, equals.
        String standard="Hello world!";
        Scanner cin = new Scanner(System.in);
        String a = cin.nextLine();

        System.out.println(standard.indexOf('w',0));
        System.out.println(standard.indexOf("world",0));
        System.out.println(a.equals(standard));
        System.out.println(a.compareTo(standard));
    } 
}
