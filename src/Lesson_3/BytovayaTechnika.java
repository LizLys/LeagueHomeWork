package Lesson_3;

public class BytovayaTechnika extends Category {
     String[]  array = {"Холодильник", "Микроволновка", "Утюг"};

    public void setName(String name) {
        this.name = "Бытовая техника";
    }

    public void open() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
