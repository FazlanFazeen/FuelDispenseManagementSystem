public class Payment {
    private final double petrolCost=450;
    private final double dieselCost=430;
    private double Cost;
    private double fuelAmount;
    private String customerName;
    private int dateAndTime;
    private String paymentId;
    private String[] paymentDetails;

    DateTime dateTime= new DateTime();

    //Constructor
    public Payment(double fuelAmount, String customerName, DateTime dateAndTime, String paymentId) {

        this.fuelAmount = fuelAmount;
        this.customerName = customerName;
        this.dateAndTime = dateTime.getDate();
        this.paymentId = paymentId;
    }
    private double setCost(double fuelAmount){
        //calculate cost here
        return Cost;
    }
    //Getters and Setters
    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {

        this.paymentId = paymentId;
    }
    public String[] getPaymentDetails(int year, int month, int date, int hour,int minute, String dieselOrPetrol, int fuelDistributed){
        //construct payment details
        return paymentDetails;
    }
}
