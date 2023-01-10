public class OctaneFuelDispenseManager implements FuelDispenseManager  {

    private static String fuelType = "92 Octane";

    //Creating instance variables
    private int dispenserNo;
    private int totalSlots;
    private int freeSlots;
    private double dispensedFuelAmount;


    //Creating a constructor
    public OctaneFuelDispenseManager(int dispenserNo, int totalSlots,int freeSlots) {
        OctaneFuelDispenseManager.fuelType = fuelType;
        this.dispenserNo = dispenserNo;
        this.totalSlots = totalSlots;
        this.freeSlots = freeSlots;
    }


    //Getters and Setters

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getDispenserNo() {
        return dispenserNo;
    }

    public void setDispenserNo(int dispenserNo) {
        this.dispenserNo = dispenserNo;
    }

    public int getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(int totalSlots) {
        this.totalSlots = totalSlots;
    }

    public void setFreeSlots(int freeSlots) {this.freeSlots = freeSlots;}

    public int getFreeSlots() {
        return freeSlots;
    }

    public void setFreeSlots(Integer freeSlots) {
        this.freeSlots = freeSlots;
    }

    public double getDispensedFuelAmount() {
        return dispensedFuelAmount;
    }

    public void setDispensedFuelAmount(double dispensedFuelAmount) {
        this.dispensedFuelAmount = dispensedFuelAmount;
    }

//Methods
    public static void removeSlot(){
        //Method
    }

}

