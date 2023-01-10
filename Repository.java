import java.io.IOException;
import java.util.Scanner;

public class Repository {
    private String fuelType;
    private double amount;
    static Scanner input = new Scanner(System.in);


    public Repository(String fuelType, double amount) {
        this.fuelType = fuelType;
        this.amount = amount;
         }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    static Repository octaneRepo = new Repository("Octane",25000);
    static Repository dieselRepo =  new Repository("Diesel",25000);

    public static void reduceFromRepo(String FuelType, double dispenseAmount){
        if(FuelType.equalsIgnoreCase("Octane")){
            octaneRepo.setAmount(octaneRepo.getAmount()-dispenseAmount);
        } else if (FuelType.equalsIgnoreCase("diesel")) {
            dieselRepo.setAmount(dieselRepo.getAmount()-dispenseAmount);
        }
    }

    public static void refillRepo() throws IOException, InterruptedException {
        System.out.println("Enter the fuel type(Octane/Diesel): ");
        String FuelType = input.next();
        double refillAmount;
        if(FuelType.equalsIgnoreCase("octane")){
            if(octaneRepo.getAmount()!=25000){
                System.out.println("Enter the Amount to refill: ");
                refillAmount = input.nextDouble();
                if (refillAmount+ octaneRepo.getAmount()>25000){
                    System.out.println("The refill amount exceed the total capacity of the octane repository");
                    refillRepo();
                }else{
                    octaneRepo.setAmount(octaneRepo.getAmount()+refillAmount);
                    System.out.println("Succesfully refilled!!\nUpdated amount of fuel remaining in the repository: "+octaneRepo.getAmount()+"L");
                }
            } else {
                System.out.println("Octane fuel repository is full");
                fuelDispenseManagement.fuelDispenseManagementPortal();
            }
        } else if (FuelType.equalsIgnoreCase("diesel")) {
            if(dieselRepo.getAmount()!=25000){
                System.out.println("Enter the amount to refill: ");
                refillAmount = input.nextDouble();
                if(refillAmount + dieselRepo.getAmount()>25000){
                    System.out.println("The refill amount exceed the total capacity of the diesel repository");
                    refillRepo();
                }else{
                    dieselRepo.setAmount(dieselRepo.getAmount()+refillAmount);
                    System.out.println("Succesfully refilled!!\nUpdated amount of fuel remaining in the repository: "+dieselRepo.getAmount()+"L");
                }
            }else {
                System.out.println("Diesel fuel repository is full");
                fuelDispenseManagement.fuelDispenseManagementPortal();
            }
        }

    }
}
