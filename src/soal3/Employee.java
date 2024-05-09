package UTS.soal3;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return getSalary() * 12;
    }
    public int raiseSalary(int percent) {
        double salary = this.salary * (1 + ((double) percent / 100));
        setSalary((int) salary);
        return getSalary();
    }

    @Override
    public String toString() {
        return "Employee[id=" + getID() + ",name=" + getFirstName() + " " + getLastName() + ",salary=" + getSalary() + "]";
    }
}
