public class DateTime {
    private String Date;
    private double amount;
    private String fuelType;

    public DateTime(String date, double amount, String fuelType) {
        Date = date;
        this.amount = amount;
        this.fuelType = fuelType;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    DateTime dt = new DateTime(getDate(),getAmount(),getFuelType());
    

}
