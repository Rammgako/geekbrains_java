/*1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/


public class Main {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik1", 35),
                new Cat("Barsik2", 25),
                new Cat("Barsik3", 18),
                new Cat("Barsik4", 28),
                new Cat("Barsik5", 13),
        };

        Plate plate = new Plate(150);

        for (Cat cat : cats
        ) {
            cat.eat(plate);
            cat.catState();
        }

    }
}
