
public class Tuple {
    public static abstract class tuple{
        abstract public void output();
    }; 

    public static class dubTuple extends tuple{
        public int x;
        public int y;

        dubTuple(int x, int y){
            this.x = x; this.y = y;
        }
        dubTuple(){
            this.x = this.y = 0;
        }
        public void output() {
            System.out.printf("(%d, %d)", this.x,this.y);
        }

    }

    public static class triTuple extends dubTuple{
        public int z;

        triTuple(int x,int y,int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        triTuple(){
            this(0,0,0);
        }

        public final void output(){
            System.out.printf("(%d, %d, %d)",this.x,this.y,this.z);
        }
    }

    public static void main(String[] argv){
        dubTuple a = new Tuple.dubTuple(23,44);
        System.out.printf("a = ");
        a.output();

        triTuple b = new Tuple.triTuple(-12, 53, -88);
        System.out.printf("\nb = ");
        b.output();

        return; 

    }
}
