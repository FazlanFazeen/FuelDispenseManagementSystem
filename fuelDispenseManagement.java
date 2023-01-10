

import java.io.IOException;
import java.util.Scanner;


public class fuelDispenseManagement {
    //Using a scanner object to obtain inputs
    static Scanner input = new Scanner(System.in);



    //Method to create the fuelDispenseManagement Portal
    public static void fuelDispenseManagementPortal() throws IOException, InterruptedException {
        String inputOption;
        while (true) {
            System.out.println("""
                    \n\n\t         FUEL DISPENSE MANAGEMENT
                    \t     =====================\n
                    \tPlease select your option: 
                    \t 1. Vehicle entering the fuel station
                    \t 2. Check Common waiting queue
                    \t 3. Fuel dispensing 
                    \t 4. Refill Repositories
                                                                                        
                    \t 98. Back
                    \t 99. Exit 
                    """);

            System.out.print("\t Please enter the respective number: ");
            inputOption = input.next();
            //Filtering and obtaining inputs
            if (inputOption.equals("1") || inputOption.equals("2") || inputOption.equals("98") || inputOption.equals("99")|| inputOption.equals("3")|| inputOption.equals("4")) {
                MainMenu.clearScreen();
                break;

            } else {
                MainMenu.clearScreen();
                System.out.println("\nInvalid option! Please check the input and try again");
            }
        }

        if (inputOption.equals("1")) {
            customerMenu();
        }
        else if (inputOption.equals("2")) {
            QueueManagement.commonWaitingQueue();
            fuelDispenseManagementPortal();
        } else if (inputOption.equals("3")) {
            FuelDispenser.dispenser();
            fuelDispenseManagementPortal();

        } else if (inputOption.equals("4")) {
            Repository.refillRepo();
            fuelDispenseManagementPortal();
        } else if (inputOption.equals("98")) {
            MainMenu.mainMenu();
        } else {
            MainMenu.exit();
        }
    }


    // Method of vehicle entering the fuel station
    public static void customerMenu() throws IOException, InterruptedException {


        System.out.println("\n\n");
        String numberPlate = noPlate(); //Obtaining the vehicle number plate

        clearScreen();

        String inputFuelType;

        while (true) {
            System.out.println("""
                    \n\n\t         FUEL DISPENSE MANAGEMENT
                    \t     =====================\n
                    \tPlease select your fuel type
                    \t 1. Petrol
                    \t 2. Diesel
                                            
                    \t 99. Exit
                    """);

            System.out.print("\t Please enter the respective number: ");
            inputFuelType = input.next();
            //Filtering and obtaining inputs
            if (inputFuelType.equals("1") || inputFuelType.equals("2") || inputFuelType.equals("3")) {
                clearScreen();
                break;

            } else {
                clearScreen();
                System.out.println("\nInvalid fuel type! Please check the input and try again");
            }
        }
        double fuelQuantity = obtainFuelAmount();
        //Obtaining required fuel amount
        //Checking fuel availability
        if (inputFuelType.equals("1")) {
            double octaneAvailability = Repository.octaneRepo.getAmount();

            if ((octaneAvailability > 500) && (fuelQuantity <= (octaneAvailability - 500))) {
                System.out.println("Checking Octane Availability.....");
                Thread.sleep(2000);
                System.out.println("Octane Fuel Available - " + Repository.octaneRepo.getAmount() + " L");// remove the value at the end
                Repository.reduceFromRepo("octane",fuelQuantity);
                QueueManagement.checkOctaneDispenserAvailability(numberPlate,fuelQuantity);


            } else {
                System.out.println("Checking Octane Availability.....");
                Thread.sleep(2000);
                System.out.println("Octane Out of stock ! Sorry for the inconvenience caused :{");
                Thread.sleep(2000);
                fuelDispenseManagementPortal();
            }

        } else if (inputFuelType.equals("2")) {
            double dieselAvailability = Repository.dieselRepo.getAmount();
            if ((dieselAvailability > 500) && (fuelQuantity <= (dieselAvailability - 500))) {
                System.out.println("Checking Diesel Availability......");
                Thread.sleep(2000);
                System.out.println("Diesel Fuel Available - " + Repository.dieselRepo.getAmount() + " L");
                Repository.reduceFromRepo("diesel",fuelQuantity);
                QueueManagement.checkDieselDispenserAvailability(numberPlate,fuelQuantity);



            } else {
                System.out.println("Checking Diesel Availability......");
                Thread.sleep(2000);
                System.out.println("Diesel Out of stock ! Sorry for the inconvenience caused :{");
                Thread.sleep(2000);
                ;
                fuelDispenseManagementPortal();
            }

        } else {
            MainMenu.exit();

        }

    }


//=====================================================================================================
    public static String checkOctaneVehicleType() throws IOException, InterruptedException {
        // Method to check Octane - vehicle type
        String inputOctaneVehicleType;

        while (true) {
            System.out.println("""
                    Please select your vehicle type
                    1. CAR
                    2. VAN
                    3. THREE WHEELER
                    4. MOTOR BIKE
                    5. OTHER VEHICLES """);

            System.out.print("Please enter the respective number: ");
            inputOctaneVehicleType = input.next();


            //Filtering and obtaining inputs
            if (inputOctaneVehicleType.equals("1") || inputOctaneVehicleType.equals("2") || inputOctaneVehicleType.equals("3") || inputOctaneVehicleType.equals("4")|| inputOctaneVehicleType.equals("5")) {
                clearScreen();
                break;

            } else {
                clearScreen();
                System.out.println("Invalid vehicle type! Please check the input and try again");
            }
        }
        String[] octaneVehicles = {"CAR", "VAN", "THREE WHEELER", "MOTOR BIKE","OTHER VEHICLES"};
        for (int i = 0; i < octaneVehicles.length; i++) {
            String value = String.valueOf(i + 1);
            if (inputOctaneVehicleType.equals(value)) {
                inputOctaneVehicleType = octaneVehicles[i];
            }
        }

    return inputOctaneVehicleType;
    }

