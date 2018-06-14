
public class Loopy {
	public static void main (String[] args) {
		int x=1;
		System.out.println("Before the Loop");
		while(x<4) {
			System.out.println("Before the Loop");
			System.out.printf("Value of x is %d\n", x);
			x+=1;
		}
		System.out.println("This is after the loop.");
	}
}
