package exercise3;

public class Employee {
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary){
        setName(name);
        setSurname(surname);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
