public class TotalSalesPerDept {
    public static int getSum(String[] name, int[] number, int[] quota) {
        int[] revenue = new int[5];
        int sum = 0;
        for (int a = 0; a < name.length; a++) {
            revenue[a] = number[a] * quota[a];
            sum = sum + revenue[a];
        }
        return sum;
    }

}