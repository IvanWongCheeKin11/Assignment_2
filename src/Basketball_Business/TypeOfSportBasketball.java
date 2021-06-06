package Basketball_Business;

public class TypeOfSportBasketball {
    protected String [] TypeOfSportBasketball = {"Indoor Basketball", "Outdoor Basketball"};

    public void TypeOfSportBasketball() {
        System.out.println("Type Of Sport Basketball:");
        for(int i = 0; i < TypeOfSportBasketball.length; i++) {
            System.out.println(" " + TypeOfSportBasketball[i]);
        }
    }
}
