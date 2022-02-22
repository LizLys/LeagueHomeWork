package Lesson_3;

public class Laptop extends Category {
    String[] array = {"Ноутбук1", "Ноутбук2", "Ноутбук3"};
    public void setName(String name) {
        super.name = "Ноутбуки и планшеты";
    }

    public void open() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
