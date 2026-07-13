class Timetobuystock122 {
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int currentProfit=0;
        for(int i=1; i<prices.length; i++){
           if(prices[i]>prices[i-1]){
            currentProfit += prices[i]-prices[i-1];
            if(maxProfit<currentProfit){
                maxProfit=currentProfit;
            }
           }
         }
          return maxProfit;
        }
       
    
    public static void main(String[] args){
        int prices[]= {7,1,5,3,6,4};
        int result= maxProfit(prices);
        System.out.println("Max Profit:"+ result);
    } 
}