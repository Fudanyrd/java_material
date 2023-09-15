import static java.lang.Math.*;
import java.util.Scanner;
public class JMath {
    public static void main(String[] argv){
        double x;
        Scanner cin = new Scanner(System.in);
        
        //you may also be interested in asin, acos and atan, sqrt.
        x = cin.nextDouble();
        System.out.printf("abs(x) = %f\n",abs(x));
        System.out.printf("exp(x) = %f\n",exp(x));
        System.out.printf("sin(x) = %f\n",sin(x));
        System.out.printf("sqrt(x) = %f\n", sqrt(x));
        System.out.printf("cos(x) = %f\n",cos(x));
        System.out.printf("tan(x) = %f\n",tan(x));

        return;
    } 
}
