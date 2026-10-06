/* T. Urness
 * CS 67
 * Real-world demo of overloading vs. overriding
 */

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String n, double salary) {
        name = n;
        baseSalary = salary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }

    public double applyBonus() {
        // flat default bonus
        return calculatePay() + 500.0;
    }

    public double applyBonus(double percentage) {
        // percentage-based bonus, e.g. 0.10 for 10%
        return calculatePay() + (calculatePay() * percentage);
    }

    public double applyBonus(String tier) {
        // tier-based bonus
        double bonus = tier.equalsIgnoreCase("high") ? 2000.0 : 750.0;
        return calculatePay() + bonus;
    }
    
    public double applyBonus(double percentage, double maxBonus) { // Extended the overloaded method to include a max bonus, so that the bonus cannot go passt the specificed value.
    double pay = calculatePay();
    double bonus = pay * percentage; // Copilot fixed the issues here because it was not calculating the bonus correctly.

    if (bonus > maxBonus) {
        bonus = maxBonus;
    }

    return pay + bonus;
}

    @Override // override tostring so that it displays the worker and their salary
    public String toString() {
        return name + " earns $" + calculatePay();
    }
}
