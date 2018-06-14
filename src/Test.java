
class MathClass {
	public int add(int p1, int p2) {
		return p1 + p2;
	}
	
	public int sub(int p1, int p2) {
		return p1 - p2;
	}
	
	public String toString() {
		return "this is a math class.";
	}
}

public class Test {
	public static void main(String[] args) {
		MathClass fc = new MathClass();
		fc.add(1, 2);
		
		System.out.print("It's a test!");
		System.out.println();
		System.out.println("It's a test!");
	}
}

