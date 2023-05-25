package Task_1;

import java.sql.Date;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", new Date(1990, 10, 15), 50000);
        NetSalaryCalculator calculator = new NetSalaryCalculator();
        int netSalary = calculator.calculateNetSalary(employee);
        System.out.println("Employee info: " + employee.getEmpInfo());
        System.out.println("Net salary: " + netSalary);
        }
}
