public class Animal {

    public String animalName;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Animal(String animalName) {
        this.animalName = animalName;
        count++;
    }

    public void runMethod(int distance) {
        System.out.println(animalName + " ran " + distance + "m.");
    }

    public void swimMethod(int distance) {
        System.out.println(animalName + " swam " + distance + "m.");
    }
}
