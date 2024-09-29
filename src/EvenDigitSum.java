public class EvenDigitSum {
    public static void main(String[] args) {

        // Test Cases
        getEvenDigitSum(4562);
        getEvenDigitSum(7666);
        getEvenDigitSum(9);
        getEvenDigitSum(98756410);
        getEvenDigitSum(-45);
        getEvenDigitSum(Integer.MIN_VALUE);
        getEvenDigitSum(Integer.MAX_VALUE);

    }
    public static int getEvenDigitSum(int number){

        if (number < 0) { // Tests to make sure our number is positive
            System.out.println(number + " must be a positive number.");
            return -1;
        }

        int sum = 0;
        int original = number;
        while(number > 0) { // While statment that goes one-by-one through a number adding only the even numbers

            int nextDigit = number % 10; // finds the next digit in the number

            if (nextDigit % 2 == 0) { // Finds if the next digit is even
                sum += nextDigit;
            }
            number /= 10; // Drops the last digit of our number
        }
        System.out.println("The sum of the even digits in " + original + " is: " + sum);
        return sum;
    }


}
