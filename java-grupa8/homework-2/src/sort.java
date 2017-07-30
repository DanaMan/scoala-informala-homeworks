/**
 Implements a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order.
 The sorting should be done based on the amount of revenue generated via sales.
 Each rep has a number of sales, and a quota / sale.
 */
public class sort {
    public static void main(String[] args) {
            String[] nameRepr = {"Ion Dumbraveanu", "Alina Iriminescu", "Ovidiu Zaharescu", "Nicoleae Popovici", "Andeea Maxim"};
            int[] numberSales = {10, 30, 20, 51, 20};
            int[] quotaSales = {500, 250, 400, 100, 450};
            int[] revenue = new int[5];
            for (int a = 0; a < nameRepr.length; a++) {
                revenue[a] = numberSales[a] * quotaSales[a];
            }
            int tempValue = 0;
            String tempName = nameRepr[1];
            int j = 0;
            while (j < revenue.length - 1) {
                if (revenue[j] < revenue[j + 1]) {
                    tempValue = revenue[j];
                    revenue[j] = revenue[j + 1];
                    revenue[j + 1] = tempValue;
                    tempName = nameRepr[j];
                    nameRepr[j] = nameRepr[j + 1];
                    nameRepr[j + 1] = tempName;
                    j = -1;
                }
                j = j + 1;
            }
            for(int iPrint=0;iPrint<nameRepr.length; iPrint++) {
                System.out.println(nameRepr[iPrint]+" "+revenue[iPrint]+"$");
            }
    }
}

