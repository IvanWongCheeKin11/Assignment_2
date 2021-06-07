package Ivan;

import java.util.Scanner;
public abstract class Finance implements Payment{
    private double totalRevenue, totalExpense, tax, earnBeforeTax, netIncome, investmentOnAsset, balanceOfNetIncome;

    Scanner sc = new Scanner(System.in);

    Financial(){
        super();
        System.out.print("Please Enter The Quarter Of The Year's Total Revenue: RM");
        this.totalRevenue = sc.nextDouble();
        System.out.print("Please Enter The Quarter Of The Year's Total Expense: RM");
        this.totalExpense = sc.nextDouble();
        System.out.print("Please Enter The Quarter Of The Year's Tax: RM");
        this.tax = sc.nextDouble();
        setEarnBeforeTax(this.totalRevenue, this.totalExpense);
        setNetIncome(this.earnBeforeTax, this.tax);
        getEarnBeforeTax();
        getNetIncome();
        printDetails(this.totalRevenue);
        getPayment();
    }

    Financial(double totalRevenue){
        super();
        this.totalRevenue = totalRevenue;
        System.out.print("The Quarter Of The Year's Total Revenue: RM" + this.totalRevenue + "\n");
        System.out.print("Please Enter The Quarter Of The Year's Total Expense: RM");
        this.totalExpense = sc.nextDouble();
        System.out.print("Please Enter The Quarter Of The Year's Tax: RM");
        this.tax = sc.nextDouble();
        setEarnBeforeTax(this.totalRevenue, this.totalExpense);
        setNetIncome(this.earnBeforeTax, this.tax);
        getEarnBeforeTax();
        getNetIncome();
        printDetails(this.totalRevenue);
        getPayment();
    }

    Financial(double totalRevenue, double totalExpense){
        super();
        this.totalRevenue = totalRevenue;
        this.totalExpense = totalExpense;
        System.out.print("The Quarter Of The Year's Total Revenue: RM" + this.totalRevenue + "\n");
        System.out.print("The Quarter Of The Year's Total Expense: RM" + this.totalExpense + "\n");
        System.out.print("Please Enter The Quarter Of The Year's Tax: RM");
        this.tax = sc.nextDouble();
        setEarnBeforeTax(this.totalRevenue, this.totalExpense);
        setNetIncome(this.earnBeforeTax, this.tax);
        getEarnBeforeTax();
        getNetIncome();
        printDetails(this.totalRevenue);
        getPayment();
    }

    void setEarnBeforeTax(double totalRevenue, double totalExpense) {
        this.earnBeforeTax = totalRevenue - totalExpense;
    }

    void setNetIncome(double earnBeforeTax, double tax) {
        this.earnBeforeTax = earnBeforeTax - tax;
    }

    double getEarnBeforeTax(){
        return this.earnBeforeTax;
    }

    double getNetIncome(){
        return this.netIncome;
    }

    public void printDetails(double totalRevenue) {
        System.out.println("\nFinancial Statement\n");
        System.out.printf("Total Expense: RM%.2f%n",totalRevenue);
        System.out.printf("Total Income: RM%.2f%n",this.totalExpense);
        System.out.printf("Earn Before Tax: RM%.2f%n",this.earnBeforeTax);
        System.out.printf("Taxes Expense: RM%.2f%n",this.tax);
        System.out.printf("Net Income: RM%.2f%n",this.netIncome);
    }

    public abstract void printDetails();

    public void getPayment() {
        System.out.print("Enter The Amount of Investment On Asset: RM");
        this.investmentOnAsset = sc.nextDouble();
        System.out.println("Operation Success");
        System.out.printf("Net Income: RM%.2f%n",this.netIncome);
        System.out.printf("Income kept for future investment: RM%.2f%n",this.investmentOnAsset);
        this.balanceOfNetIncome = this.netIncome - this.investmentOnAsset;
        System.out.printf("Balance Of Net Income: RM%.2f%n",this.balanceOfNetIncome);
        System.out.println();
    }
}
