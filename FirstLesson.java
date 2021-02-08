import java.util.Scanner;

/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
2. Создать переменные всех пройденных типов данных и инициализировать их значения.
3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float.
4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
 в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
5. Написать метод, которому в качестве параметра передается целое число, метод должен
 напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
  считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть
 true, если число отрицательное, и вернуть false если положительное.
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод
 должен вывести в консоль сообщение «Привет, указанное_имя!».
8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в
консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class FirstLesson {
    //Please note, in methods below there are no checks for edge cases or checks for correct inputs form console.
    // These checks are outside of the tasks scope.

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main().

    public static void main(String[] args) {

        computeExpression();
        checkSum(1, 7); //will return false
        numSign(-123);
        numSignBool(-45); //will return true
        helloName("David");
        leapYear();

    }


    //2.Создать переменные всех пройденных типов данных и инициализировать их значения.

    byte byte_variable = 100;
    short short_variable = 1000;
    int int_variable = 10000;
    long long_variable = 100500L;
    float float_variable = 10.09f;
    double double_variable = 100.109;
    char char_variable = 'S';
    boolean bool_variable = true;
    String some_string = "something here";


    /*3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.*/

    public static float computeExpression() {
        float a, b, c, d, result;
        Scanner variable_input = new Scanner(System.in);
        System.out.println("Input values for variables a, b, c and d.");
        System.out.println("Input variable a =:");
        a = variable_input.nextFloat();

        System.out.println("Input variable b =:");
        b = variable_input.nextFloat();

        System.out.println("Input variable c =:");
        c = variable_input.nextFloat();

        System.out.println("Input variable d =:");
        d = variable_input.nextFloat();

        result = a * (b + (c / d));
        System.out.println(result);

        return result;

    }


    /*4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/

    public static boolean checkSum(int arg1, int arg2) {
        int sum;
        boolean result;
        sum = arg1 + arg2;
        if (10 <= sum  && sum <= 20)
            result = true;
        else
            result = false;
        System.out.println(result);
        return result;

    }


    /*5. Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
    считаем положительным числом.*/

    public static int numSign(int arg) {
        if (arg >= 0)
            System.out.printf("The entered number %d is positive", arg);
        else
            System.out.printf("The entered number %d is negative", arg);
        return arg;
    }


    /*6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть
    true, если число отрицательное, и вернуть false если положительное.*/

    public static boolean numSignBool(int arg) {
        boolean result;
        if (arg <= 0)
            result = true;
        else
            result = false;
        System.out.println(result);
        return result;
    }


    /*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод
    должен вывести в консоль сообщение «Привет, указанное_имя!».*/

    public static void helloName(String arg) {
         System.out.printf("Hello, %s", arg);
    }


    /*8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в
    консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/

    public static void leapYear() {
        System.out.println("Please enter the year.");
        int year = new Scanner(System.in).nextInt();
        if (year % 100 == 0 && (year % 400 != 0))
            System.out.printf("%d is not a Leap Year", year);
        else if ((year % 4 == 0) || (year % 400 == 0))
            System.out.printf("%d is a Leap Year", year);
        else System.out.printf("%d is not a Leap Year", year);
    }

}
