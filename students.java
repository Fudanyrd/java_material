import java.util.*;
import java.io.*;

public class students {
    public static class student_info implements Comparable<student_info>{
        public String name;
        public double Math, English;

        student_info(){
            Math = English = 0;
        }
        student_info(Scanner cin){
            name = cin.next();
            Math = cin.nextDouble();
            English = cin.nextDouble();
            return;
        }

        public int compareTo(students.student_info o) {
            return name.compareTo(o.name);
        }
        public boolean equals(students.student_info o){
            if(!(o instanceof students.student_info)){
                return false;
            }
            return name.equals(o.name);
        }

        public final void output(){
            System.out.printf("%-12s %.2f\n",name, (Math+English)*0.5);
        }
    }

    public static void main(String[] argv){
        try {
            Scanner s = new Scanner(new BufferedReader(new FileReader("student_info.txt")));
            Vector<students.student_info> ret = new Vector<students.student_info>();
            while(s.hasNext()){
                ret.addElement(new students.student_info(s));
            }
            List<students.student_info> dat = ret;
            Collections.sort(dat);
            
            for(int i =0;i!=dat.size();++i){
                dat.get(i).output();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found. Terminate.");
            return;
        }
        finally{
            //
        }

    }
}
