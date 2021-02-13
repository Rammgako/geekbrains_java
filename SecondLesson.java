
public class SecondLesson {
    /*
 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов)
 заполнить его диагональные элементы единицами;
5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры:
checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры:
[ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
[ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами.
     */

    public static void main(String[] args) {
        fillArray();
        multiplyArr();
        matrixArr();
        minMaxArr();
        shiftArr(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 6);

    }

    //Helper method to print arrays.
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
        System.err.println();
    }


    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void revertArrValues() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else {
                arr[i]=1;
            }
        }
    }

    //2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    static void fillArray() {
        int[] arr = new int[8];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        printArr(arr);
    }

    //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    static void multiplyArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i =0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        printArr(arr);
    }

    //4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов)
    // заполнить его диагональные элементы единицами;

    static void matrixArr() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                if (j == i || j == arr.length-1-i) {
                    arr[i][j]=1;
                }
            }
        }
    }

    //5 Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    static void minMaxArr() {
        int[] arr = {21, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int max = arr[arr.length-1];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            else if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

//7 **** Написать метод, которому на вход подается одномерный массив и число n
//(может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
//Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

//Note: n > 0 --> left shift; n < 0 --> right shift
//Helper for shiftArr method. Revert subarray in an array.

    static void revertSubarr(int[] arr, int from, int to) {
        for (int i = 0; i <= (to - from) / 2; i++) {
            int t = arr[from + i];
            arr[from + i] = arr[to - i];
            arr[to - i] = t;
        }

    }

    static void shiftArr(int arr [], int n) {
        n = n % arr.length;
        if (n < 0) {
            n += arr.length;
        }
        revertSubarr(arr, 0, n - 1);
        revertSubarr(arr, n, arr.length - 1);
        revertSubarr(arr, 0, arr.length - 1);

        printArr(arr);
    }
}

