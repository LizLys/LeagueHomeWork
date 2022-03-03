package Les4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите одно из действий: Add - добавить товар на склад, " +
                "Delete - удалить товар со склада, Concurrence" +
                " - проверка наличия товара на складе, Number - количество товаров на складе, Uchet - количество " +
                "экземпляров данного товара, End - выход из программы.");

        Sclad sclad = new Sclad();
        boolean a = false;

        while (!a) {
            String userAction = console.nextLine();
            switch (userAction) {
                case "Add":
                    System.out.println("Пожалуйста, введите название товара, " +
                            "который вы хотите добавить на склад:");
                    String object = console.nextLine();
                    sclad.add(object);
                    break;
                case "Delete":
                    System.out.println("Пожалуйста, введите название товара, " +
                            "который вы хотите удалить со склада:");
                    String object1 = console.nextLine();
                    sclad.delete(object1);

                    break;
                case "Concurrence":
                    System.out.println("Пожалуйста, введите название товара, " +
                            "наличие которого вы хотите проверить:");
                    String object2 = console.nextLine();
                    sclad.concurrence(object2);
                    break;
                case "Number":
                    sclad.number();
                    break;
                case "Uchet":
                    System.out.println("Пожалуйста, введите название товара, " +
                            "количество которого вы хотите посмотреть на складе:");
                    String object4 = console.nextLine();
                    sclad.uchet(object4);
                    break;
                case "End":
                        a = true;
                        break;
                default:
                    System.out.println("Вы ввели несуществующую команду, попробуйте еще раз.");
            }
        }
    }
}

