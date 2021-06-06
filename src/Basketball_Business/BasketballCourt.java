package Basketball_Business;

import java.util.Scanner;

public class BasketballCourt {
    Scanner input = new Scanner(System.in);
    String Court1, Court2, Court3, Court4;
    int Court;

    public void BasketballCourtOptions(){
        System.out.println("Court: ");
        Court = input.nextInt();
        switch(Court) {
            case 1:
                System.out.println("Court 1 :" );
                Court1();
                break;

            case 2:
                System.out.println("Court 2 :" );
                Court2();
                break;

            case 3:
                System.out.println("Court 3 :" );
                Court3();
                break;

            case 4:
                System.out.println("Court 4 :" );
                Court4();
                break;
        }
    }
    public String Court1() {
        System.out.println("Court 1: \n"+"Opened");
        return Court1;
    }
    public String Court2() {
        System.out.println("Court 2: \n"+"Opened");
        return Court2;
    }
    public String Court3() {
        System.out.println("Court 3: \n"+"Opened");
        return Court3;
    }
    public String Court4() {
        System.out.println("Court 4: \n"+"Opened");
        return Court4;
    }
}