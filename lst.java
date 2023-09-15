import java.util.*;
public class lst {
    //Handout:
    //使用链表实现读入一行字符串，并且统计这些单词各自出现的次数，按照单词字典序排序输出这个词典中所有的单词及其出现次数.
    public static void main(String[] argv){
        Vector<String> ret=new Vector<String>();
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            ret.addElement(cin.next());
        }
        List<String> dat = ret;
        Collections.sort(dat);

        int i=0,j;
        while(i!=dat.size()){
            j=i+1;
            while(j!=dat.size()&&dat.get(j).equals(dat.get(i))){
                ++j;
            }
            System.out.printf("%s %d\n",dat.get(i),j-i);
            i=j;
        }
    }    
}
