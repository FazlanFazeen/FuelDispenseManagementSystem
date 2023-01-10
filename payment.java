public class payment {
    private String vehicleNo, fuelType;
    private int fuelQuantity;
    private double price;


    public payment(String vehicleNo, String fuelType, int fuelQuantity, double price) {
        this.vehicleNo = vehicleNo;
        this.fuelType = fuelType;
        this.fuelQuantity = fuelQuantity;
        this.price = price;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
