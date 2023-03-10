import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static class HashMap<K, V> {
        private class Node{
            K key;
            V value;

             Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<Node>[] buckets; // N = buckets.length

        public HashMap() {
            initbuckets(4);
            size = 0;
        }

        private void initbuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }

        public void put(K key, V value) throws Exception {
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);
            if(di!=-1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else{
                Node node = new Node(key,value);
                buckets[bi].add(node);
                size++;
            }
        }

        private int hashfn(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%buckets.length;
        }

        private int getIndexWithinBucket(K key, int bi){
            int di = 0;
            for(Node node : buckets[bi]){
                if(node.key.equals(key)){
                    return di;
                }
                di++;
            }
            return -1;
        }

        public V get(K key) throws Exception {
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);
            if(di!=-1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }

        public boolean containsKey(K key) {
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);
            if(di!=-1){
                return true;
            }
            else{
                return false;
            }
        }

        public V remove(K key) throws Exception {
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);
            if(di!=-1){
                Node node = buckets[bi].remove(di);
                size--;
                return node.value;
            }
            else{
                return null;
            }
        }

        public ArrayList<K> keyset() throws Exception {
            ArrayList<K> keys = new ArrayList<>();
            for(int bi =0;bi<buckets.length;bi++){
                for(Node node:buckets[bi]){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public int size() {
            return size;
        }

        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket " + bi + " ");
                for (Node node : buckets[bi]) {
                    System.out.print( node.key + " -> " + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap();
        String str = br.readLine();
        while (!str.equals("quit")) {
            if (str.startsWith("put")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                Integer val = Integer.parseInt(parts[2]);
                map.put(key, val);
                str = br.readLine();
            } else {
                if (str.startsWith("get")) {
                    String[] parts = str.split(" ");
                    String key = parts[1];
                    System.out.println(map.get(key));
                } else if (str.startsWith("containsKey")) {
                    String[] parts = str.split(" ");
                    String key = parts[1];
                    System.out.println(map.containsKey(key));
                } else if (str.startsWith("remove")) {
                    String[] parts = str.split(" ");
                    String key = parts[1];
                    System.out.println(map.remove(key));
                } else if (str.startsWith("size")) {
                    System.out.println(map.size());
                } else if (str.startsWith("keyset")) {
                    System.out.println(map.keyset());
                } else if (str.startsWith("display")) {
                    map.display();
                }
                str = br.readLine();
            }
        }
    }
}
