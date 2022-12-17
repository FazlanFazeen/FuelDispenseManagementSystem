public class DieselFuelDispenseManager implements FuelDispenseManager{

//Instance variable

    private int dispenserNum;
    private String fuelType;
    private double priceOfLitre;
    private String operating;
    private double dispensedAmount;
    private FuelRepository Repository;

    //Constructor

    public DieselFuelDispenseManager(int dispenserNum, String fuelType, double priceOfLitre, String operating, double dispensedAmount, FuelRepository Repository) {
        this.dispenserNum = dispenserNum;
        this.fuelType = fuelType;
        this.priceOfLitre = priceOfLitre;
        this.operating = operating;
        this.dispensedAmount = dispensedAmount;
        this.Repository = Repository;
    }

    //Getter and Setter

    public int getDispenserNum() {
        return dispenserNum;
    }

    public void setDispenserNum(int dispenserNum) {
        this.dispenserNum = dispenserNum;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getPriceOfLitre() {
        return priceOfLitre;
    }

    public void setPriceOfLitre(double priceOfLitre) {
        this.priceOfLitre = priceOfLitre;
    }

    public String getOperating() {
        return operating;
    }

    public void setOperating(String operating) {
        this.operating = operating;
    }

    public double getDispensedAmount() {
        return dispensedAmount;
    }

    public void setDispensedAmount(double dispensedAmount) {
        this.dispensedAmount = dispensedAmount;
    }

    @Override
    public void installingDispenser() {

    }
}
