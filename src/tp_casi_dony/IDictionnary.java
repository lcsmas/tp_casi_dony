package tp_casi_dony;

public interface IDictionnary {
	Object get(Object key);
	Object put(Object key, Object value);
	boolean isEmpty();
	boolean containsKey(Object key);
	int size();
}
