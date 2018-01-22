import java.util.Arrays;
import java.util.Random;

public class LotterySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] main = new int[5];
		int mainMin = 1;
		int mainMax= 50;
		int newMainNumber = 0;
		
		int[] star = new int[2];
		int starMin = 1;
		int starMax = 12;
		int newLuckyNumber = 0;
		
		//Main Loop
		for(int mainNumber = 0; mainNumber < main.length; mainNumber++) {
			newMainNumber = (int)(Math.random() * mainMax) + mainMin;
			for(int checkMain = 0; checkMain < mainNumber; checkMain++) {
				if(main[checkMain] == newMainNumber) {
					newMainNumber = (int)(Math.random() * mainMax) + mainMin;
					checkMain--;
				}
			}
			main[mainNumber] = newMainNumber;
		}//End Main Loop		
		
		//Star Loop
		for(int luckyNumber = 0; luckyNumber < star.length; luckyNumber++) {
			newLuckyNumber = (int)(Math.random() * starMax) + starMin;
			for(int checkStar = 0; checkStar < luckyNumber; checkStar++) {
				if(star[checkStar] == newLuckyNumber) {
					newLuckyNumber = (int)(Math.random() * starMax) + starMin;
					checkStar--;
				}
			}
			star[luckyNumber] = newLuckyNumber;
		}//End Star Loop
		
		//Sort Array
		Arrays.sort(main);
		Arrays.sort(star);
		
		//Print Loop
		for(int i = 0; i < main.length; i++) {
			System.out.println("Main Number: " + main[i]);
		}
		
		for(int j = 0; j < star.length; j++) {
			System.out.println("Lucky Number: " + star[j]);
		}//End Print Loop
				
		
	}

}




























