package Lesson_3;

public class PlayAndConsole extends Category{
    String[] array = {"Игра1", "Игра2", "Игра3"};
    public void setName(String name){
        this.name = "Игры и консоли";
    }

    public void open() {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
