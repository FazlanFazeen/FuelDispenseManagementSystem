import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class QueueManagement {

    static Queue<String> dispenser1Queue = new LinkedList<>();
    static Queue<String> dispenser2Queue = new LinkedList<>();
    static Queue<String> dispenser3Queue = new LinkedList<>();
    static Queue<String> dispenser4Queue = new LinkedList<>();
    static Queue<String> dispenser5Queue = new LinkedList<>();
    static Queue<String> dispenser6Queue = new LinkedList<>();
    static Queue<String> dispenser7Queue = new LinkedList<>();
    static Queue<String> CommonWaitingQueue = new LinkedList<>();

    public static void checkOctaneDispenserAvailability(String vehicleNumberPlate, double fuelQuantity) throws IOException, InterruptedException {
        //Method to check the availability of octane Dispensers
        String octaneVehicleType = fuelDispenseManagement.checkOctaneVehicleType();

        Customer customer = new Customer(vehicleNumberPlate, "Octane", octaneVehicleType, fuelQuantity);
        Customer.customers.add(customer);


        if (octaneVehicleType.equals("VAN") || (octaneVehicleType.equals("CAR"))) {

            if (10 > dispenser1Queue.size()) {
                System.out.println("Slots available for CARS OR VANS in dispenser 1: " + (10 - dispenser1Queue.size()));
                dispenser1Queue.add(vehicleNumberPlate);

                System.out.println("\nVehicle Number " + vehicleNumberPlate + " has been assigned to dispenser 1 ");
                fuelDispenseManagement.fuelDispenseManagementPortal();

            } else if (10 > dispenser2Queue.size()) {
                System.out.println("Slots available for CARS OR VANS in dispenser 2: " + (10 - dispenser2Queue.size()));
                dispenser2Queue.add(vehicleNumberPlate);

                System.out.println("\nVehicle Number " + vehicleNumberPlate + " has been assigned to dispenser 2 ");

                fuelDispenseManagement.fuelDispenseManagementPortal();
            } else {
                CommonWaitingQueue.add(vehicleNumberPlate);
                System.out.println("Dispenser queue slots for " + octaneVehicleType + "are full....\nYou have been assigned to theCommon waiting queue");
            }
        } else if (octaneVehicleType.equals("OTHER VEHICLES")) {
            if (10 > dispenser2Queue.size()) {
                System.out.println("Slots available for OTHER VEHICLES in dispenser 2: " + (10 - dispenser2Queue.size()));
                dispenser2Queue.add(vehicleNumberPlate);

                System.out.println("\nVehicle Number " + vehicleNumberPlate + " has been assigned to dispenser 2 ");

                fuelDispenseManagement.fuelDispenseManagementPortal();
            } else {
                CommonWaitingQueue.add(vehicleNumberPlate);
                System.out.println("Dispenser queue slots for " + octaneVehicleType + "are full....\nYou have been assigned to theCommon waiting queue");
            }
        } else if (octaneVehicleType.equals("THREE WHEELER")) {
            if (10 > dispenser3Queue.size()) {
                System.out.println("Slots available for THREE WHEELERS in dispenser 3: " + (10 - dispenser3Queue.size()));
                dispenser3Queue.add(vehicleNumberPlate);
                System.out.println("\nVehicle Number " + vehicleNumberPlate + " has been assigned to dispenser 3 ");

                fuelDispenseManagement.fuelDispenseManagementPortal();
            } else {
                CommonWaitingQueue.add(vehicleNumberPlate);
                System.out.println("Dispenser queue slots for " + octaneVehicleType + "are full....\nYou have been assigned to theCommon waiting queue");
            }
        } else if (octaneVehicleType.equals("MOTOR BIKE")) {
            if (10 > dispenser4Queue.size()) {

                System.out.println("Slots available for MOTOR BIKES in dispenser 4: " + (10 - dispenser4Queue.size()));
                dispenser4Queue.add(vehicleNumberPlate);

                System.out.println("\nVehicle Number " + vehicleNumberPlate + " has been assigned to dispenser 4 ");
                fuelDispenseManagement.fuelDispenseManagementPortal();
            } else {
                CommonWaitingQueue.add(vehicleNumberPlate);
                System.out.println("Dispenser queue slots for " + octaneVehicleType + "are full....\nYou have been assigned to theCommon waiting queue");
                fuelDispenseManagement.fuelDispenseManagementPortal();
            }
        }

    }


    public static void checkDieselDispenserAvailability(String vehicleNumberPlate, double fuelQuantity) throws IOException, InterruptedException {
        //Method to check the availability of diesel Dispensers
        String dieselVehicleType = fuelDispenseManagement.checkDieselVehicleType();
        Customer customer = new Customer(vehicleNumberPlate, "Diesel", dieselVehicleType, fuelQuantity);
        Customer.customers.add(customer);


        if (dieselVehicleType.equals("VAN") || (dieselVehicleType.equals("PUBLIC TRANSPORT"))) {
            if (10 > dispenser5Queue.size()) {
                System.out.println("Slots available for PUBLIC TRANSPORT in dispenser 5: " + (10 - dispenser5Queue.size()));
                dispenser5Queue.add(vehicleNumberPlate);

                System.out.println("\nVehicle Number " + vehicleNumberPlate + " has been assigned to dispenser 5 ");
                fuelDispenseManagement.fuelDispenseManagementPortal();
            } else {
                CommonWaitingQueue.add(vehicleNumberPlate);
                System.out.println("Dispenser queue slots for " + dieselVehicleType + " are full....\nYou have been assigned to theCommon waiting queue");
            }
        } else if (dieselVehicleType.equals("OTHER VEHICLES")) {
            if (10 > dispenser6Queue.size()) {
                System.out.println("Slots available for OTHER VEHICLES in dispenser 6: " + (10 - dispenser6Queue.size()));
                dispenser6Queue.add(vehicleNumberPlate);

                System.out.println("\nVehicle Number " + vehicleNumberPlate + " has been assigned to dispenser 6 ");

                fuelDispenseManagement.fuelDispenseManagementPortal();
            } else {
                CommonWaitingQueue.add(vehicleNumberPlate);
                System.out.println("Dispenser queue slots for " + dieselVehicleType + " are full....\nYou have been assigned to theCommon waiting queue");
            }
        } else if (dieselVehicleType.equals("OTHER VEHICLES")) {
            if (10 > dispenser7Queue.size()) {
                System.out.println("Slots available for OTHER VEHICLES in dispenser 7: " + (10 - dispenser7Queue.size()));
                dispenser7Queue.add(vehicleNumberPlate);

                System.out.println("\nVehicle Number " + vehicleNumberPlate + " has been assigned to dispenser 7 ");

                fuelDispenseManagement.fuelDispenseManagementPortal();
            } else {
                CommonWaitingQueue.add(vehicleNumberPlate);
                CommonWaitingQueue.add(vehicleNumberPlate);
                System.out.println("Dispenser queue slots for " + dieselVehicleType + " are full....\nYou have been assigned to theCommon waiting queue");
                fuelDispenseManagement.fuelDispenseManagementPortal();
            }
        }

    }

    public static void commonWaitingQueue() {
        String vehicleNum;
        if (CommonWaitingQueue.isEmpty()) {
            System.out.println("No vehicles in the common Waiting queue");
        } else {
            if (dispenser1Queue.size() < 10) {
                ListIterator<Customer> iterator = Customer.customers.listIterator();
                while (iterator.hasNext()) {
                    Customer customer = iterator.next();
                    if ((customer.getFuelType().equalsIgnoreCase("Octane")) && ((customer.getVehicleType().equalsIgnoreCase("CAR")) || (customer.getVehicleType().equalsIgnoreCase("VAN")))) {
                        vehicleNum = customer.getVehicleNo();
                        Queue<String> tempQueue = new LinkedList<>();
                        while (!CommonWaitingQueue.isEmpty()){
                            String val = CommonWaitingQueue.remove();
                            if (!(val.equalsIgnoreCase(vehicleNum))){
                                tempQueue.add(val);

                            }
                        }
                        CommonWaitingQueue = tempQueue;
                        }
                    }

                }
            }
        }
    }

