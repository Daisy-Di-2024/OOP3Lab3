package utilities;

/**
 * DictionaryADT.java
 *
 * @author
 *         Group Members:
 *         - Di, Daisy
 *         - Huang, An-Ni
 *         - Li, Chen
 *         - Wang, Xiaoshan
 * @version major.minor revision number starting at 1.0
 * 
 *          Class Definition: This interface represents the public contract for
 *          the
 *          implementation of Dictionary for the DictionaryADT Lab.
 */

public interface DictionaryADT<K, V> {
    /**
     * Inserts a new (key, value) pair into the dictionary.
     *
     * @param key   the unique key to be added
     * @param value the value associated with the key
     * @throws IllegalArgumentException if the key already exists in the dictionary
     * @throws NullPointerException     if the key is null
     *                                  Pre-condition: key is not null and does not
     *                                  already exist in the dictionary
     *                                  Post-condition: the (key, value) pair is
     *                                  added to the dictionary
     */
    void insert(K key, V value);

    /**
     * Removes the key and its associated value from the dictionary.
     *
     * @param key the key to be removed
     * @throws IllegalArgumentException if the key does not exist in the dictionary
     * @throws NullPointerException     if the key is null
     *                                  Pre-condition: key is not null and exists in
     *                                  the dictionary
     *                                  Post-condition: the key and its value are
     *                                  removed from the dictionary
     */
    void remove(K key);

    /**
     * Updates the value associated with an existing key.
     *
     * @param key      the key whose value is to be updated
     * @param newValue the new value to be associated with the key
     * @throws IllegalArgumentException if the key does not exist in the dictionary
     * @throws NullPointerException     if the key is null
     *                                  Pre-condition: key is not null and exists in
     *                                  the dictionary
     *                                  Post-condition: the value of the specified
     *                                  key is updated
     */
    void update(K key, V newValue);

    /**
     * Retrieves the value associated with the specified key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value associated with the given key
     * @throws IllegalArgumentException if the key does not exist in the dictionary
     * @throws NullPointerException     if the key is null
     *                                  Pre-condition: key is not null and exists in
     *                                  the dictionary
     *                                  Post-condition: the value associated with
     *                                  the key is returned
     */
    V lookup(K key);
}
