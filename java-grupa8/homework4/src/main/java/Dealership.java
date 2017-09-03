public class Dealership {
    String manufacters;
    String carModel;
    boolean usedCar;
    int stock;
    float price;
    static Dealership[]dealer=new Dealership[9];
    public static void main(String[] args) {
        initDealer(0, "Volkswagen", "e-UP", false, 20, 25000);
        initDealer(1, "Volkswagen", "e-Golf", false, 5, 38000);
        initDealer(2, "Renault", "Zoe",true,2,33000);
        initDealer(3, "BMW", "i3",false,10,40000);
        initDealer(4, "Smart", "FourTwo ",false,15,22000);
        initDealer(5, "Smart", "FourFour",false,12,22700);
        initDealer(6, "Smart", "FourTwo Cabrio",false,18,23000);
        initDealer(7, "Kia", "Soul",false,23,34000);
        initDealer(8, "Hyundai", "Ioniq",false,0,0);

        System.out.println("Manufacter||Car Model||Units in stock||Price in €");
        for (int i=0;i<dealer.length;i++){
            System.out.println(dealer[i].manufacters+"||"+dealer[i].carModel+"||"+dealer[i].stock+"||"+dealer[i].price);
        }

        //System.out.println(Car.cars[2].productionYear);

    }
    public static void initDealer(int position, String manufacters, String carModel,boolean usedCar, int stock, float price ) {
        dealer[position] = new Dealership();
        dealer[position].manufacters = manufacters;
        dealer[position].carModel = carModel;
        dealer[position].usedCar = usedCar;
        dealer[position].stock = stock;
        dealer[position].price = price;

    }
}
