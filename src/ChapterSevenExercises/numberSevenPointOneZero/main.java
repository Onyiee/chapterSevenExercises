package ChapterSevenExercises.numberSevenPointOneZero;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SalesCommission salesCommission = new SalesCommission();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for gross sale: ");
        int grossSale = scan.nextInt();
        salesCommission.setGrossSales(grossSale);
        salesCommission.setPayForSalesPeople();

        while (grossSale != -1){
            System.out.println("Enter a value for gross sale: ");
            grossSale = scan.nextInt();
            salesCommission.setGrossSales(grossSale);
            salesCommission.setPayForSalesPeople();
        }
        System.out.println(salesCommission.toString());


    }
}
