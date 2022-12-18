import java.util.ArrayList;
public class CommonWaitingQueue {
    private int NoOfVehicles;
    private String firstVehicleType;
    private ArrayList<Queue> listOfQueues = new ArrayList<>();

    //constructors
    public CommonWaitingQueue(int noOfVehicles, String firstVehicleType,
                              ArrayList<Queue> listOfQueues) {
        NoOfVehicles = noOfVehicles;
        this.firstVehicleType = firstVehicleType;
        this.listOfQueues = listOfQueues;
    }

    //Getters and setters
    public int getNoOfVehicles() {
        return NoOfVehicles;
    }

    public void setNoOfVehicles(int noOfVehicles) {
        NoOfVehicles = noOfVehicles;
    }

    public String getFirstVehicleType() {
        return firstVehicleType;
    }

    public void setFirstVehicleType(String firstVehicleType) {
        this.firstVehicleType = firstVehicleType;
    }

    public ArrayList<Queue> getListOfQueues() {
        return listOfQueues;
    }

    public void setListOfQueues(ArrayList<Queue> listOfQueues) {
        this.listOfQueues = listOfQueues;
    }
}