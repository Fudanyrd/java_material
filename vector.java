import java.util.Vector;
import java.util.Scanner;
public class vector {
    //Vector::addElement, elementAt
    //handout:
    //������������n��Ԫ�أ�������������ȵ�Ԫ�ضγ�Ϊ�����ƽ̨�����ҳ������ƽ̨��Ԫ�ظ�����
    //INPUT&OUTPUT
    //��һ������һ������n (n<=100);
    //�ڶ�������n��������
    //��������ƽ̨��Ԫ�ظ�����
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
