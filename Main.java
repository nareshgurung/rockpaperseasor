package rockPaperSeasor;


public class Main {
	
	public static void main(String[] args) {
		
		String[] inputWord = {"rock", "paper", "scissors"};
		String[] inputWord1 = {"rock", "paper", "scissors"};
		
		int rand1 =(int)(Math.random()*inputWord.length);
		int rand2 =(int)(Math.random()*inputWord1.length);
		
		
		
		System.out.println(rand1 + " random number1");
		System.out.println(rand2 + " random number2");
		
		
		Main.rps(rand1,  rand2);
		
	}
	
	public static void rps(int rand1, int rand2) {
		
		if(rand1 == rand2) {
			System.out.println("Tie");
		}
		else if(rand1 == 0 && (rand2 == 1))   {
			System.out.println("player two win");
		}
		else if(rand1== 1 && rand2 == 0)   {
			System.out.println("player 1 win");
		}
		else if (rand1 == 2 && rand2 == 1)   {
			System.out.println("player 1 win");
		}
	}

}
