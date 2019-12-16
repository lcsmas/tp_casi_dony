package tp_casi_dony;

public abstract class AbstractDictionnary implements IDictionnary{
	protected Object[] key = new Object[0];
	protected Object[] value = new Object[0];
	@Override
	public Object get(Object key) {
		return this.value[this.indexOf(key)];
	}
	@Override
	public boolean isEmpty() {
		return this.value.length == 0;
	}
	@Override
	public boolean containsKey(Object key) {
		boolean res = false;
		for (Object object : this.key) {
			if(object == key) {
				res = true;
				break;
			}
		}
		return res;
	}
	@Override
	public int size() {
		return this.key.length;
	}
	@Override
	public Object put(Object key, Object value) {
		int i = indexOf(key);
		if ( i == -1) {
			i = newIndexOf(key);
			this.key[i] = key;
			this.value[i] = value;
		} else {
			this.value[i] = value;
		}
		return this;
	}
	protected abstract int indexOf(Object o);
	protected abstract int newIndexOf(Object o);
}
