public class Plate {


    private int foodAmount; //initial plate state

    private int addFood(int addfood){
        this.foodAmount += addfood;
        return foodAmount;
    }

    public Plate(int foodAmount) {
        this.foodAmount = foodAmount;
    }


    public int getFoodAmount(int hunger) {
        if (foodAmount < 0){
            addFood(hunger);
            System.out.println("Food has bee added to the plate. Food amount in this plate is now: " + foodAmount + "\n");
        }
        return foodAmount;
    }

    public int setFoodAmount(int newfoodAmount) {
        this.foodAmount = newfoodAmount;
        return foodAmount;
    }





}
