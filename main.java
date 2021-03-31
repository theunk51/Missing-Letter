import java.util.Scanner;
import java.util.Random;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
        // enter the desired score
		System.out.print("Enter the desired number of the words: ");
		final int numberOfWords = scanner.nextInt();
		
        // generates the a random letter and unchangable
		final char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
		final char missingletter = alphabet[random.nextInt(26)];
		System.out.println("Your missing letter is: " + missingletter);
		
		int wordcount = 1, score = 0;
		
		while (wordcount <= numberOfWords) {
            System.out.print(wordcount + ". ");
            String word = scanner.next().toUpperCase();
			if (word.indexOf(missingletter) != -1) {
                scanner.close();
				System.out.format("\nThe word %s contains the letter '%c' ", word, missingletter);
                System.out.println("\nScore: " + score);
                break;
			} else {
                score++;
                wordcount++;
                continue;
               
            }
		}

        if (wordcount == numberOfWords+1) {
            scanner.close();
            System.out.println("Congratulations! You reached your goal of " + numberOfWords + " word(s)");
            System.exit(1);
        } 
	}
}
