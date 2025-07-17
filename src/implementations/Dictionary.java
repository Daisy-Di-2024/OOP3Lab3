package implementations;

import java.util.ArrayList;

import exceptions.DuplicateKeyException;
import utilities.DictionaryADT;

public class Dictionary<K, V> implements DictionaryADT<K, V> {
	// constant
	private static final int DEFAULT_SIZE = 10;
	private int capacity;

	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

	public Dictionary() {
		this(DEFAULT_SIZE);
	}

	public Dictionary(int size) {
		create(size);
	}

	@Override
	public void create(int size) {
		this.capacity = size > 0 ? size : DEFAULT_SIZE;
        this.keys = new ArrayList<>(capacity);
        this.values = new ArrayList<>(capacity);
	}

	@Override
	public boolean insert(K key, V value) throws DuplicateKeyException {
        if (keys.contains(key)) {
            throw new DuplicateKeyException("Key already exists: " + key);
        }
        keys.add(key);
        values.add(value);
        return true;
	}

	@Override
	public V remove(K key) {
		int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        }
        keys.remove(index);
        return values.remove(index);
	}

	@Override
	public boolean update(K key, V newValue) {
		int index = keys.indexOf(key);
        if (index == -1) {
            return false;
        }
        values.set(index, newValue);
        return true;
	}

	@Override
	public V lookup(K key) {
		int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        }
        return values.get(index);
	}

}
