// Generic Dictionary Class
// Two Generics
// Use Two ArrayLists
// One for the value store, Other for the key store

// .store
// .get
// .keys
// .values
// ToString

// String, String
// .store("Hi", "Good Evening!")
// .get("Hi") -> "Good Evening!"

// int, double
// .store(1, 99.9)
// .get(1) -> 99.9
// .store(0, 98.98)
// .get(0) -> 98.98

//15:30

import java.util.ArrayList;

public class GenericDictionary<T,E> {
    private ArrayList<T> keys = new ArrayList<>();
    private ArrayList<E> values = new ArrayList<>();

    public void store(T key, E value){
        keys.add(key);
        values.add(value);
    }

    public E get(T key){
        return values.get(keys.indexOf(key));
    }

    public ArrayList<E> getValues() {
        return values;
    }

    public ArrayList<T> getKeys() {
        return keys;
    }
}
