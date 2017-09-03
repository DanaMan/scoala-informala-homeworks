public class GreenBonusProgram {
    float fixedBudget;

    String clientName;
    String dealershipName;
    String carModel;
    static GreenBonusProgram[] history=new GreenBonusProgram[15];

    public static void initHistory(int position, String clientName, String dealershipName,String carModel ) {
        history[position] = new GreenBonusProgram();
        history[position].clientName = clientName;
        history[position].dealershipName = dealershipName;
        history[position].carModel = carModel;
    }

}
