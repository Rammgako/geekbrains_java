public class Cat1 {

    private String name;
    private int hunger;

    public Cat1(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public int eat(Plate plate) {
        if (hunger > plate.getFoodAmount(hunger)){
            System.out.println("There is not enough food! Please add food into the plate.\n");
            plate.setFoodAmount(hunger);
        }
        else {
            int newfoodamount = plate.getFoodAmount(hunger) - hunger;
            plate.setFoodAmount(newfoodamount);
            System.out.println("Cat " + this.name + " ate " + hunger + " food and not hungry anymore.\n");
            System.out.println("There is " + newfoodamount + " of food left on this plate.\n");
            hunger = 0;
        }
        return hunger;
    }

    public void catState(){
        if (hunger > 0 ) {
            System.out.println("Cat " + this.name + " is hungry. Add food into the plate and feed the cat!\n");
        }else
            System.out.println("Cat " + this.name + " is full.\n");
    }

}
