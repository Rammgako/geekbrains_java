public class Personalities {
/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.

Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

*/

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Personalities(String fullName, String position, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void infoPerson (){
        System.out.println("Full name: " + fullName + "; Position: " + position + "; Contact information: " + email + phone + "" +
                "; Salary: " + salary + "EUR" + "; Age: " + age);
    }

    static Personalities [] userDb(){
        Personalities [] userArr = new Personalities[5];
        userArr[0] = new Personalities("Ivanov Ivan Ivanovich","SDE","ivanov@mail.ru","+1234567",5000,46);
        userArr[1] = new Personalities("Petrov Petr Petrovich","TPM","petrov@mail.ru","+1234568",6000,41);
        userArr[2] = new Personalities("Sidorov Sidor Sidorovich","PM","sidorov@mail.ru","+1234569",5500,32);
        userArr[3] = new Personalities("Borisov Boris Borisovich","HR","borisov@mail.ru","+1234578",4000,26);
        userArr[4] = new Personalities("Andreev Andrey Andreevich","TechSupport","andreev@mail.ru","+1234589",3000,24);
        return userArr;
    }

    static void getPersonInfo() {
        for (Personalities user: userDb()) {
            if (user.age > 40){
                user.infoPerson();
            }
        }
    }

    public static void main(String[] args) {
        getPersonInfo();
    }

}
