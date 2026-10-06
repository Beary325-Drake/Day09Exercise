/* T. Urness
 * CS 67
 */

import java.util.Scanner;

public class PayrollDriver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the name of the employee? ");
        String namee = keyboard.nextLine();

        System.out.println("Please Enter Salary: ");
        Double salarye = keyboard.nextDouble(); // saves the input of the rating as variable "rating"
        keyboard.nextLine();

        System.out.println("What is the name of the Manager? ");
        String namem = keyboard.nextLine();

        System.out.println("Please Enter Salary: ");
        Double salarym = keyboard.nextDouble(); 
        keyboard.nextLine();

        System.out.println("Please Enter Stipend: ");
        Double stipend = keyboard.nextDouble(); 
        keyboard.nextLine();

        System.out.println("What is the name of the Contractor? ");
        String namec = keyboard.nextLine();

        System.out.println("Please Enter The Hourly Rate: ");
        Double hourlyrate = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Please Enter Hours Worked: ");
        int hoursworked = keyboard.nextInt();
        keyboard.nextLine();

        Employee staff = new Employee(namee, salarye);
        Manager mgr = new Manager(namem, salarym, stipend);
        Contractor contractor = new Contractor(namec, hourlyrate, hoursworked);

        System.out.println("--- (calculatePay) ---");
        System.out.println(staff);
        System.out.println(mgr);
        System.out.println(contractor);

        System.out.println("\n--- (applyBonus) ---");
        System.out.println(mgr.getName() + " with default bonus:    $" + mgr.applyBonus());
        System.out.println(mgr.getName() + " with 10% bonus:        $" + mgr.applyBonus(0.10));
        System.out.println(mgr.getName() + " with \"high\" tier bonus: $" + mgr.applyBonus("high"));
        System.out.println(mgr.getName() + " with 10% bonus and max $1000: $" + mgr.applyBonus(0.10, 1000.0));
        // new line ^ for new overload method.
        keyboard.close();
    }
}
