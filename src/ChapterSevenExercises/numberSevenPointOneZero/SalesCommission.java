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
    private final int basePay = 200;
    public int [] setSalesCommission = new int[9];
    private double grossSales;
    private double payForSalesPeople;
    public double percentageOnSales = 0.09;

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setPayForSalesPeople() {
        this.payForSalesPeople = this.basePay + (percentageOnSales * grossSales);
        salesPeoplePayRoll(payForSalesPeople);
    }

    private void salesPeoplePayRoll(double payForSalesPeople) {
        int conditions = conditionsCheck(payForSalesPeople);
        payRollUpdater(conditions);
    }

    private void payRollUpdater(int conditions) {
        switch (conditions){
            case 2: setSalesCommission[0] +=1;
            break;
            case 3: setSalesCommission[1] +=1;
            break;
            case 4: setSalesCommission[2] +=1;
            break;
            case 5: setSalesCommission[3] +=1;
            break;
            case 6:setSalesCommission[4] +=1;
            break;
            case 7: setSalesCommission[5] +=1;
            break;
            case 8: setSalesCommission[6] +=1;
            break;
            case 9: setSalesCommission[7] +=1;
            break;
            default: setSalesCommission[8] +=1;

        }
    }

    private int conditionsCheck(double payForSalesPeople) {
        int conditions = (int) payForSalesPeople/100;
        return conditions;
    }

    public double getPayForSalesPeople() {
        return payForSalesPeople;
    }
}
