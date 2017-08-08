/**
 * * Created by Dana Man on 7/30/17.
 */
public class Sort {
    public static void main(String[] args) {
        String[] departments = {"Team1", "Team2", "Team3", "Team4", "Team5"};
        //Team1 data
        String[] nameRepr = {"Ion Dumbraveanu", "Alina Iriminescu", "Ovidiu Zaharescu", "Nicoleae Popovici", "Andeea Maxim"};
        int[] numberSales = {10, 30, 20, 51, 20};
        int[] quotaSales = {500, 250, 400, 100, 450};

        //Team2 data
        String[] nameRepr2 = {"Ionut Adamescu", "Alina Oancea", "Paul Mihalcea", "Nicoleae Micu", "Aurel Muresan"};
        int[] numberSales2 = {30, 80, 10, 12, 24};
        int[] quotaSales2 = {500, 250, 400, 100, 50};

        //Team3 data
        String[] nameRepr3 = {"George Avram", "Alina Ionescu", "Dorin Deac", "Robert Popescu", "Attilla Szabo"};
        int[] numberSales3 = {34, 20, 10, 34, 60};
        int[] quotaSales3 = {300, 50, 400, 23, 150};

        //Team4 data
        String[] nameRepr4 = {"Alexandru Rap", "Marian Miclea", "Doina Pana", "Monica Verde", "Traian Filip"};
        int[] numberSales4 = {44, 25, 56, 45, 33};
        int[] quotaSales4 = {300, 50, 400, 23, 150};

        System.out.println("Homework 2 requirement:sort Team 1");
        SortSales.sorting(nameRepr, numberSales, quotaSales);

        //Creates an array of total sales per department
        int[] salesArray = new int[4];
        salesArray[0] = TotalSalesPerDept.getSum(nameRepr, numberSales, quotaSales);
        salesArray[1] = TotalSalesPerDept.getSum(nameRepr2, numberSales2, quotaSales2);
        salesArray[2] = TotalSalesPerDept.getSum(nameRepr3, numberSales3, quotaSales3);
        salesArray[3] = TotalSalesPerDept.getSum(nameRepr4, numberSales4, quotaSales4);


        int totalRevenue = 0;
        for (int i = 0; i < 4; i++) {
            totalRevenue = totalRevenue + salesArray[i];
        }
        System.out.println("Total amount of sales for the company: " + totalRevenue + " $");

        int maxRevenue = 0;
        int teamCounter = 0;
        for (int j = 0; j < 4; j++) {
            if (salesArray[j] > maxRevenue) {
                maxRevenue = salesArray[j];
                teamCounter = j;
            }
        }
        System.out.println("The most succesful department is: " + departments[teamCounter]);

        /*System.out.println("Verify:");
        for (int k = 0; k < 4; k++) {
            System.out.println(salesArray[k]);
        }*/

        //Creates an array of best rep in each department
        String[] bestAgent = new String[4];
        bestAgent[0] = BestSelller.getBest(nameRepr, numberSales, quotaSales);
        bestAgent[1] = BestSelller.getBest(nameRepr2, numberSales2, quotaSales2);
        bestAgent[2] = BestSelller.getBest(nameRepr3, numberSales3, quotaSales3);
        bestAgent[3] = BestSelller.getBest(nameRepr4, numberSales4, quotaSales4);

        //Creates an array of best revenue in each department
        int[] bestAmount = new int[4];
        bestAmount[0] = BestSelller.getBestAmount(nameRepr, numberSales, quotaSales);
        bestAmount[1] = BestSelller.getBestAmount(nameRepr2, numberSales2, quotaSales2);
        bestAmount[2] = BestSelller.getBestAmount(nameRepr3, numberSales3, quotaSales3);
        bestAmount[3] = BestSelller.getBestAmount(nameRepr4, numberSales4, quotaSales4);

        /*System.out.println("Verify:");
        for (int k = 0; k < 4; k++) {
            System.out.println(bestAgent[k]);
            System.out.println(bestAmount[k]);
        }*/

        int maxRevenueAll = 0;
        int couter = 0;
        for (int i = 0; i < 4; i++) {
            if (maxRevenueAll < bestAmount[i]) {
                maxRevenueAll = bestAmount[i];
                couter = i;
            }
        }
        System.out.println("The best sales rep is:" + bestAgent[couter]);
    }
}


