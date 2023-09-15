public class numeric {
    public static void main(String[] argv){
    //wrapped numeric types: Integer, Double, Float, Long, Short 
    //this example is taken from https://docs.oracle.com/javase/tutorial/java/data/converting.html.
    
    if (argv.length == 2) {
        // convert strings to numbers
        float a = (Float.valueOf(argv[0])).floatValue(); 
        float b = (Float.valueOf(argv[1])).floatValue();

        //output the value of a and b.
        Float x = Float.valueOf(a), y = Float.valueOf(b);
        System.out.println("a="+x.toString() + ", b="+y.toString());

        // do some arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        } else {
        System.out.println("This program " + "requires two command-line arguments.");
        
        }    
    }
}
