public class HomeWork1_3 {
    /**
     * Раскомментируй код, и укажи числа для сравнения с переменной i,
     * а так же расставь логические операторы &, &&, | и || таким образом,
     * чтобы в консоли было выведено значение: 102428338.
     * Запрещается что-либо изменять или менять местами.
     */
    public static void main (String[] args) {
        for (int i = 0; i < 4; i++) {
            if (compare(i, 1) & decreaseAndCompare(i, 0) & incrementAndCompare(i, 2)) {
                System.out.print("4");
            } else if (decreaseAndCompare(3, i) || incrementAndCompare(2, i) | compare(3, i)) {
                System.out.print("8");
           }
        }

    }

    private static boolean compare(int a, int b) {
        boolean result = a == b;
        if (result) System.out.print(a);
        return result;
    }

    private static boolean decreaseAndCompare(int a, int b) {
        boolean result = --a == b;
        if (result) System.out.print(b);
        return result;
    }

    private static boolean incrementAndCompare(int a, int b) {
        boolean result = ++a == b;
        if (result) System.out.print(a);
        return result;
    }
}

