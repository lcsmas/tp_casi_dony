package tp_casi_dony;

public class SortedDictionnary extends AbstractDictionnary {
	
	@Override
	protected int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int newIndexOf(Object o) {
		Comparable<Object> cKey = (Comparable<Object>)o;
		Object[] newKeys = new Object[key.length +1];
		Object[] newValues = new Object[key.length +1];
		int i = 0, ret = 0;
		while(i < key.length && cKey.compareTo(key[i]) > 0) {
			newKeys[i] = key[i];
			newValues[i] = value[i];
			i++;
		}
		ret = i;
		newKeys[i] = null;
		newValues[i] = null;
		if(i != key.length) {
			for(int j = i + 1; j < newKeys.length; j++) {
				newKeys[j] = key[j-1];
				newValues[j] = value[j-1];
			}
		}
		key = newKeys;
		value = newValues;
		return ret;
	}

}
