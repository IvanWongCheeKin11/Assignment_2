package Basketball_Business;

import java.util.Scanner;
public class Financial {
    private double totalRevenue, totalExpense, tax, earnBeforeTax, netIncome;

    Scanner sc = new Scanner(System.in);

    Financial(){
        System.out.print("Please Enter The Quarter Of The Year's Total Revenue: RM");
        totalRevenue = sc.nextDouble();
        System.out.print("Please Enter The Quarter Of The Year's Total Expense: RM");
        totalExpense = sc.nextDouble();
        System.out.print("Please Enter The Quarter Of The Year's Tax: RM");
        tax = sc.nextDouble();
        earnBeforeTax = calculateEarnBeforeTax(totalRevenue, totalExpense);
        netIncome = calculateNetIncome(earnBeforeTax, tax);
        printDetails(totalRevenue, totalExpense, tax, earnBeforeTax, netIncome);
    }

    Financial(double totalRevenue){
        System.out.print("The Quarter Of The Year's Total Revenue: RM" + totalRevenue + "\n");
        System.out.print("Please Enter The Quarter Of The Year's Total Expense: RM");
        totalExpense = sc.nextDouble();
        System.out.print("Please Enter The Quarter Of The Year's Tax: RM");
        tax = sc.nextDouble();
        earnBeforeTax = calculateEarnBeforeTax(totalRevenue, totalExpense);
        netIncome = calculateNetIncome(earnBeforeTax, tax);
        printDetails(totalRevenue, totalExpense, tax, earnBeforeTax, netIncome);
    }

    Financial(double totalRevenue, double totalExpense){
        System.out.print("The Quarter Of The Year's Total Revenue: RM" + totalRevenue + "\n");
        System.out.print("The Quarter Of The Year's Total Expense: RM" + totalExpense + "\n");
        System.out.print("Please Enter The Quarter Of The Year's Tax: RM");
        tax = sc.nextDouble();
        earnBeforeTax = calculateEarnBeforeTax(totalRevenue, totalExpense);
        netIncome = calculateNetIncome(earnBeforeTax, tax);
        printDetails(totalRevenue, totalExpense, tax, earnBeforeTax, netIncome);
    }

    double calculateEarnBeforeTax(double totalRevenue, double totalExpense) {
        return totalRevenue - totalExpense;
    }

    double calculateNetIncome(double earnBeforeTax, double tax) {
        return earnBeforeTax - tax;
    }

    void printDetails(double totalRevenue, double totalExpense, double tax, double earnBeforeTax, double netIncome) {
        System.out.println("\nFinancial Statement\n");
        System.out.printf("Total Expense: RM%.2f%n",totalRevenue);
        System.out.printf("Total Income: RM%.2f%n",totalExpense);
        System.out.printf("Earn Before Tax: RM%.2f%n",earnBeforeTax);
        System.out.printf("Taxes Expense: RM%.2f%n",tax);
        System.out.printf("Net Income: RM%.2f%n",netIncome);
    }
}
