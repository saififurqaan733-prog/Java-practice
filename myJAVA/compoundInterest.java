import java.util.Scanner;
class compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Welcome to Simple Intrest Calculater\n ");
        System.out.println("Please enter your principle amount INT: ");
        int principle = input.nextInt();
        System.out.println("Noww tell your rate of Intrest: ");
        float rate = input.nextFloat();
        System.out.println("Now tell me for how many years are you borrowing of years: ");
        float years = input.nextFloat();

        double compoundInterest = principle * Math.pow((1 + rate / 100), years);
        System.out.println("Your compound Interest is Rs: " + compoundInterest);

    }
    
}
