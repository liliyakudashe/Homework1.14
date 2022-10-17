import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Chandler Bing", 254411, "Finance");
        employees[1] = new Employee("Monica Geller", 526424, "Leasing");
        employees[2] = new Employee("Rachel Green", 452136, "Design");
        employees[3] = new Employee("Phoebe Buffet", 869614, "Fashion");
        employees[4] = new Employee("Joe Tribbiani", 212569, "Leasing");
        employees[5] = new Employee("Ross Geller", 624892, "Logistics");
        employees[6] = new Employee("Janice Litman", 893214, "Fashion");
        employees[7] = new Employee("Richard Bird", 965412, "Finance");
        employees[8] = new Employee("Mike Hannigan", 123658, "Design");
        employees[9] = new Employee("Carol Willick", 365487, "Logistics");




        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[3]);
        System.out.println(employees[4]);
        System.out.println(employees[5]);
        System.out.println(employees[6]);
        System.out.println(employees[7]);
        System.out.println(employees[8]);
        System.out.println(employees[9]);


     Salary.salarySum(employees);
     Salary.maxEmployee(employees);
     Salary.minEmployee(employees);
     Salary.averageSalary(employees);


    }


  }







