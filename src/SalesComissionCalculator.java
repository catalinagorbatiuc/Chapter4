public class SalesComissionCalculator{
    private static final double BASE_PAY = 200.0;
    private static final double COMMISSION_PERCENT = 0.09;
    private double total;
    public void enterItem(int x){
        switch(x){
            case 1:
                total += 239.99;
                break;
            case 2:
                total += 129.75;
                break;
            case 3:
                total += 99.95;
                break;
            case 4:
                total += 350.89;
                break;
            default:
                break;
        }
    }
    public double getSalesTotal(){
        return total;
    }
    public double calculateCommission(){
        return BASE_PAY + total * COMMISSION_PERCENT;
    }
}