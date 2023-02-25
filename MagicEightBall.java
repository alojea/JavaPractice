import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
* magic 8 ball to give different answers each time
**/

public class MagicEightBall {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> answers = generateRandomAnswers();
		Random rand = new Random();
		
		while(true) {
			System.out.print(answers.get(rand.nextInt(answers.size())) + '\n');
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
	  
		}
	}
	
	private static List<String> generateRandomAnswers() {
		List<String> answers = List.of("I don't know","Weird","Excellent","I'm not sure","Everything is ok","All good");
		return answers;
	}
}
