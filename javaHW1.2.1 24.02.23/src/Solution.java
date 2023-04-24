import java.io.*;
import java.math.*;
import java.math.BigDecimal;
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
        if(maxWorkingHours>24) {
            this.maxWorkingHours = 24;
        }
        else{
            this.maxWorkingHours = maxWorkingHours;
        }
    }

    //2
    public void setMinPricePerHour(BigDecimal minPricePerHour) {
        /*if(minPricePerHour<0) this.minPricePerHour = 0;
        else this.minPricePerHour = minPricePerHour;*/
        //this.minPricePerHour = minPricePerHour;
        if(minPricePerHour.compareTo(BigDecimal.ZERO) < 0){
            Studio.minPricePerHour = BigDecimal.ZERO;
        }
        else Studio.minPricePerHour = minPricePerHour;
    }

    //3
    public void setPricePerHour(BigDecimal pricePerHour) {
//      if(pricePerHour< minPricePerHour) {
        if(pricePerHour.compareTo(minPricePerHour) == -1){
           this.pricePerHour = minPricePerHour;
       }
       else {
           this.pricePerHour = pricePerHour;
       }
    }

    //4
    public void setWorkedHours(int workedHours) {
        if(workedHours>maxWorkingHours) {
            this.workedHours = maxWorkingHours;
        }
        else {
            this.workedHours = workedHours;
        }
    }

    //5
    public void setCurrencyEuro(BigDecimal currencyEuro) {
        this.currencyEuro = currencyEuro;
    }

    //6
    public long getId() {
        return id;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public BigDecimal getMinPricePerHour() {
        return minPricePerHour;
    }

    public BigDecimal getCurrencyEuro() {
        return currencyEuro;
    }

    //7
    public BigDecimal TurnoverLv(){
       // System.out.println(pricePerHour);
       // System.out.println(workedHours);
        return pricePerHour.multiply(BigDecimal.valueOf(workedHours));
    }

    //8
    public BigDecimal TurnoverEuro(){
       return this.TurnoverLv().multiply(currencyEuro);
    }

    //9
    public long studioWithLargerPrice(Studio studio2){
        if(this.pricePerHour.compareTo(studio2.pricePerHour) > 0) {
            return id;
        }
       else{
           return studio2.id;
       }
    }

    public boolean isFirstStudioWithGreaterTurnover(Studio studio2){
        return this.TurnoverLv().compareTo(studio2.TurnoverLv()) > 0;
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
        Studio studio1 = new Studio(id, maxWorkingHours);

        // Use set method to set the minimum price per hour. User variable minPricePerHour to pass it as a method argument.
        studio1.setMinPricePerHour(BigDecimal.valueOf(minPricePerHour));

        // Use set method to set the Euro currency. Pass currencyEuro to the set method.
        studio1.setCurrencyEuro(BigDecimal.valueOf(currencyEuro));

        // Use set method to set the price for renting the studio for one hour. Pass pricePerHour to the set method.
        studio1.setPricePerHour(BigDecimal.valueOf(pricePerHour));

        // Use set method to set the number of hours for the day that the studio was rented.
        studio1.setWorkedHours(workedHours);

        // Print on the console the turnover in lv., calculated by using workedHours and pricePerHour.
        System.out.println(studio1.TurnoverLv());

        // Print on the console the turnover in Euro., calculated by using workedHours and pricePerHour.
        System.out.println(studio1.TurnoverEuro());

        long id2 = Long.parseLong(bufferedReader.readLine().trim());

        int maxWorkingHours2 = Integer.parseInt(bufferedReader.readLine().trim());

        double pricePerHour2 = Double.parseDouble(bufferedReader.readLine().trim());

        int workedHours2 = Integer.parseInt(bufferedReader.readLine().trim());

        // Create the second object of type Studio, using the constructor with 2 parameters. Use id2 and maxWorkingHours2 to pass them as arguments
        Studio studio2 = new Studio(id2, maxWorkingHours2);

        // Use set method to set the price for renting the second studio for one hour. Pass pricePerHour2 to the set method.
        studio2.setPricePerHour(BigDecimal.valueOf(pricePerHour2));
        studio2.setCurrencyEuro(BigDecimal.valueOf(currencyEuro));

        // Use set method to set the number of hours for the day that the second studio was rented (workedHours2)
        studio2.setWorkedHours(workedHours2);

        // Print on the console the result of getting the id of the studio that is returned as a result of the studioWithLargerPrice() method. The first studio object is used to call the method.
        System.out.println(studio1.studioWithLargerPrice(studio2));

        // Print on the console the result of calling the method isFirstStudioWithGreaterTurnover() method. The first studio object is used to call the method.
        System.out.println(studio1.isFirstStudioWithGreaterTurnover(studio2));
        bufferedReader.close();
    }
}
