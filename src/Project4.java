import java.util.Scanner;
public class Project4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declare variable
		String answer;
		int answerCount = 0;
		System.out.println("Answer yes or no to the following question");
		//question 1
		System.out.println("I am losing my sense of humor.");
		answer = input.nextLine();
		//count number of yes
		if (answer.equalsIgnoreCase("yes")) {
			answerCount = answerCount +1;
			
		}
		//question 2
		System.out.println("I find it more and more difficult to see people socially.");
		
		answer = input.nextLine();
		if (answer.equalsIgnoreCase("yes")) {
			answerCount = answerCount +1;
		}
		
		//question 3
		System.out.println("I feel tired most of the time.");
		answer = input.nextLine();
		
		if (answer.equalsIgnoreCase("yes")) {
			answerCount = answerCount +1;
		}
		
		if (answerCount == 0) 
		{
		System.out.println("You are more exhausted than stressed out");
		}
		else if (answerCount == 1)
		{
			System.out.println("You are beginning to stress out");
			}
		else if (answerCount == 2)
		{
			System.out.println("You are possibly stressed out");
			
		}
		else
		{
			System.out.println("You are probably stressed out");
			}
			
		}
		
		
		
		
	}
	

