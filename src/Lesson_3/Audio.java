package Lesson_3;

import java.lang.reflect.Array;

public class Audio extends Category{
    String[] array = {"Наушники 1", "Наушники 2", "Наушники 3"};
    public void setName(String name){
        this.name = "Наушники и аудиотехника";
    }

    public void open() {

        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
