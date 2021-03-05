public class Dog extends Animal{

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Dog(String animalName) {
        super(animalName);
        count++;
    }


    @Override
    public void runMethod(int distance) {
        if (distance <= 500){
            super.runMethod(distance);
        }else {
            System.out.println(animalName + " cannot run that far, dogs can run only 500m distance");
        }
    }

    @Override
    public void swimMethod(int distance) {
        if (distance <= 10){
            super.swimMethod(distance);
        }else {
            System.out.println("Dogs can swim only 10m distance");
        }
    }
}
