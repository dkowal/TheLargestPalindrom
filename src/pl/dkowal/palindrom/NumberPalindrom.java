package pl.dkowal.palindrom;
import java.util.Scanner;

class NumberPalindrom {
	
    private static Scanner scanner;
    private static int counter = 0;
    
	public static void main(String[] args) {
        
        int firstNumber, secondNumber;
        firstNumber = enterNumber();
        secondNumber = enterNumber();
        long multiplication = (long)firstNumber * (long)secondNumber;
        
        System.out.println("The largest palindrom: " + PalindromChecker.theLargestPalindrom(multiplication));
    }
	
    private static int enterNumber() {
    	scanner = new Scanner(System.in);
    	int number;
    	
    	do {
            System.out.println(counter + ": please enter a PRIME 5-digit number!");
            while (!scanner.hasNextInt()) {
                System.out.println(counter + ": that's not a number!");
                scanner.next();
            }
            number  = scanner.nextInt();
        } while (!matchConditions(number));
    	counter++;
    	return number;
    }
    
    private static boolean matchConditions(int number) {
    	if (String.valueOf(number).length() != 5)
    		return false;
    	if(!PalindromChecker.isPrimeNumber(number))
    		return false;
    	return true;
    }
}