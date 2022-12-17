public class Customer {
    private String name;
    private String date;
    private boolean pumpedFuel;
    private double fuelQuantity;
    private double totalAmount;
    private String vehicleType;

    private Queue Queue;

    // constructors

    public Customer(String name, String date, boolean pumpedFuel, double fuelQuantity, double totalAmount, String vehicleType, Queue Queue) {
        this.name = name;
        this.date = date;
        this.pumpedFuel = pumpedFuel;
        this.fuelQuantity = fuelQuantity;
        this.totalAmount = totalAmount;
        this.vehicleType = vehicleType;
        this.Queue = Queue;
    }


    //getters and setters

    public Queue getQueue() {
        return Queue;
    }

    public void setQueue(Queue queue) {
        this.Queue = queue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPumpedFuel() {
        return pumpedFuel;
    }

    public void setPumpedFuel(boolean pumpedFuel) {
        this.pumpedFuel = pumpedFuel;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    //methods
    public void customerDetails(){
        //get the customer details
    }

    public void saveDetails(){
        //save customer details
    }
}

