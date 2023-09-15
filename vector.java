import java.util.Vector;
import java.util.Scanner;
public class vector {
    //Vector::addElement, elementAt
    //handout:
    //设有序数组有n个元素，数组中连续相等的元素段称为数组的平台。试找出数组最长平台的元素个数。
    //INPUT&OUTPUT
    //第一行输入一个整数n (n<=100);
    //第二行输入n个整数。
    //输出数组最长平台的元素个数。
    public static void main(String[] argv){
        int size;
        Vector<Integer> ret = new Vector<Integer>();
        Scanner cin = new Scanner(System.in);

        size = cin.nextInt();
        for(int i=0;i!=size;++i){
            ret.addElement(Integer.valueOf(cin.nextInt()));
        }        

        int i=0, j, max = 0;
        while(i!=size){
            j = i+1;
            while(j!=size&&ret.elementAt(j).intValue() == ret.elementAt(i).intValue()){
                ++j;
            }
            if(j-i > max) max = j-i;
            i=j;
        }

        System.out.print(max);
    }
}
