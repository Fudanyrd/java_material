import java.util.Scanner;

public class Parrot{
    public static void main(String[] argv){
        Scanner cin = new Scanner(System.in);
        String message = new String();
        message = cin.nextLine();

        //similar methods: nextInt, nextDouble, nextFloat, next Boolean

        while(!message.equals("bye")){
            System.out.printf("%s\n",message);
            message = cin.nextLine(); 
        }

        return;
    }
}