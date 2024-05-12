import java.util.Scanner;

public class Lab3A {

    public static void main(String[] args){

        double amountOwed, apr, monthly_percentage, minimum_payment;

        Scanner sc = new Scanner(System.in);

        System.out.print("Amount owed: ");
        amountOwed = Double.parseDouble(sc.nextLine());

        System.out.print("$APR: ");
        apr = Double.parseDouble(sc.nextLine());

        minimum_payment = ((amountOwed * apr ) / 12) / 100;
        monthly_percentage = apr / 12;

        System.out.println("Monthly percentage rate: " + String.format("%.3f", monthly_percentage));
        System.out.println("Minimum payment: $ " + String.format("%.2f", minimum_payment));



    }
}

