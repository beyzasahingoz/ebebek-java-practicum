
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
        double raise;
        if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            raise = salary * 0.1;
        } else if (2021 - hireYear < 10) {
            raise = salary * 0.05;
        } else {
            raise = salary * 0.15;
        }
        return raise;
    }

    @Override
    public String toString() {
        double taxBonus = salary + bonus() - tax();
        double afterRaiseSalary = salary + raiseSalary() - salary;
        double netSalary = taxBonus + raiseSalary();
        return "Name " + name + "\nSalary " + salary + "\nWork Hours " + workHours
                + "\nHire Year " + hireYear + "\nTax " + tax() + "\nBonus " + bonus()
                + "\nRaise Salary " + afterRaiseSalary + "\nSalary with Tax and Bonus "
                + taxBonus + "\nNet Salary " + netSalary;
    }
}
