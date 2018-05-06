package pl.dkowal.palindrom;

class PalindromChecker {
	
    static boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        if(number%2==0)
            isPrime = false;

        for(int i = 3; i*i < number; i += 2) {
            if(number%i==0)
                isPrime = false;
        }
        return isPrime;
    }

    static long theLargestPalindrom(long number) {
        long result = 0;
        for(long i = number; i > 100000000; i--) {
            if(isPalindrom(i)) {
                result = i;
                break;
            }
        }
        return result;
    }

    private static boolean isPalindrom(long number) {
        String in = Long.toString(number);
        String tmp = new StringBuilder(in).reverse().toString();
        if(!in.equals(tmp))
        	return false;
        return true;
    }
}