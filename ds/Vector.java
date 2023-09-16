public class Vector extends Exception{
    public static class Vec<T> {
        T[] data;
        private int avail, limit;

        Vec(){
            avail = 0;
            limit = 4;
            data = (T []) new Object[4]; 
        }
        Vec(int size){
            avail = limit = size;
            data = (T []) new Object[size];
        }

        void addElement(T val){
            if(avail == limit)
                resize();
            data[avail++] = val;
        }

        private void resize(){
            T[] new_data = (T []) new Object[limit*2];
            for(int i=0;i!=avail;++i){
                new_data[i] = data[i];
            }   
            limit*=2;
            data = new_data; 
        }

        final int size(){
            return avail;
        }

        T elementAt(int i){
            if(i>=avail){
                return null;
            }
            return data[i];
        }
    } 

    public static void main(String[] argv){
        String[] magicians = {"Wilson", "Carpenter", "Michael", "Jack"};
        Vec<String> collection = new Vec<String>();
        for(int i=0;i!=magicians.length;++i){
            collection.addElement(magicians[i]);
        }

        for(int i=0;i!=collection.size();++i){
            System.out.printf("%s, that\'s a wonderful performance!\n",
            collection.elementAt(i));
        }

        System.out.println("I couldn\'t wait to see your next performance! Thx!");
    }
}
