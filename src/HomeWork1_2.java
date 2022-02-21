public class HomeWork1_2 {
    /**
     * Доработай блоки switch так, чтобы в консоль было выведено значение: 1 2 210  355
     */
    public static void main(String[] args) {
        String[] strs = new String[]{"one", "two", "three", "four"};
        for (String str : strs) {
            switch (str) {
                case "one":
                    System.out.print(1);
                case "two":
                    System.out.print(2);
                    break;
                case "three":
                    System.out.print(3);
                default:
                    System.out.print(5);
            }

            switch (str.indexOf("o")) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    System.out.print(10);
                default:
                    break;

            }
        }
    }
}
