package Les4;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class Sclad {

    List<String> sklad = new ArrayList<>(30);


    //Добавление объектов
    void add(String object) {
        sklad.add(object);
        System.out.println("Товар " + object + " успешно добавлен на склад под индексом " + sklad.lastIndexOf(object));
        //доп задание на проверку свободного места на складе.
        //Наш список ограничен 30-ю значениями, поэтому танцуем от этого
        if (sklad.lastIndexOf(object) == 30) {
            System.out.println("Склад полностью заполнен. При добавлении новых товаров, склад расширится автоматически." +
                    "Если вы хотите добавить еще товары, введите Add, для удаления введите Delete.");
        }
    }

    //удаление товаров со склада
    void delete(String object1) {
        if (sklad.indexOf(object1)>-1){
            sklad.remove(object1);
            System.out.println("Товар " + object1 + " успешно удален.");
        } else {
            System.out.println("Данного товара на складе не обнаружено.");
        }
        }


    //Проверка наличия товара на складе
    void concurrence(String object2) {
        if (sklad.indexOf(object2) == -1) {
            System.out.println("Данный товар на складе не обнаружен.");
        } else {
            System.out.println("Ваш товар хранится на складе под индексом " + sklad.indexOf(object2));
        }
    }


    //Проверка количества товаров на складе. 1 товар - 1 индекс =>
    // количество объектов определяется последним индексом хранимого объекта
    protected void number() {
            System.out.print("Количество товара на складе - ");
            if (sklad.indexOf(null) == 0) {
                System.out.println(0);
            } else {
                int a = sklad.indexOf(null) + 1;
                System.out.print(a);
            }
    }

    //реализация учета количества каждого элемента на складе
    protected void uchet(String object4) {

        sklad.indexOf(object4);
        sklad.lastIndexOf(object4);
        int x = 0;
        if (sklad.indexOf(object4) == -1) {
            System.out.println("Данный товар отсутствует.");
        } else if (sklad.indexOf(object4) == sklad.lastIndexOf(object4)) {
            System.out.println("Данный товар находится в единственном экземпляре");
        } else {
            System.out.println("у нас точно есть два экзмпляра данного товара, но сейчас поищем еще:");
            for (int i = sklad.indexOf(object4); i < sklad.lastIndexOf(object4); i++) {
                if (object4.equals(sklad.get(i + 1))) {
                    x = x + 1;
                    int y = x + 2;
                    System.out.println("Секундочку! Мы нашли данный товар в " + y + "экземплярах. Сейчас посмотрим еще!");
                }
            }
            System.out.println("Вроде, это все.");
        }
    }
}
