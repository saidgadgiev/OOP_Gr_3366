package Task_1;

public class NetSalaryCalculator {
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25); //calculate in other way
        return employee.getBaseSalary() - tax;
    }
}
