public class Main {
    public static void main(String[] args) {
        task4();
        task5();
    }

    public static void task4() {
        /* Это задание очень любят давать на собеседованиях в разных вариациях, потому мы предлагаем его вам, чтобы вы оценили свои силы.
Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка, вывести ping,
а если число делится на 5 без остатка, вывести pong.
Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
Допускается наличие пустых строк в выводе. */

        System.out.println("Задача 4");
        for (int i = 1; i <= 30; ++i) {
            if ((i % 3 == 0) && (i % 5 == 0)) System.out.println(i + ": ping pong");
            else if (i % 3 == 0) System.out.println(i + ": ping");
            else if (i % 5 == 0) System.out.println(i + ": pong");
        }
        System.out.println();
    }

    public static void task5() {
         /*Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
– Каждое следующее число равняется сумме двух предыдущих.
Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
Должно получиться следующее:
0 1 1 2 3 5 8 13 21 34
- Справка
    Числа Фибоначчи – элементы числовой последовательности
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … ,
    в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел.
    Названы в честь средневекового математика Леонардо Пизанского.*/

        System.out.println("Задача 5");
        int i = 0;
        int j = 1;
        int l;
        System.out.print(i + " " + j + " ");
        for (int k = 1; k <= 8; k++) {
            l = i + j;
            System.out.print(l + " ");
            i = j;
            j = l;
        }
        System.out.println();
    }
}