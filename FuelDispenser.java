import java.io.IOException;
import java.util.ListIterator;
import java.util.Queue;

class FuelDispenser implements Runnable {
    private final int id;
    private final Queue<String> queue;
    private final int fuelDispensingTime;

    public FuelDispenser(int id, Queue<String> queue, int fuelDispensingTime) {
        this.id = id;
        this.queue = queue;
        this.fuelDispensingTime = fuelDispensingTime;
    }

    public static void dispenser(){
        Thread dispenser1 = new Thread(new FuelDispenser(1, QueueManagement.dispenser1Queue, 5000));
        Thread dispenser2 = new Thread(new FuelDispenser(2, QueueManagement.dispenser2Queue, 4000));
        Thread dispenser3 = new Thread(new FuelDispenser(3, QueueManagement.dispenser3Queue, 5000));
        Thread dispenser4 = new Thread(new FuelDispenser(4, QueueManagement.dispenser4Queue, 3000));
        Thread dispenser5 = new Thread(new FuelDispenser(5, QueueManagement.dispenser5Queue, 3000));
        Thread dispenser6 = new Thread(new FuelDispenser(6, QueueManagement.dispenser6Queue, 3000));
        Thread dispenser7 = new Thread(new FuelDispenser(7, QueueManagement.dispenser7Queue, 3000));
        dispenser1.start();
        dispenser2.start();
        dispenser3.start();
        dispenser4.start();
        dispenser5.start();
        dispenser6.start();
        dispenser7.start();

    }

    public void run() {
        boolean done = false;
        while (!done) {
            // Wait for a vehicle to arrive
            if(queue != null){
                String element = queue.peek();
                if (element!=null){
                    // Dispense fuel
                    double price = 0;
                    String desiredVehicleNumber = element;
                    ListIterator<Customer> iterator = Customer.customers.listIterator();
                    while (iterator.hasNext()) {
                        Customer customer = iterator.next();
                        if (customer.getVehicleNo().equals(desiredVehicleNumber)) {
                            if (customer.getFuelType().equalsIgnoreCase("octane")){
                                price = customer.getAmount()*450;

                            } else if (customer.getFuelType().equalsIgnoreCase("diesel")) {
                                price = customer.getAmount()*430;


                            }
                            System.out.println("\nDispenser " + id + ": Dispensing fuel to vehicle: "+ element+"\n\n\n\t\tPAYMENT RECEIPT\t\t\t\n\t" +
                                    "Vehicle No: "+customer.getVehicleNo()+"\n\tFuel Type: "+customer.getFuelType()+"\n\tDispensed Amount: "+ customer.getAmount()+
                                    "L"+"\n\tFinal Price: "+price);
//


                        }
                    }

                    queue.poll();
                }else{
                    done=true;
                }

                try {
                    Thread.sleep(fuelDispensingTime);
                } catch (InterruptedException e) {
                    // Handle interruption
                }
            }

        }
    }


}


