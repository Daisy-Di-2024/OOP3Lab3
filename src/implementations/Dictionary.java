package implementations;

import java.util.ArrayList;

import utilities.DictionaryADT;

public class Dictionary<K, V> implements DictionaryADT<K, V> {
	// constant
	private static final int DEFAULT_SIZE = 10;

	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

	public Dictionary() {
		keys = new ArrayList<>();
		values = new ArrayList<>();
	}

	@Override
	public void insert(K key, V value) {
		// to be implemented
	}

	@Override
	public void remove(K key) {
		// to be implemented
	}

	@Override
	public void update(K key, V newValue) {
		// to be implemented
	}

	@Override
	public V lookup(K key) {
		// to be implemented
		return null; // Placeholder return value
	}

	@Override
	public boolean containsKey(K key) {
		// to be implemented
		return false; // Placeholder return value
	}

}
