public class Car {
    float energyConsumption;
    String manufacter;
    String carModel;
    int productionYear;
    static Car [] cars= new Car[10];
    public static void main(String[] args) {
        initCars(0,1000,"Volkswagen","e-UP", 2013);
        initCars(1,1200,"Volkswagen","e-Golf", 2014);
        initCars(2,1400,"Renault","Zoe ", 2015);
        initCars(3,1900,"BMW","i3", 2016);
        initCars(4,1400,"Smart","FourTwo", 2013);
        initCars(5,1200,"Smart","FourFour", 2014);
        initCars(6,1800,"Smart","FourTwo Cabrio", 2016);
        initCars(7,1600,"Kia","Soul", 2015);
        initCars(8,1400,"Kia","Invented", 2013);
        initCars(9,1900,"Hyundai","Ioniq ", 2017);

    }
    public static void initCars(int position,float energyConsumption,String manufacter,String carModel,int productionYear ) {
        cars[position] = new Car();
        cars[position].energyConsumption = energyConsumption;
        cars[position].manufacter = manufacter;
        cars[position].carModel = carModel;
        cars[position].productionYear = productionYear;
    }
}
