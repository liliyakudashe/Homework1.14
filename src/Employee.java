import java.util.Objects;

public class Employee {

    private int id;
    private final String people;
     private String department;
    private int salary;
    private static int count = 0;

    public Employee(String people, int salary, String department) {
        count++;
        this.id = count;
        this.people = people;
        this.department = department;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getPeople() {
        return people;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee: " + people + ". Salary: " + salary + ". Department: " + department + ". " + " Id:" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && people.equals(employee.people) && department.equals(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, people, department, salary);
    }


}
