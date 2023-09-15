public class Pair{
    public static class pair<K,E>{
        private K key;
        private E value;

        public K getKey(){
            return key;
        }
        public E getValue(){
            return value;
        }

        public void reValue(K key, E value){
            this.key = key; this.value = value;
        }

        public pair(K key, E value) {
            this.key = key;
            this.value = value;
        }
        public pair(){}

    }

    public static void main(String[] argv){
        pair<Integer, String> ret = new pair<Integer,String>();
        Integer i = 1;
        ret.reValue(i,"Whatever");

        System.out.printf("<%d, %s>",ret.getKey(),ret.getValue());
    } 


}