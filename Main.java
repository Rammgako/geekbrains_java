//
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
//        плавание: кот не умеет плавать, собака 10 м.).
//        4. * Добавить подсчет созданных котов, собак и животных.

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Murzik");
        cat.runMethod(500);
        cat.swimMethod(100);

        Cat cat1 = new Cat("Barsik");
        cat1.runMethod(200);
        cat1.swimMethod(10);

        Dog dog = new Dog("Bobik");
        dog.runMethod(500);
        dog.swimMethod(10);

        Dog dog1 = new Dog("Sharik");
        dog1.runMethod(1000);
        dog1.swimMethod(100);

        animalsCount();
    }

    public static void animalsCount() {
        System.out.println("Number of all animals: " + Animal.getCount());
        System.out.println("Number of all cats: " + Cat.getCount());
        System.out.println("Number of all dogs: " + Dog.getCount());


    }

}
