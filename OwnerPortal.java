
import java.io.IOException;
import java.util.Scanner;

public class OwnerPortal {

    public static void main() throws IOException, InterruptedException {
        //This method creates the owner portal
        Scanner sc = new Scanner(System.in);
        String option;

        //Creating a new db object
        DB db = new DB();

        // Display menu options
        while (true) {
            System.out.println("""  

                    |----------------------------------------------------------------------------------------------------------|

                                                        ░█──░█ █▀▀ █── █▀▀ █▀▀█ █▀▄▀█ █▀▀\s
                                                        ░█░█░█ █▀▀ █── █── █──█ █─▀─█ █▀▀\s
                                                        ░█▄▀▄█ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀▀ ▀───▀ ▀▀▀
                                                        
                                                                ░▒█▀▀▀█░░▀░░█▀▀▄
                                                                ░░▀▀▀▄▄░░█▀░█▄▄▀
                                                                ░▒█▄▄▄█░▀▀▀░▀░▀▀
                                                       
                                               Please choose one of the following options:
                                                1. View total fuel dispensed per vehicle category type and per fuel type
                                                2. View vehicle that received the largest amount of fuel for the day and fuel type
                                                3. View total number of vehicles served by each dispenser along with amounts of fuel and total income per dispenser
                                                4. View total income of the gas station per day per fuel type and remaining stock at close
                                                
                                                     
                                                98. Back
                                                99. Exit
                    |------------------------------------------------------------------------------------------------------------|""");

            // Display menu options
            System.out.print("Please enter your option:");


            // Filter and obtain inputs
            option = sc.next();

            if (option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4") || option.equals("98") || option.equals("99")) {
                MainMenu.clearScreen();
                break;

            } else {
                MainMenu.clearScreen();
                System.out.println("Invalid choice! Please check the input and try again");
            }
        }
        String anykey;

        if (option.equals("1")) {
            db.getTotalFuelDispensedByVehicleCategoryAndFuelType();
            System.out.print("Enter any key to continue");
            anykey = sc.next();
            main();
        } else if (option.equals("2")) {
            db.getLargestFuelReceiverAndType();
            System.out.print("Enter any key to continue");
            anykey = sc.next();
            main();
        } else if (option.equals("3")) {
            db.getStat();
            System.out.print("Enter any key to continue");
            anykey = sc.next();
            main();
        } else if (option.equals("4")) {
            db.getIncomeStat();
            System.out.print("Enter any key to continue");
            anykey = sc.next();
            main();
        } else if (option.equals("98")) {
            MainMenu.mainMenu(); //Redirecting to main menu
        } else {
            MainMenu.exit(); //Exiting the program

        }
    }
}


