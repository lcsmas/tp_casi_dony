package tp1;

public class Main {

	public static void main(String[] args) {
		testFastDictionnary();
	}
	
	public static void testOrderedDictionnary() {
		IDictionnary d = new OrderedDictionnary();
		System.out.println(d.isEmpty()); // true
		d.put(0, 0);
		d.put(60, 10);
		System.out.println(d.isEmpty()); // false
		System.out.println(d.get(60)); // 10
		System.out.println(d.containsKey(60)); // true
		System.out.println(d.size()); // 2
		System.out.println(d.toString());
	}
	public static void testSortedDictionnary() {
		IDictionnary d = new SortedDictionnary();
		System.out.println(d.isEmpty()); // true
		d.put(0, 0);
		d.put(60, 10);
		d.put(10, 15);
		System.out.println(d.isEmpty()); // false
		System.out.println(d.get(60)); // 10
		System.out.println(d.containsKey(60)); // true
		System.out.println(d.size()); // 2
		System.out.println(d.toString()); // Dictionnaire trié par clé
	}
	public static void testFastDictionnary() {
		IDictionnary d = new FastDictionnary();
		System.out.println(d.isEmpty()); // true
		d.put(0, 0);
		d.put(60, 10);
		d.put(10, 15);
		d.put(13, 12);
		d.put(50, 58);
		System.out.println(d.isEmpty()); // false
		System.out.println(d.get(60)); // 10
		System.out.println(d.containsKey(60)); // true
		System.out.println(d.size()); // 2
		System.out.println(d.toString());
	}
}
