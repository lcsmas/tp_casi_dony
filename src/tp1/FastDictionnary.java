package tp1;

public class FastDictionnary extends AbstractDictionnary {
	public FastDictionnary() {
		this.keys = new Object[1];
		this.values = new Object[1];
	}
	@Override
	public int size() {
		int ret = 0;
		for(Object k : keys) {
			if(k != null) {
				ret++;
			}
		}
		return ret;
	}
	private boolean mustGrow() {
		return ((size()+1)/keys.length) > (3/4);
	}
	private void grow() {
		Object[] nKeys = new Object[(int)(keys.length * 1.1)+1];
		Object[] nValues = new Object[(int)(keys.length * 1.1)+1];
		for(Object k : keys) {
			if(k != null) {
				int growthIndex = k.hashCode() % nKeys.length;
				for(int i = growthIndex; i < nKeys.length; i++) {
					if(nKeys[i] == null) {
						nKeys[i] = k;
						nValues[i] = get(k);
						break;
					}
				}
			}
		}
		keys = nKeys;
		values = nValues;
	}
	@Override
	protected int indexOf(Object o) {
		int index = o.hashCode() % keys.length;
		for(int i = index; i < keys.length; i++) {
			if(keys[i] == o) {
				return i;
			}
		}
		return -1;
	}
	@Override
	protected int newIndexOf(Object o) {
		while(mustGrow()) grow();
		int index = o.hashCode() % keys.length;
		int ret = -1;
		for(int i = index; i < keys.length; i++) {
			if(keys[i] == null) {
				ret = i;
				break;
			}
		}
		return ret;
	}
	@Override
	public Object put(Object key, Object value) {
		super.put(key, value);
		if(mustGrow()) grow();
		return this;
	}
	
}
