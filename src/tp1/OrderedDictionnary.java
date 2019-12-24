package tp1;

public class OrderedDictionnary extends AbstractDictionnary {

	@Override
	protected int newIndexOf(Object o) {	
		grow();
		return super.keys.length-1;
	}

	@Override
	protected int indexOf(Object o) {
		int res = -1;
		for (int i = 0; i < keys.length; i++) {
			if(keys[i] == o){
				res = i;
				break;
			}
		}
		return res;
	}	
	
	protected void grow() {
		int newSize = super.keys.length + 1;
		Object[] newKeyArray = new Object[newSize];
		Object[] newValueArray = new Object[newSize];
		System.arraycopy(super.keys, 0, newKeyArray, 0, newSize-1);
		System.arraycopy(super.values, 0, newValueArray, 0, newSize-1);
		super.keys = newKeyArray;
		super.values = newValueArray;
	}
}
