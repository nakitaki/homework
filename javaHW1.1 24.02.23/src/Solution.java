import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Manager{
    private String name;
    private LocalDate hiringDate;

    public Manager(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public LocalDate getDateOfHiring() {
        return hiringDate;
    }

    public long numberOfYearsInCompanyTill(LocalDate date){
        return ChronoUnit.YEARS.between(this.hiringDate, date);
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();

        int hiringYear = Integer.parseInt(bufferedReader.readLine().trim());

        int hiringMonth = Integer.parseInt(bufferedReader.readLine().trim());

        int hiringDay = Integer.parseInt(bufferedReader.readLine().trim());

        int currentYear = Integer.parseInt(bufferedReader.readLine().trim());

        int currentMonth = Integer.parseInt(bufferedReader.readLine().trim());

        int currentDay = Integer.parseInt(bufferedReader.readLine().trim());


        // Create an object of type Manager. Use one parameter constructor with argument name: Manager(name)
        Manager m1 = new Manager(name);


        // Call the set method to set the hiring date of Ivan. Pass year, month, and day as parameters: setHiringDate(LocalDate.of(hiringYear, hiringMonth, hiringDay))
        m1.setHiringDate(LocalDate.of(hiringYear, hiringMonth, hiringDay));

        // Print on the console the result of getting the hiring date
        System.out.println( m1.getDateOfHiring());
        // Print on the console the result of calling numberOfYearsInCompanyTill() method. The method has to be called with a parameter of type LocalDate using currentYear, currentMonth, currentDay: numberOfYearsInCompanyTill(LocalDate.of(currentYear, currentMonth, currentDay))
        System.out.println(m1.numberOfYearsInCompanyTill(LocalDate.of(currentYear, currentMonth, currentDay)));
        bufferedReader.close();
    }
}