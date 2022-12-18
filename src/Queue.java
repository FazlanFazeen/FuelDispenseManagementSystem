import java.util.ArrayList;
public class Queue {
    private int queueNo;
    private int NoOfVehicles;
    private boolean isFull;
    private ArrayList<Customer> listOfcustomers = new ArrayList<>(10);
    private CommonWaitingQueue commonqueue;
    //constructors
    public Queue(int queueNo, int noOfVehicles, boolean isFull,
                 ArrayList<Customer> listOfcustomers, CommonWaitingQueue commonqueue) {
        this.queueNo = queueNo;
        NoOfVehicles = noOfVehicles;
        this.isFull = isFull;
        this.listOfcustomers = listOfcustomers;
        this.commonqueue = commonqueue;
    }
//getters and setters

    public CommonWaitingQueue getCommonqueue() {
        return commonqueue;
    }
    public void setCommonqueue(CommonWaitingQueue commonqueue) {
        this.commonqueue = commonqueue;
    }
    public int getQueueNo() {
        return queueNo;
    }
    public void setQueueNo(int queueNo) {
        this.queueNo = queueNo;
    }
    public int getNoOfVehicles() {
        return NoOfVehicles;
    }
    public void setNoOfVehicles(int noOfVehicles) {
        NoOfVehicles = noOfVehicles;
    }
    public boolean isFull() {
        return isFull;
    }
    public void setFull(boolean full) {
        isFull = full;
    }
    public ArrayList<Customer> getListOfcustomers() {
        return listOfcustomers;
    }
    public void setListOfcustomers(ArrayList<Customer> listOfcustomers) {
        this.listOfcustomers = listOfcustomers;
    }
    public void receiveTicket(){
        //recieve the ticket
    }
}
