package Lesson_3;

import javax.swing.*;

public class Smartphons extends Category{
    String[] array = {"Смартфон1", "Смартфон2", "Часы"};
    public void setName(String name){
        this.name = "Смартфоны и смарт-часы";
    }


    public void open() {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
