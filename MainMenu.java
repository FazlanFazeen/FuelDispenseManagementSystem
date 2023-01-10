import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws IOException, InterruptedException {
        mainMenu();
    }
    //Main method that runs the entire FUEL DISPENSE MANAGEMENT PROGRAM
    public static void mainMenu() throws IOException, InterruptedException {
        clearScreen();
        String userRole;

        while (true) {
            System.out.println("""  

                    |----------------------------------------------------------------------------------------------------------|

                                                        ░█──░█ █▀▀ █── █▀▀ █▀▀█ █▀▄▀█ █▀▀\s
                                                        ░█░█░█ █▀▀ █── █── █──█ █─▀─█ █▀▀\s
                                                        ░█▄▀▄█ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀▀ ▀───▀ ▀▀▀
                                                                     to the
                                                                  FUEL STATION
                                               LOGIN AS:
                                                1. FUEL DISPENSE MANAGEMENT
                                                2. OWNER
                                                          
                                                0. EXIT
                    |------------------------------------------------------------------------------------------------------------|""");
            System.out.print("  Please select your desired choice: ");


            //Filtering & Obtaining user inputs
            Scanner input = new Scanner(System.in);
            userRole = input.next();
            if (userRole.equals("1") || userRole.equals("2") || userRole.equals("0")) {
                clearScreen();
                break;

            } else {
                clearScreen();
                System.out.println("Invalid choice! Please check the input and try again");
            }
        }


        //Organizing the Process
        if (userRole.equals("1")) {
            clearScreen();
            //Directing to the DispenseManagement Portal
            fuelDispenseManagement.fuelDispenseManagementPortal();

        } else if (userRole.equals("2")) {
            clearScreen();
            //Directing to Owner portal
            OwnerPortal.main();
        } else {
            exit();

        }
    }

    //Method to display the Exit window
    public static void exit() throws InterruptedException, IOException {
        clearScreen();
        System.out.println("\n\n                          ▀█▀▐░░░░░░░░▐\n" +
                "                          ░█░▐▀█░▀█▐▀█▐▐▀▐░█▐▀█▐░█\n" +
                "                          ░█░▐░█▐▀█▐░█▐▌░▐▄█▐░█▐░█\n" +
                "                          ░█░▐░█▐▄█▐░█▐▐▄▄▄█▐▄█▐▄█");
        System.out.println("\n                             HAVE A NICE DAY :) ");
        Thread.sleep(750);
        System.exit(0);

    }
    //Method to clear the screen
    public static void clearScreen() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

}