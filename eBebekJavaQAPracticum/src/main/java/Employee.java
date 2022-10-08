
/**
 *
 * @author ayza
 */
public class Employee {

    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 1000) {
            return salary * 3 / 100;
        } else {
            return 0;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        double raise=(salary-tax()+bonus());
        if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            return raise * 10 / 100;
        } else if (2021 - hireYear < 10) {
            return raise * 5 / 100;
        } else {
            return raise * 15 / 100;
        }
    }

    @Override
    public String toString() {
        double afterRaiseSalary = salary + raiseSalary() - salary;
        double taxBonus = salary + bonus() - tax();
        double netSalary = taxBonus + raiseSalary();
        return "Name " + name + "\nSalary " + salary + "\nWork Hours " + workHours
                + "\nHire Year " + hireYear + "\nTax " + tax() + "\nBonus " + bonus()
                + "\nRaise Salary " + afterRaiseSalary + "\nSalary with Tax and Bonus "
                + taxBonus + "\nNet Salary " + netSalary;
    }
}
