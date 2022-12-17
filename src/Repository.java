import java.util.ArrayList;

public class Repository {
    private int repositoryId;
    private double capacity;
    private double price;

    private ArrayList<DieselFuelDispenseManager> listOfDieselDispensers = new ArrayList<>();
    private ArrayList<OctaneFuelDispenseManager> listOfOctaneDispensers = new ArrayList<>();

    //constructors

    public Repository(int repositoryId, double capacity, double price, ArrayList<DieselFuelDispenseManager> listOfDieselDispensers, ArrayList<OctaneFuelDispenseManager> listOfOctaneDispensers) {
        this.repositoryId = repositoryId;
        this.capacity = capacity;
        this.price = price;
        this.listOfDieselDispensers = listOfDieselDispensers;
        this.listOfOctaneDispensers = listOfOctaneDispensers;
    }

    //getters and setters

    public int getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(int repositoryId) {
        this.repositoryId = repositoryId;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<DieselFuelDispenseManager> getListOfDieselDispensers() {
        return listOfDieselDispensers;
    }

    public void setListOfDieselDispensers(ArrayList<DieselFuelDispenseManager> listOfDieselDispensers) {
        this.listOfDieselDispensers = listOfDieselDispensers;
    }

    public ArrayList<OctaneFuelDispenseManager> getListOfOctaneDispensers() {
        return listOfOctaneDispensers;
    }

    public void setListOfOctaneDispensers(ArrayList<OctaneFuelDispenseManager> listOfOctaneDispensers) {
        this.listOfOctaneDispensers = listOfOctaneDispensers;
    }

    //method
    public void checkFuel(){
        //check if fuel is available
    }

    public int fuelcapacity(){return (int) capacity;
        //returns the fuel capacity
    }
}