    public static String checkDieselVehicleType() throws IOException, InterruptedException {
        // Method to check Diesel - vehicle type

        String inputDieselVehicleType;

        while (true) {
            System.out.println("""
                    Please select your vehicle type
                    1. PUBLIC TRANSPORT
                    2. OTHER VEHICLES""");

            System.out.print("Please enter the respective number: ");
            inputDieselVehicleType = input.next();

            //Filtering and obtaining inputs
            if (inputDieselVehicleType.equals("1") || inputDieselVehicleType.equals("2")) {
                clearScreen();
                break;

            } else {
                clearScreen();
                System.out.println("Invalid vehicle type! Please check the input and try again");
            }
        }
        String[] dieselVehicles = {"PUBLIC TRANSPORT", "OTHER VEHICLES"};
        for (int i = 0; i < dieselVehicles.length; i++) {
            String value = String.valueOf(i + 1);
            if (inputDieselVehicleType.equals(value)) {
                inputDieselVehicleType = dieselVehicles[i];
            }
        }

        return inputDieselVehicleType;
    }

    //Method to obtain required full amount
    public static double obtainFuelAmount() {
        System.out.print("\n Enter the required amount of Fuel in Litres: ");
        while (!input.hasNextDouble()) {
            System.out.println("Invalid Input: Input a number for fuel amount");
            input.next();
        }
        double inputFuelAmount = input.nextDouble();
        return inputFuelAmount;
    }

    //Method to get the number plate of the vehicle
    public static String noPlate() throws IOException, InterruptedException {
        System.out.print("\n Enter the vehicle number plate: ");
        String numberPlate;
        while (true) {
            numberPlate = input.next();
            if ((numberPlate.length() > 5) && (numberPlate.length() < 8)) {
                break;
            } else {
                clearScreen();
                System.out.println("Invalid number plate!");
            }
        }
        return numberPlate;
    }


        public static void clearScreen () throws IOException, InterruptedException {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }


    }