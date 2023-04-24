import java.io.*;
import java.math.BigDecimal;

import static java.util.stream.Collectors.joining;

class Studio{
    private final long id;
    private BigDecimal pricePerHour;
    private int maxWorkingHours;
    private int workedHours;
    private static BigDecimal minPricePerHour;
    private BigDecimal currencyEuro;

    //1

    public Studio(long id, int maxWorkingHours) {
        this.id = id;
        this.maxWorkingHours = maxWorkingHours;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long id = Long.parseLong(bufferedReader.readLine().trim());

        int maxWorkingHours = Integer.parseInt(bufferedReader.readLine().trim());

        double minPricePerHour = Double.parseDouble(bufferedReader.readLine().trim());

        double currencyEuro = Double.parseDouble(bufferedReader.readLine().trim());

        double pricePerHour = Double.parseDouble(bufferedReader.readLine().trim());

        int workedHours = Integer.parseInt(bufferedReader.readLine().trim());

        // Create an object of type Studio using the constructor with two parameters. Pass id and maxWorkingHours as arguments.

        // Use set method to set the minimum price per hour. User variable minPricePerHour to pass it as a method argument.

        // Use set method to set the Euro currency. Pass currencyEuro to the set method.

        // Use set method to set the price for renting the studio for one hour. Pass pricePerHour to the set method.

        // Use set method to set the number of hours for the day that the studio was rented.

        // Print on the console the turnover in lv., calculated by using workedHours and pricePerHour.

        // Print on the console the turnover in Euro., calculated by using workedHours and pricePerHour.

        long id2 = Long.parseLong(bufferedReader.readLine().trim());

        int maxWorkingHours2 = Integer.parseInt(bufferedReader.readLine().trim());

        double pricePerHour2 = Double.parseDouble(bufferedReader.readLine().trim());

        int workedHours2 = Integer.parseInt(bufferedReader.readLine().trim());

        // Create the second object of type Studio, using the constructor with 2 parameters. Use id2 and maxWorkingHours2 to pass them as arguments

        // Use set method to set the price for renting the second studio for one hour. Pass pricePerHour2 to the set method.

        // Use set method to set the number of hours for the day that the second studio was rented (workedHours2)

        // Print on the console the result of getting the id of the studio that is returned as a result of the studioWithLargerPrice() method. The first studio object is used to call the method.

        // Print on the console the result of calling the method isFirstStudioWithGreaterTurnover() method. The first studio object is used to call the method.

        bufferedReader.close();
    }
}
