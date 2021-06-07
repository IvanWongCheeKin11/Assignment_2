package Ivan;

import java.util.Scanner;
public class Employees extends Finance{
    private double numOfPayMonthlyEmployee, numOfPayHourlyEmployee, numOfHoursPayHourlyEmployeeWork, payMonthlyEmployeeSalary, payHourlyEmployeeSalary, totalPayMonthlyEmployeeSalary, totalPayHourlyEmployeeSalary, totalSalary;


    Scanner scan = new Scanner(System.in);
    Employees(){
        super();
        System.out.print("Enter The Number Of Pay Monthly Employee: ");
        this.numOfPayMonthlyEmployee = scan.nextDouble();
        System.out.print("Enter Amount Of Pay Monthly Employee Salary: ");
        this.payMonthlyEmployeeSalary = scan.nextDouble();
        System.out.print("Enter The Number Of Pay Hourly Employee: ");
        this.numOfPayHourlyEmployee = scan.nextDouble();
        System.out.print("Enter The Number Of Hours Pay Hourly Employee Worked: ");
        this. numOfHoursPayHourlyEmployeeWork = scan.nextDouble();
        System.out.print("Enter Amount Of Pay Hourly Employee Salary: ");
        this.payHourlyEmployeeSalary = scan.nextDouble();
        setTotalPayMonthlyEmployeeSalary(this.numOfPayMonthlyEmployee, this.payMonthlyEmployeeSalary);
        setTotalPayHourlyEmployeeSalary(this.numOfPayHourlyEmployee, this.payHourlyEmployeeSalary, this.numOfHoursPayHourlyEmployeeWork);
        setTotalSalary(this.totalPayMonthlyEmployeeSalary, this.totalPayHourlyEmployeeSalary);
        getTotalPayMonthlyEmployeeSalary();
        getTotalPayHourlyEmployeeSalary();
        getTotalSalary();
        printDetails();
    }

    Employees(double payMonthlyEmployeeSalary){
        super();
        this.payMonthlyEmployeeSalary = payMonthlyEmployeeSalary;
        System.out.print("Enter The Number Of Pay Monthly Employee: ");
        this. numOfPayMonthlyEmployee = scan.nextDouble();
        System.out.print("Amount Of Pay Monthly Employee Salary: " + this.payMonthlyEmployeeSalary);
        System.out.print("\nEnter The Number Of Pay Hourly Employee: ");
        this.numOfPayHourlyEmployee = scan.nextDouble();
        System.out.print("Enter The Number Of Hours Pay Hourly Employee Worked: ");
        this.numOfHoursPayHourlyEmployeeWork = scan.nextDouble();
        System.out.print("Enter Amount Of Pay Hourly Employee Salary: ");
        this.payHourlyEmployeeSalary = scan.nextDouble();
        setTotalPayMonthlyEmployeeSalary(this.numOfPayMonthlyEmployee, this.payMonthlyEmployeeSalary);
        setTotalPayHourlyEmployeeSalary(this.numOfPayHourlyEmployee, this.payHourlyEmployeeSalary, this.numOfHoursPayHourlyEmployeeWork);
        setTotalSalary(this.totalPayMonthlyEmployeeSalary, this.totalPayHourlyEmployeeSalary);
        getTotalPayMonthlyEmployeeSalary();
        getTotalPayHourlyEmployeeSalary();
        getTotalSalary();
        printDetails();
    }

    Employees(double payMonthlyEmployeeSalary, double payHourlyEmployeeSalary){
        super();
        this.payMonthlyEmployeeSalary = payMonthlyEmployeeSalary;
        this.payHourlyEmployeeSalary = payHourlyEmployeeSalary;
        System.out.print("Enter The Number Of Pay Monthly Employee: ");
        this.numOfPayMonthlyEmployee = scan.nextDouble();
        System.out.print("Amount Of Pay Monthly Employee Salary: " +  this.payMonthlyEmployeeSalary);
        System.out.print("\nEnter The Number Of Pay Hourly Employee: ");
        this.numOfPayHourlyEmployee = scan.nextDouble();
        System.out.print("Enter The Number Of Hours Pay Hourly Employee Worked: ");
        this.numOfHoursPayHourlyEmployeeWork = scan.nextDouble();
        System.out.print("Enter Amount Of Pay Hourly Employee Salary: " +  this.payHourlyEmployeeSalary + "\n");
        setTotalPayMonthlyEmployeeSalary(this.numOfPayMonthlyEmployee, this.payMonthlyEmployeeSalary);
        setTotalPayHourlyEmployeeSalary(this.numOfPayHourlyEmployee, this.payHourlyEmployeeSalary, this.numOfHoursPayHourlyEmployeeWork);
        setTotalSalary(this.totalPayMonthlyEmployeeSalary, this.totalPayHourlyEmployeeSalary);
        getTotalPayMonthlyEmployeeSalary();
        getTotalPayHourlyEmployeeSalary();
        getTotalSalary();
        printDetails();
    }

    void setTotalPayMonthlyEmployeeSalary(double numOfPayMonthlyEmployee, double payMonthlyEmployeeSalary) {
        this.totalPayMonthlyEmployeeSalary = numOfPayMonthlyEmployee * payMonthlyEmployeeSalary;
    }

   void setTotalPayHourlyEmployeeSalary(double numOfPayHourlyEmployee, double payHourlyEmployeeSalary, double numOfHoursPayHourlyEmployeeWork) {
        this.totalPayHourlyEmployeeSalary = numOfPayHourlyEmployee * payHourlyEmployeeSalary * numOfHoursPayHourlyEmployeeWork;
    }

    void setTotalSalary(double totalPayMonthlyEmployeeSalary, double totalPayHourlyEmployeeSalary) {
        this.totalSalary = totalPayMonthlyEmployeeSalary + totalPayHourlyEmployeeSalary;
    }

    double getTotalPayMonthlyEmployeeSalary(){
        return totalPayMonthlyEmployeeSalary;
    }

    double getTotalPayHourlyEmployeeSalary(){
        return totalPayHourlyEmployeeSalary;
    }

    double getTotalSalary(){
        return totalSalary;
    }

    public void printDetails() {
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
