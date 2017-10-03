import java.util.List;

public interface PrefixMap {

	public boolean isEmpty();

	/*
	 * How many keys are stored in the map
	 */
	public int size();
	
	/*
	 * Get the value corresponding to the key (or null if the key is not found)
	 * if the key contains any character other than A,C,G,T, throw MalformedKeyException
	 * if the key is null, throw IllegalArgumentException
	 */
	public String get(String key);

	/*
	 * Insert the value into the data structure, using the given key. If the key
	 * already existed, replace and return the old value (otherwise return null)
	 * if the key contains any character other than A,C,G,T, throw MalformedKeyException
	 * if the key or value is null, throw IllegalArgumentException
	 */
	public String put(String key, String value);

	/*
	 * Remove the value corresponding to the given key from the data structure,
	 * if it exists. Return the old value, or null if no value was found.
	 * if the key contains any character other than A,C,G,T, throw MalformedKeyException
	 * if the key is null, throw IllegalArgumentException
	 */
	public String remove(String key);

	/*
	 * return the number of keys which start with the given prefix if the prefix
	 * contains any character other than A,C,G,T, throw MalformedKeyException
	 * if the prefix is null, throw IllegalArgumentException
	 */
	public int countKeysMatchingPrefix(String prefix);

	/*
	 * return the collection of keys which start with the given prefix if the
	 * prefix contains any character other than A,C,G,T, throw MalformedKeyException
	 * if the prefix is null, throw IllegalArgumentException
	 */
	public List<String> getKeysMatchingPrefix(String prefix);
	
	/*
	 * Return the number of unique prefixes
	 * e.g. if the tree stores keys GAT, GATTC, GATTACA, this method will return 8
	 * because the possible prefixes are G, GA, GAT, GATT, GATTC, GATTA, GATTAC, GATTACA
	 */
	public int countPrefixes();
		
	/*
	 * Return the sum of the lengths of all keys
	 * e.g. if the tree stores keys GAT, GATTC, GATTACA, this method will return 15
	 */
	public int sumKeyLengths();

}
