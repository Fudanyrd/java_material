public class linked_list{
    public static class LinkedListNode<T>{
        private LinkedListNode<T> next;
        public T value;
        
        public LinkedListNode(){
            this.next = null;
        }
        public LinkedListNode(T val) {
            this.next = null;
            this.value = val;
        }

        void append(T val){
            LinkedListNode<T> Next = this.next;
            this.next = new LinkedListNode<T>(val);
            (this.next).next = Next;
            return; 
        }

    }
    public static class LinkedList<T>{
        LinkedListNode<T> first, last;
        LinkedList(){
            first = new LinkedListNode<T>();
            first.next = null;
            last = first;
        }

        void append(T val){
            LinkedListNode<T> temp = new LinkedListNode<T>(val);
            last.next = temp;
            last = temp;
        }

        int size(){
            LinkedListNode<T> temp = first;
            int sz = 0;
            while(temp!=last){
                temp = temp.next;
                ++sz;
            }
            return sz;
        }
    }

    public static void main(String[] argv){
        LinkedList<Integer> lst = new LinkedList<Integer>(); 
        for(int i = 0;i!=3;++i){
            lst.append(i);
        }
        System.out.println(lst.size());
        for(LinkedListNode<Integer> i = lst.first.next;i!=null;i=i.next){
             System.out.printf("%d ",i.value.intValue());            
        }
        return;
    }
     
}