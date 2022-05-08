/*package demo;

public class nonStatic {

	int i = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nonStatic a1 = new nonStatic();
		System.out.println(a1.i);
		
	}

}*/
package demo;

public class nonStatic {
	int i = 10;//Main Copy
	public static void main(String[] args) {
		nonStatic a1 = new nonStatic();
		a1.i = 100;
		nonStatic a2 = new nonStatic();
		System.out.println(a1.i);
		System.out.println(a2.i);
		
}
}

