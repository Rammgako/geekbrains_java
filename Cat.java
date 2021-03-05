public class Cat extends Animal{
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Cat(String animalName) {
        super(animalName);
        count++;
    }


    @Override
    public void runMethod(int distance) {
        if (distance <= 200){
            super.runMethod(distance);
        }else {
            System.out.println(animalName + " cannot run that far, cats can only run 200m distance");
        }
    }

    @Override
    public void swimMethod(int distance) {
        System.out.println("Cats can not swim");
    }

}
