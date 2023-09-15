//file reading&writing

import java.util.*;
import java.io.*;
public class File{
    public static void main(String[] argv) throws IOException{
        Scanner s = null;
        PrintWriter writer = new PrintWriter("temp2.txt");
        try{
            s=new Scanner(new BufferedReader(new FileReader("temp.txt")));
            //can also write Scanner(System.in)
            while(s.hasNext()){
                int value = s.nextInt();
                System.out.printf("%d ",value);
                writer.printf("%d ",value);
            }
        }
        finally{
            if(s!=null){
                s.close();
            }
            writer.close();
        }

    }
}
