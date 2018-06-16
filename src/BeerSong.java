
public class BeerSong {
	public static void main (String[] args) {
		int beerNum=2;
		String word="bottles";
		
		while (beerNum>0) {
			if (beerNum==1) {
				word = "bottle";
			}
			System.out.printf("%d %s of beer on the wall.\n", beerNum , word);
			System.out.printf("%d %s of beer.\n", beerNum , word);
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum-=1;
			
			if (beerNum>0) {
				if (beerNum==1) {
					word = "bottle";
				}
				System.out.printf("%d %s of beer on the wall.\n", beerNum , word);
			}else {
				System.out.println("No more bottles of beer on the wall.");
			}
		}
		
	}

}
