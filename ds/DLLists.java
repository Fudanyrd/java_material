public class DLLists {
    public static class DLListNode<T>{
        T value;
        private DLListNode<T> left, right;
        DLListNode(){
            left = right = null;
        }
        DLListNode(T val){
            this.value = val;
            this.left = this.right = null;     
        }

        void insert(T val){
            DLListNode<T> Left = this.left, temp = new DLListNode<T>(val);
            temp.left = Left;
            temp.right = this;
            this.left = temp;
            Left.right = temp;
        }
        void append(T val){
            DLListNode<T> Right = this.right, temp = new DLListNode<T>(val);
            temp.left = this;
            this.right = temp;
            temp.right = Right;
            Right.left = temp;
        }

    }    

    public static class DLList<T>{
        DLListNode<T> Left, Right;
        int _Size;

        DLList(){
            Left = new DLListNode<T>();
            Right = new DLListNode<T>();
            Left.right = Right;
            Right.left = Left;
            _Size = 0;
        }

        final DLListNode<T> begin(){
            return Left.right;
        }
        final DLListNode<T> end(){
            return Right;
        }
        
        void addElement(T val){
            Right.insert(val);
            ++_Size;
        }
        void push_front(T val){
            Left.append(val);
            ++_Size;
        }

        DLListNode<T> erase(DLListNode<T> pt){
            DLListNode<T> l = pt.left, r = pt.right;
            l.right = r;
            r.left = l;
            --_Size;
            return r;
        }

        void clear(){
            Left.right = Right;
            Right.left = Left;
            _Size = 0;
        }
    }

    public static void main(String[] argv){
        DLList<Integer> lst = new DLList<Integer>();
        for(int i = 0;i!=100;++i){
            lst.addElement(i);
        }
        DLListNode<Integer> i = lst.begin();
        while(i!=lst.end()){
            if(i.value.intValue()%5==0){
                lst.push_front(i.value.intValue());
                i = lst.erase(i);
            }
            else i = i.right;
        }

        for(DLListNode<Integer> j = lst.begin();j!=lst.end();j=j.right){
            System.out.printf("%d ",j.value.intValue());
        }
        return;
    }
}
