
public class node< K extends Comparable<K>, V > {
    private K key;
    private V value;
    private node<K,V> left;
    private node<K,V> right;
    private boolean red;
    private boolean black ;

    node(K keyarg, V valarg){
        key = keyarg;
        value = valarg;
        left = null;
        right = null;
        red = true;
        black = false;

    }
    public boolean containskey(K keyarg){
        node tmp = this;
        while (tmp != null) {
            if (keyarg.compareTo((K) tmp.key) == 0)
                return true;

        }
        return false;
    }
}
