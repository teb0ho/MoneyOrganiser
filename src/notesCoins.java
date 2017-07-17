/**
 * Created by Teb0ho Mphure on 2017-07-16.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

class notesCoins {

    static double denominations(double moneyLeftOver, double denoms, String denomDef) {

        int denomCount = 0;

        if (moneyLeftOver >= denoms) {

            while((moneyLeftOver - denoms) >= 0) {

                moneyLeftOver -= denoms;
                denomCount++;

            }

        }

        if (denomCount != 0) System.out.println(denomCount + " - " + denomDef + " ");

        return moneyLeftOver;

    }

    static double fiveCent(double moneyLeftOver, double denoms, String denomDef) {

        int denomCount = 0;

        if (moneyLeftOver >= denoms) {

            while((moneyLeftOver - denoms) >= 0) {

                moneyLeftOver -= denoms;
                denomCount++;

            }

        }

        if (moneyLeftOver < 0.05 && moneyLeftOver != 0 ) {

            moneyLeftOver = 0;
            denomCount++;

        }

        if (denomCount != 0) System.out.println(denomCount + " - " + denomDef + " ");

        return moneyLeftOver;

    }

    public static void main(String[] args) {

        double amount = 0;
        double remainder = 0;
        double[] denoms = {200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05};
        String[] denomDef = {"R200", "R100", "R50", "R20", "R10", "R5", "R2", "R1", "50c", "20c", "10c", "5c"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your money: ");

        try {

            amount = scan.nextDouble();
            remainder = amount;

            System.out.println("Your money consists of: ");

            for (int i = 0; i < denoms.length - 1; i++) {

                remainder = denominations(remainder, denoms[i], denomDef[i]);

            }

            fiveCent(remainder, denoms[11], denomDef[11]);

            System.out.println();



        }

        catch (InputMismatchException e) {

            System.out.println("Invalid input provided.");

        }

        catch(Exception e) {

            e.printStackTrace();

        }

    }

}
