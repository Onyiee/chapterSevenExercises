package ChapterSevenExercises.numberSevenPointOneZero;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SalesCommission salesCommission = new SalesCommission();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for gross sale: ");
        double grossSale = scan.nextInt();
        salesCommission.setGrossSales(grossSale);


//        if (grossSale == 200 || grossSale <= 299){
//            salesCommission.setSalaryForSalesPeople();
//        }
//        if (grossSale == 300 || grossSale <= 399){
//            salesCommission.setSalaryForSalesPeople();
//        }




    }

}
