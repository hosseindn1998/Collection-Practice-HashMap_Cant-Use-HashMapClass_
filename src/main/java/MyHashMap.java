import java.util.ArrayList;

public class MyHashMap<K, V> {
    private int size;
    private int capacity;
    private ArrayList<K> keys;
    private ArrayList<V> values;

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.keys = new ArrayList<>(capacity);
        this.values = new ArrayList<>(capacity);
    }

}