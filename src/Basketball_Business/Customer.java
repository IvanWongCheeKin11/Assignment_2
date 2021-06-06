package Basketball_Business;

import java.util.Scanner;
public class Customer {
    Scanner input = new Scanner(System.in);
    protected String nonMemberName, nonmemberEmailAddress, memberName, memberGender, memberEmailAddress,  TypeOfSportBasketball, payFee, Customer;
    protected int memberAge;
    protected long nonMemberPhoneNumber, memberPhoneNumber, memberIcNo;

    public void Customer() {
        System.out.print("'Non-Member' or 'Member'?:\t");
        this.Customer = input.next();
        if (Customer == "Non-Member") {
            System.out.println("<------REGISTRATION FOR NON-MEMBER------>");
            System.out.print("Enter Your Name: ");
            this.nonMemberName = input.next();
            System.out.print("Enter Your Phone No.: ");
            this.nonMemberPhoneNumber = input.nextLong();
            System.out.print("Enter Your Email Address: ");
            this.nonmemberEmailAddress = input.next();
            System.out.println("Type Of Sport Basketball('Indoor' / 'Outdoor'):");
            this.TypeOfSportBasketball = input.next();
            printDetail1();
            printRegistration1();

        }
        else if (Customer == "Member") {
            System.out.println("<------REGISTRATION FOR MEMBER------>");
            System.out.print("Enter Your Name: ");
            this.memberName = input.next();
            System.out.print("Enter Your Age: ");
            this.memberAge = input.nextInt();
            System.out.print("Enter Your Gender: ");
            this.memberGender = input.next();
            System.out.print("Enter Your Email Address: ");
            this.memberEmailAddress = input.next();
            System.out.print("Enter Your Phone No.: ");
            this.memberPhoneNumber = input.nextLong();
            System.out.print("Enter Your IC No.: ");
            this.memberIcNo = input.nextLong();
            System.out.println("Type Of Sport Basketball('Indoor' / 'Outdoor'):");
            this.TypeOfSportBasketball = input.next();
            printDetail2();
            printRegistration2();
        }
    }


    public void printDetail1() {
        System.out.println("Name:\t" + this.nonMemberName);
        System.out.println("Phone No.:\t" + this.nonMemberPhoneNumber);
        System.out.println("Email Address:\t" + this.nonmemberEmailAddress);
        System.out.println("TypeOfSportBasketball\t:" + this.TypeOfSportBasketball);

    }
    public void printRegistration1() {
        System.out.println("Registration Fee: \t RM180.00 (2hrs) and enter 'Confirm' to register");
        String payFee = input.next();
        if (payFee == "Confirm") {
            System.out.println("Registered Successfully!");

        }else {
            System.out.println("Registration Failed");
        }
    }

    public void printDetail2() {
        System.out.println("Name:\t" + this.memberName);
        System.out.print("Age:\t" + this.memberAge);
        System.out.print("Gender:\t" + this.memberGender);
        System.out.print("Email Address:\t" + this.memberEmailAddress);
        System.out.println("Phone No.:\t" + this.nonMemberPhoneNumber);
        System.out.println("IC No.:\t" + this.memberIcNo);
        System.out.println("TypeOfSportBasketball\t:" + this.TypeOfSportBasketball);

    }
    public void printRegistration2() {
        System.out.println("Registration Fee: \t RM150.00 (2hrs) and enter 'Confirm' to register");
        String payFee = input.next();
        if (payFee == "Confirm") {
            System.out.println("Registered Successfully!");

        }else {
            System.out.println("Registration Failed");
        }
    }
}
