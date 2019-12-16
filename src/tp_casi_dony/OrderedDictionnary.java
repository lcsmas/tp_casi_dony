package tp_casi_dony;

public class OrderedDictionnary extends AbstractDictionnary {

	@Override
	public int newIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
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
	
}
