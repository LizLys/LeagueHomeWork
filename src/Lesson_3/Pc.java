package Lesson_3;

public class Pc extends Category{
    String[] array = {"Компьютер1", "Компьютер2", "ПК3"};
    public void setName(String name){
        this.name = "Компьютеры";
    }

    public void open() {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
