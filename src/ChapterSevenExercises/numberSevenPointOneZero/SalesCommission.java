package ChapterSevenExercises.numberSevenPointOneZero;

//7.10 (Sales Commissions) Use a one-dimensional array to solve the following problem: A company pays its
//        salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
//        their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week
//        receives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
//        that determines how many of the salespeople earned salaries in each of the following ranges (assume
//        that each salesperson’s salary is truncated to an integer amount):
//        a) $200–299
//        b) $300–399
//        c) $400–499
//        d) $500–599
//        e) $600–699
//        f) $700–799
//        g) $800–899
//        h) $900–999
//        i) $1,000 and over
//        Summarize the results in tabular format

public class SalesCommission {
    private  int basePay = 200;
    public int [] salesCommissionArray = new int[9];
    private int grossSales;
    private int payForSalesPeople;
    private int conditions;


    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public void setPayForSalesPeople() {
        payForSalesPeople = basePay + (9 * grossSales)/100;
        salesPeoplePayRoll(payForSalesPeople);
    }

    private void salesPeoplePayRoll(int payForSalesPeople) {
        int conditions = conditionsCheck(payForSalesPeople);
        payRollUpdater(conditions);

    }
    private int conditionsCheck(int payForSalesPeople) {
         conditions = payForSalesPeople/100;
         return conditions;

    }


    private void payRollUpdater(int conditions) {
        switch (conditions){
            case 2: salesCommissionArray[0] +=1;
            break;
            case 3:salesCommissionArray[1] +=1;
            break;
            case 4:salesCommissionArray[2] +=1;
            break;
            case 5: salesCommissionArray[3] +=1;
            break;
            case 6:salesCommissionArray[4] +=1;
            break;
            case 7: salesCommissionArray[5] +=1;
            break;
            case 8: salesCommissionArray[6] +=1;
            break;
            case 9: salesCommissionArray[7] +=1;
            break;
            default: salesCommissionArray[8] +=1;

        }
    }


    public double getPayForSalesPeople() {
        return payForSalesPeople;
    }

    @Override
    public String toString() {
        return String.format("Salary: frequency%n"+
                "$200-299: %d%n" +
                "$300-399: %d%n" +
                "$400-499: %d%n" +
                "$500-599: %d%n" +
                "$600-699: %d%n" +
                "$700-799: %d%n" +
                "$800-899: %d%n" +
                "$900-999: %d%n" +
                "$1000 and above: %d%n",
                salesCommissionArray[0],
                salesCommissionArray[1],
                salesCommissionArray[2],
                salesCommissionArray[3],
                salesCommissionArray[4],
                salesCommissionArray[5],
                salesCommissionArray[6],
                salesCommissionArray[7],
                salesCommissionArray[8]);
    }
}
