package Basketball_Business;

import java.util.Scanner;
public class AdvertisementAndMarketing {
    public static void main(String[] args) {

    }

    Scanner input = new Scanner(System.in);
    String method1, method2;
    int Options;

    public void AdvertisementOptions(){
        System.out.println("Option: ");
        Options = input.nextInt();
        switch (Options) {
            case 1 -> {
                System.out.println("Method 1 :");
                method1();
            }
            case 2 -> {
                System.out.println("Method 2 :");
                method2();
            }
        }
    }
    public String method1() {
        System.out.println("Online advertising: \n"+"Facebook \n"+ "Twitter \n"+"Youtube");
        return method1;
    }
    public String method2() {
        System.out.println("Other: \n" + "Distribute handbill to nearby residential areas");
        return method2;
    }
}
