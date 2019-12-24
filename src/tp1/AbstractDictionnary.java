package tp1;

import java.util.Arrays;

public abstract class AbstractDictionnary implements IDictionnary{
	protected Object[] keys = new Object[0];
	protected Object[] values = new Object[0];
	@Override
	public Object get(Object key) {
		return this.values[this.indexOf(key)];
	}
	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}
	@Override
	public boolean containsKey(Object key) {
		boolean res = false;
		for (Object object : this.keys) {
			if(object == key) {
				res = true;
				break;
			}
		}
		return res;
	}
	@Override
	public int size() {
		return this.keys.length;
	}
	@Override
	public Object put(Object key, Object value) {
		int i = indexOf(key);
		if ( i == -1) {
			i = newIndexOf(key);
			this.keys[i] = key;
			this.values[i] = value;
		} else {
			this.values[i] = value;
		}
		return this;
	}
	
	@Override
	public String toString() {
		return "AbstractDictionnary [key=" + Arrays.toString(keys) + ", value=" + Arrays.toString(values) + "]";
	}
	protected abstract int indexOf(Object o);
	protected abstract int newIndexOf(Object o);
}
