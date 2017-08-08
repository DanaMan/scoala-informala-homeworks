/**
 * * Created by Dana Man on 7/30/17.
 */

/**
 * Implements a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order.
 * The sorting should be done based on the amount of revenue generated via sales.
 * Each rep has a number of sales, and a quota / sale.
 */
public class SortSales {
    public static void sorting(String[] name, int[] number, int[] quota) {
        int[] revenue = new int[5];
        for (int a = 0; a < name.length; a++) {
            revenue[a] = number[a] * quota[a];
        }
        int tempValue = 0;
        String tempName = name[0];
        int tempNumber = 0;
        int tempQuota = 0;
        int j = 0;
        while (j < revenue.length - 1) {
            if (revenue[j] < revenue[j + 1]) {
                tempValue = revenue[j];
                revenue[j] = revenue[j + 1];
                revenue[j + 1] = tempValue;

                tempName = name[j];
                name[j] = name[j + 1];
                name[j + 1] = tempName;

                tempNumber = number[j];
                number[j] = number[j + 1];
                number[j + 1] = tempNumber;

                tempQuota = quota[j];
                quota[j] = quota[j + 1];
                quota[j + 1] = tempQuota;

                j = -1;
            }
            j = j + 1;
        }

        for (int iPrint = 0; iPrint < name.length; iPrint++)
            System.out.println(name[iPrint] + " " + revenue[iPrint] + "$");
    }

}



