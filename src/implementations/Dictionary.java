package implementations;

import java.util.ArrayList;

import utilities.DictionaryADT;

public class Dictionary<K, V> implements DictionaryADT<K, V> {
	// constant
	private static final int DEFAULT_SIZE = 10;

	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

	@Override
	public void insert(K key, V value) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'insert'");
	}

	@Override
	public void remove(K key) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'remove'");
	}

	@Override
	public void update(K key, V newValue) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

	@Override
	public V lookup(K key) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'lookup'");
	}

}
