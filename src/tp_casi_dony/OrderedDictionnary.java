package tp_casi_dony;

public class OrderedDictionnary extends AbstractDictionnary {

	@Override
	public int newIndexOf(Object o) {	
		grow();
		return super.key.length-1;
	}

	@Override
	protected int indexOf(Object o) {
		int res = -1;
		for (int i = 0; i < key.length; i++) {
			if(key[i] == o){
				res = i;
				break;
			}
		}
		return res;
	}	
	
	protected void grow() {
		int newSize = super.key.length + 1;
		Object[] newKeyArray = new Object[newSize];
		Object[] newValueArray = new Object[newSize];
		System.arraycopy(super.key, 0, newKeyArray, 0, newSize-1);
		System.arraycopy(super.value, 0, newValueArray, 0, newSize-1);
		super.key = newKeyArray;
		super.value = newValueArray;
	}
}
