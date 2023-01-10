import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Customer {
    private String VehicleNo, fuelType, vehicleType;
    private double amount;

    public Customer(String vehicleNo, String fuelType, String vehicleType, double amount) {
        VehicleNo = vehicleNo;
        this.fuelType = fuelType;
        this.vehicleType = vehicleType;
        this.amount = amount;
    }

    public String getVehicleNo() {
        return VehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        VehicleNo = vehicleNo;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    static LinkedList<Customer> customers = new LinkedList<>();





}
