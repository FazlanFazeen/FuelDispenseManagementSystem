
import java.sql.*;

public class DB {
    public static void getTotalFuelDispensedByVehicleCategoryAndFuelType() {try {
        // Establishing DB Connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fuel_management_system","root", "");
        // Here FuelManagementSystem is database name, root is username and password
        Statement stmt = con.createStatement();
        String sql = "SELECT vehicle_type, fuel_type, SUM(fuel_amount) AS total_fuel_dispensed FROM fuel_management GROUP BY vehicle_type, fuel_type";
        ResultSet resultSet = stmt.executeQuery(sql);

        // Displaying the table header
        System.out.println("*----------------*------------*--------------------*");
        System.out.println("| Vehicle Type   | Fuel Type  |Total Fuel Dispensed|");
        System.out.println("*----------------*------------*--------------------*");

        // Displaying the table rows
        while (resultSet.next()) {
            String vehicleType = resultSet.getString("vehicle_type");
            String fuelType = resultSet.getString("fuel_type");
            double totalFuelDispensed = resultSet.getDouble("total_fuel_dispensed");
            String row = String.format("| %-15s| %-11s| %.2f              |", vehicleType, fuelType, totalFuelDispensed);
            System.out.println(row);
        }

        // Displaying the table footer
        System.out.println("*----------------*------------*--------------------*");


        con.close();
    } catch (Exception e) {
        System.out.println(e);
    }

    }
    public static void getLargestFuelReceiverAndType() {
        try {
            // Make connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fuel_management_system", "root", "");
            // here fuel_management_system is the database name, root is the username, and password is the password
            Statement stmt = con.createStatement();
            String highest = "SELECT vehicle_number_plate, vehicle_type, fuel_type, MAX(fuel_amount) AS max_fuel_dispensed FROM fuel_management GROUP BY vehicle_number_plate HAVING MAX(fuel_amount) = (SELECT MAX(fuel_amount) FROM fuel_management);";
            ResultSet resultSet = stmt.executeQuery(highest);

            // Displaying the table header
            System.out.println("*-------------------*--------------*----------*--------------------*");
            System.out.println("| Vehicle No. Plate | Vehicle Type |Fuel Type | Max Fuel Dispensed |");
            System.out.println("*-------------------*--------------*----------*--------------------*");

            // Displaying the table rows
            while (resultSet.next()) {
                String vehicleNumberPlate = resultSet.getString("vehicle_number_plate");
                String VehicleType = resultSet.getString("vehicle_type");
                String fuelType = resultSet.getString("fuel_type");
                double maxFuelDispensed = resultSet.getDouble("max_fuel_dispensed");
                String row = String.format("| %-18s| %-13s| %-9s| %-19s|", vehicleNumberPlate, VehicleType, fuelType, maxFuelDispensed);
                System.out.println(row);

            // Displaying the table footer
            System.out.println("*-------------------*--------------*----------*--------------------*");

            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void getStat() {
        try {
            // Establishing DB Connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fuel_management_system", "root", "");
            // here FuelManagementSystem is database name, root is username and password
            Statement stmt = con.createStatement();
            String sql = "SELECT dispenser_id, COUNT(vehicle_number_plate) AS total_vehicles_served, SUM(fuel_amount) AS total_fuel_dispensed, SUM(income) AS total_income_per_dispenser FROM fuel_management GROUP BY dispenser_id";
            ResultSet resultSet = stmt.executeQuery(sql);

            // Displaying the table header
            System.out.println("+----------------+-----------------------*---------------------*--------------------------+");
            System.out.println("| Dispenser ID   | Total Vehicles Served |Total Fuel Dispensed |Total Income Per Dispenser|");
            System.out.println("+----------------+-----------------------*---------------------*--------------------------+");

            // Displaying the table rows
            while (resultSet.next()) {
                double dispenserId = resultSet.getDouble("dispenser_id");
                double totalVehiclesServed = resultSet.getDouble("total_vehicles_served");
                double totalFuelDispensed = resultSet.getDouble("total_fuel_dispensed");
                double totalIncomePerDispenser = resultSet.getDouble("total_income_per_dispenser");
                String row = String.format("| %-15d| %-22d| %-20.2f| %-25.2f|", (int)dispenserId, (int)totalVehiclesServed, (double)totalFuelDispensed, (double)totalIncomePerDispenser);
                System.out.println(row);
            }

            // Displaying the table footer
            System.out.println("+----------------+-----------------------*---------------------*--------------------------+");


            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public static void getIncomeStat() {try {
        // Establishing DB Connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fuel_management_system","root", "");
        // here FuelManagementSystem is database name, root is username and password
        Statement stmt = con.createStatement();
        String sql = "SELECT fuel_type, SUM(fuel_amount * payment_amount) AS total_income, SUM(remaining_stock) AS Remaining_Stock FROM fuel_management GROUP BY fuel_type;" ;
        ResultSet resultSet = stmt.executeQuery(sql);

        // Displaying the table header
        System.out.println("*----------------*------------*--------------------*");
        System.out.println("| Fuel Type      | Total Income  |Remaining Stock  |");
        System.out.println("*----------------*------------*--------------------*");

        // Displaying the table rows
        while (resultSet.next()) {
            String fuel_type = resultSet.getString("fuel_type");
            String total_income = resultSet.getString("total_income");
            double remaining_stock = resultSet.getDouble("Remaining_Stock");
            String row = String.format("| %-15s| %-11s| %.2f             |", fuel_type, total_income, remaining_stock );
            System.out.println(row);
        }

        // Displaying the table footer
        System.out.println("*----------------*------------*--------------------*");


        con.close();
    } catch (Exception e) {
        System.out.println(e);
    }

    }
}
