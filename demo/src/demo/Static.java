package demo;

public class Static {
	int x = 10;
	int y = 20;
	static int z = 25;
	public static void main(String[] args) {
		Static a1 = new Static();
		System.out.println(a1.x);
		System.out.println(Static.z);
		System.out.println(a1.y);
	}

}
