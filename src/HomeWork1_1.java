public class HomeWork1_1 {
    public static void main(String[] args) {
        /**
         * Раскомментируй и исправь оба условия так, чтобы они возвращали true
         * Нельзя изменять типы и значения переменных, а так же оператор и метод сравнения.
         */
        //   public static void task_1() {
        int a = 1;
        String b = "1";
        if (a == Integer.parseInt(b)) {
            System.out.println("success");
        }

        if (b.equals(String.valueOf(a))) {
            System.out.println("success");
        }
    }
}

