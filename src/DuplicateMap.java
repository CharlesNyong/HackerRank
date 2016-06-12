
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateMap<K, V> {

    private Map<K, ArrayList<V>> m = new HashMap<>();
    private static int size;
    
    public void put(K k, V v) {
        if (m.containsKey(k)) {
            m.get(k).add(v);
        } else {
            ArrayList<V> arr = new ArrayList<>();
            arr.add(v);
            m.put(k, arr);           
        }
    }

    public boolean set(K k, V v) {
        if (m.containsKey(k)) {
            ArrayList<V> arr = m.get(k);
            for(int i =0; i<arr.size(); i++){
            	arr.set(i, v);
            }
         return true;   
        }  
     return false;   
    }
    
    public Set<K> keySet(){
    	return m.keySet();
    }
    
     public ArrayList<V> get(K k) {
        return m.get(k);
    }

    public V get(K k, int index) {
        return m.get(k).size()-1 < index ? null : m.get(k).get(index);
    }
}