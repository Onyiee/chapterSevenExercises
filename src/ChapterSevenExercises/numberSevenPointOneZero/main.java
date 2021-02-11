package ChapterSevenExercises.numberSevenPointOneZero;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SalesCommission salesCommission = new SalesCommission();

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a value for gross sale: ");
//        double grossSale = scan.nextInt();
//        salesCommission.setGrossSales(grossSale);
//        salesCommission.setPayForSalesPeople();
//        System.out.println("Pay for sales people is " + salesCommission.getPayForSalesPeople());
        double salary = salesCommission.getPayForSalesPeople();

        int [] setSalesCommission = new int[9];

        for (int counter = 0; counter < setSalesCommission.length; counter++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a value for gross sale: ");
            double grossSale = scan.nextInt();
            salesCommission.setGrossSales(grossSale);
            salesCommission.setPayForSalesPeople();
            System.out.println("Pay for sales people is " + salesCommission.getPayForSalesPeople());

//            System.out.println(setSalesCommission[counter]);
        }

        if (salary == 200 || salary <= 299){
            salary = setSalesCommission[0];
        }
        if (salary == 300 || salary <= 399){
            salary = setSalesCommission[1];
        }
        if (salary == 400 || salary <= 499){
            salary = setSalesCommission[2];
        }


    }

}
