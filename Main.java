public class Main {

    public static void main(String[] args) {
//    int [] runningSum = {3,1,2,10,1};
//        System.out.println(runningSum[0]);
//        for (int i = 1; i < runningSum.length; i++){
//            runningSum[i] += runningSum[i-1];
//
//
//            System.out.println(runningSum[i]);
//        }

        System.out.println(maximumWealth(new int[][]{{1,5},{7, 3},{3, 5}}));
    }
    public static int maximumWealth(int[][] accounts) {
        var richestCustomerArray = new int[accounts.length];
        int richestCustomer = 0;

        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                richestCustomerArray[i] += accounts[i][j];
            }
            richestCustomer = Math.max(richestCustomer, richestCustomerArray[i]);
        }

        return richestCustomer;
    }
}
