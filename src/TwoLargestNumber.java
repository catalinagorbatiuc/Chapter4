public class TwoLargestNumber{
    private int fLargest = 0, sLargest = 0; // first and second largest
    public void enterNumber(int x){
        if(x > fLargest){
            sLargest = fLargest;
            fLargest = x;
        }else if(x > sLargest){
            sLargest = x;
        }
    }
    public int getFirstLargest(){
        return fLargest;
    }
    public int getSecondLargest(){
        return sLargest;
    }
}
