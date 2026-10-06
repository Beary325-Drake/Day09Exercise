/* T. Urness
 * CS 67
 */

public class Manager extends Employee {
    private double stipend;

    public Manager(String n, double salary, double stipend) {
        super(n, salary);
        this.stipend = stipend;
    }

    @Override // override so it gets base salary and then adds the stipend
    public double calculatePay() {
        return getBaseSalary() + stipend;
    }
}
