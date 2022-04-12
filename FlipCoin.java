package day_5;
/*
 * Author: Rajesh
 *Flipping a coin and calculating the percentage of heads and tails
 */
public class FlipCoin {
	public static void main(String[] args) {
		double tailsCount = 0;
		double headsCount = 0;
		int timesFlip;
		for(timesFlip = 0; timesFlip <= 50; timesFlip++) {
			double randomFlip =Math.random();
			
			if(randomFlip < 0.5) {
				System.out.println("Tails");
				tailsCount++;
			}else {
				System.out.println("Heads");
				headsCount++;
			}
		}
		System.out.println("Percentage of Head : "+((headsCount/50) * 100)+"%");
		System.out.println("Percentage of Tail : "+((tailsCount/50) * 100)+"%");
		
		
	}
	

}
