public class OctaneFuelDispenseManager implements FuelDispenseManager{

    //Instance variables
    private int dispenserNum;
    private String fuelType;
    private double priceOfLitre;
    private String operating;
    private double dispensedAmount;
    private Repository Repository;

    //Constructor
    public OctaneFuelDispenseManager(int dispenserNum, String fuelType, double priceOfLitre, String operating, double dispensedAmount, Repository Repository) {
        this.dispenserNum = dispenserNum;
        this.fuelType = fuelType;
        this.priceOfLitre = priceOfLitre;
        this.operating = operating;
        this.dispensedAmount = dispensedAmount;
        this.Repository = Repository;
    }

    //Getters and Setters
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

    public Repository getRepository() {
        return Repository;
    }

    public void setRepository(Repository repository) {
        Repository = repository;
    }

    @Override
    public void installingDispenser() {

    }
}
