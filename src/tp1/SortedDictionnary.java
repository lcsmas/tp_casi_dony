package tp1;

public class SortedDictionnary extends OrderedDictionnary {
	
	@Override
	protected int newIndexOf(Object o) {
		Comparable<Object> cKey = (Comparable<Object>)o;
		Object[] newKeys = new Object[keys.length +1];
		Object[] newValues = new Object[keys.length +1];
		int i = 0, ret = 0;
		while(i < keys.length && cKey.compareTo(keys[i]) > 0) {
			newKeys[i] = keys[i];
			newValues[i] = values[i];
			i++;
		}
		ret = i;
		newKeys[i] = null;
		newValues[i] = null;
		if(i != keys.length) {
			for(int j = i + 1; j < newKeys.length; j++) {
				newKeys[j] = keys[j-1];
				newValues[j] = values[j-1];
			}
		}
		keys = newKeys;
		values = newValues;
		return ret;
	}

}
