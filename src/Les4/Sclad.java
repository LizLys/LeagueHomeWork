package Les4;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class Sclad {

    Scanner console = new Scanner(System.in);
    String object = console.nextLine();
    List<String> sklad = new ArrayList<>(30);


    //Добавление объектов
    protected void add(String object) {
        String add = "Add";
        this.object = object;
        if (object.equals(add)) {
            System.out.println("Пожалуйста, введите название товара, " +
                    "который вы хотите добавить на склад:");
            Scanner console1 = new Scanner(System.in);
            String newObject = console1.nextLine();
            sklad.add(newObject);
            //доп задание на проверку свободного места на складе.
            //Наш список ограничен 30-ю значениями, поэтому танцуем от этого
            if (sklad.lastIndexOf(newObject)==30) {
                System.out.println("Склад полностью заполнен. При добавлении новых товаров, склад расширится автоматически." +
                        "Если вы хотите добавить еще товары, введите Add, для удаления введите Delete.");
            }
        }
    }

    //удаление товаров со склада
    protected void delete(String object) {
        String delete = "Delete";
        this.object = object;
        if (object.equals(delete)) {
            System.out.println("Пожалуйста, введите название товара, " +
                    "который вы хотите удалить со склада:");
            Scanner console1 = new Scanner(System.in);
            String newObject = console1.nextLine();
            sklad.remove(newObject);
        }
    }

    //Проверка наличия товара на складе
    protected void concurrence(String object) {
        String concurrence = "Concurrence";
        this.object = object;
        if (object.equals(concurrence)) {
            System.out.println("Пожалуйста, введите название товара, " +
                    "наличие которого вы хотите проверить:");
            Scanner console1 = new Scanner(System.in);
            String newObject = console1.nextLine();
            if (sklad.indexOf(newObject) == -1) {
                System.out.println("Данный товар на складе не обнаружен.");
            } else {
                System.out.println("Ваш товар хранится на складе под индексом " + sklad.indexOf(newObject));
            }
        }
    }

    //Проверка количества товаров на складе. 1 товар - 1 индекс =>
    // количество объектов определяется последним индексом хранимого объекта
    protected void number(int number) {
        String numberForSearch = "Number";
        this.object = object;
        if (object.equals(numberForSearch)) {
            System.out.print("Количество товара на складе - ");
            if (sklad.indexOf(null) == 0) {
                System.out.println(0);
            } else {
                int a = sklad.indexOf(null) + 1;
                System.out.print(a);
            }
        }
    }

    //реализация учета количества каждого элемента на складе
    protected void uchet(String object) {
        String uchet = "Uchet";
        this.object = object;
        if (object.equals(uchet)) {
            System.out.println("Пожалуйста, введите название товара, " +
                    "количество которого вы хотите посмотреть на складе:");
            Scanner console1 = new Scanner(System.in);
            String newObject = console1.nextLine();
            sklad.indexOf(newObject);
            sklad.lastIndexOf(newObject);
            int x = 0;
            if (sklad.indexOf(newObject) == -1) {
                System.out.println("Данный товар отсутствует.");
            } else if (sklad.indexOf(newObject) == sklad.lastIndexOf(newObject)) {
                System.out.println("Данный товар находится в единственном экземпляре");
            } else {
                System.out.println("у нас точно есть два экзмпляра данного товара, но сейчас поищем еще:");
            for (int i=sklad.indexOf(newObject); i<sklad.lastIndexOf(newObject); i++)
            {
                if (object.equals(sklad.get(i+1))) {
                    x=x+1;
                    int y = x+2;
                    System.out.println("Секундочку! Мы нашли данный товар в " + y + "экземплярах. Сейчас посмотрим еще!");
                }
            }
                System.out.println("Вроде, это все.");
            }
        }
    }

}
