public class Salary {

    public static int salarySum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("The amount of salary costs per month: " + sum);
        return sum;
    }

    public static Employee maxEmployee (Employee[] employees) {
        Employee employeeMax = null;
        int maxVaiue = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxVaiue) {
                maxVaiue = employee.getSalary();
                employeeMax = employee;
            }
        }
        System.out.println("The maximum salary of an employee: " + maxVaiue + " " + employeeMax.getPeople());
        return employeeMax;
    }

    public static Employee minEmployee(Employee[] employees) {
        Employee employeeMin = null;
        int minVaiue = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < minVaiue) {
                minVaiue = employee.getSalary();
                employeeMin = employee;
              }
        }
            System.out.println("The minimum salary of an employee: " + minVaiue + " " + employeeMin.getPeople());
            return employeeMin;
        }

        public static int averageSalary(Employee[] employees) {

        int salaryAverage = 0;
        int sum = 0;
            for (int i = 0; i < employees.length; i++) {
                    sum = sum + employees[i].getSalary();
            }
            salaryAverage = sum / employees.length;

            System.out.println("Average salary of employees: " + salaryAverage + " ");
            return salaryAverage;
        }
}




