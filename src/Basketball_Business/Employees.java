package Basketball_Business;

import java.util.Scanner;
public class Employees {
    private double numOfPayMonthlyEmployee, numOfPayHourlyEmployee, numOfHoursPayHourlyEmployeeWork, payMonthlyEmployeeSalary, payHourlyEmployeeSalary, totalPayMonthlyEmployeeSalary, totalPayHourlyEmployeeSalary, totalSalary;


    Scanner scan = new Scanner(System.in);
    Employees(){
        System.out.print("Enter The Number Of Pay Monthly Employee: ");
        numOfPayMonthlyEmployee = scan.nextDouble();
        System.out.print("Enter Amount Of Pay Monthly Employee Salary: ");
        payMonthlyEmployeeSalary = scan.nextDouble();
        System.out.print("Enter The Number Of Pay Hourly Employee: ");
        numOfPayHourlyEmployee = scan.nextDouble();
        System.out.print("Enter The Number Of Hours Pay Hourly Employee Worked: ");
        numOfHoursPayHourlyEmployeeWork = scan.nextDouble();
        System.out.print("Enter Amount Of Pay Hourly Employee Salary: ");
        payHourlyEmployeeSalary = scan.nextDouble();
        totalPayMonthlyEmployeeSalary = calculateTotalPayMonthlyEmployeeSalary(numOfPayMonthlyEmployee,payMonthlyEmployeeSalary);
        totalPayHourlyEmployeeSalary = calculateTotalPayHourlyEmployeeSalary(numOfPayHourlyEmployee, numOfHoursPayHourlyEmployeeWork, payHourlyEmployeeSalary);
        totalSalary = calculateTotalSalary(totalPayMonthlyEmployeeSalary, totalPayHourlyEmployeeSalary);
        printDetails(numOfPayMonthlyEmployee, numOfPayHourlyEmployee, numOfHoursPayHourlyEmployeeWork, payMonthlyEmployeeSalary, payHourlyEmployeeSalary, totalPayMonthlyEmployeeSalary, totalPayHourlyEmployeeSalary, totalSalary);
    }

    Employees(double payMonthlyEmployeeSalary){
        System.out.print("Enter The Number Of Pay Monthly Employee: ");
        numOfPayMonthlyEmployee = scan.nextDouble();
        System.out.print("Amount Of Pay Monthly Employee Salary: " + payMonthlyEmployeeSalary);
        System.out.print("\nEnter The Number Of Pay Hourly Employee: ");
        numOfPayHourlyEmployee = scan.nextDouble();
        System.out.print("Enter The Number Of Hours Pay Hourly Employee Worked: ");
        numOfHoursPayHourlyEmployeeWork = scan.nextDouble();
        System.out.print("Enter Amount Of Pay Hourly Employee Salary: ");
        payHourlyEmployeeSalary = scan.nextDouble();
        totalPayMonthlyEmployeeSalary = calculateTotalPayMonthlyEmployeeSalary(numOfPayMonthlyEmployee,payMonthlyEmployeeSalary);
        totalPayHourlyEmployeeSalary = calculateTotalPayHourlyEmployeeSalary(numOfPayHourlyEmployee, numOfHoursPayHourlyEmployeeWork, payHourlyEmployeeSalary);
        totalSalary = calculateTotalSalary(totalPayMonthlyEmployeeSalary, totalPayHourlyEmployeeSalary);
        printDetails(numOfPayMonthlyEmployee, numOfPayHourlyEmployee, numOfHoursPayHourlyEmployeeWork, payMonthlyEmployeeSalary, payHourlyEmployeeSalary, totalPayMonthlyEmployeeSalary, totalPayHourlyEmployeeSalary, totalSalary);
    }

    Employees(double payMonthlyEmployeeSalary, double payHourlyEmployeeSalary){
        System.out.print("Enter The Number Of Pay Monthly Employee: ");
        numOfPayMonthlyEmployee = scan.nextDouble();
        System.out.print("Amount Of Pay Monthly Employee Salary: " + payMonthlyEmployeeSalary);
        System.out.print("\nEnter The Number Of Pay Hourly Employee: ");
        numOfPayHourlyEmployee = scan.nextDouble();
        System.out.print("Enter The Number Of Hours Pay Hourly Employee Worked: ");
        numOfHoursPayHourlyEmployeeWork = scan.nextDouble();
        System.out.print("Enter Amount Of Pay Hourly Employee Salary: " + payHourlyEmployeeSalary + "\n");
        totalPayMonthlyEmployeeSalary = calculateTotalPayMonthlyEmployeeSalary(numOfPayMonthlyEmployee,payMonthlyEmployeeSalary);
        totalPayHourlyEmployeeSalary = calculateTotalPayHourlyEmployeeSalary(numOfPayHourlyEmployee, numOfHoursPayHourlyEmployeeWork, payHourlyEmployeeSalary);
        totalSalary = calculateTotalSalary(totalPayMonthlyEmployeeSalary, totalPayHourlyEmployeeSalary);
        printDetails(numOfPayMonthlyEmployee, numOfPayHourlyEmployee, numOfHoursPayHourlyEmployeeWork, payMonthlyEmployeeSalary, payHourlyEmployeeSalary, totalPayMonthlyEmployeeSalary, totalPayHourlyEmployeeSalary, totalSalary);
    }

    double calculateTotalPayMonthlyEmployeeSalary(double numOfPayMonthlyEmployee, double payMonthlyEmployeeSalary) {
        return numOfPayMonthlyEmployee * payMonthlyEmployeeSalary;
    }

    double calculateTotalPayHourlyEmployeeSalary(double numOfPayHourlyEmployee, double payHourlyEmployeeSalary, double numOfHoursPayHourlyEmployeeWork) {
        return numOfPayHourlyEmployee * payHourlyEmployeeSalary * numOfHoursPayHourlyEmployeeWork;
    }

    double calculateTotalSalary(double totalPayMonthlyEmployeeSalary, double totalPayHourlyEmployeeSalary) {
        return totalPayMonthlyEmployeeSalary + totalPayHourlyEmployeeSalary;
    }

    void printDetails(double numOfPayMonthlyEmployee, double numOfPayHourlyEmployee, double numOfHoursPayHourlyEmployeeWork, double payMonthlyEmployeeSalary, double payHourlyEmployeeSalary, double totalPayMonthlyEmployeeSalary, double totalPayHourlyEmployeeSalary, double totalSalary) {
        System.out.println("\nEmployees Details\n");
        System.out.println("Number Of Pay Monthly Employee: " + numOfPayMonthlyEmployee);
        System.out.printf("Pay Monthly Employee Salary: RM%.2f%n",payMonthlyEmployeeSalary);
        System.out.printf("Total Pay Monthly Employee Salary: RM%.2f%n",totalPayMonthlyEmployeeSalary);
        System.out.println("Number Of Pay Hourly Employee: " + numOfPayHourlyEmployee);
        System.out.println("Number Of Hours Pay Hourly EmployeeWork: " + numOfHoursPayHourlyEmployeeWork + "hours");
        System.out.printf("Pay Hourly Employee Salary Per Hour: RM%.2f%n",payHourlyEmployeeSalary);
        System.out.printf("Total Pay Hourly Employee Salary: RM%.2f%n",totalPayHourlyEmployeeSalary);
        System.out.printf("Total Salary: RM%.2f%n",totalSalary);
    }
}
