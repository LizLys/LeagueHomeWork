package Lesson_3;

public class Tv extends Category{
    String[] array = {"Телевизор1", "Телевизор2", "Телевизор3"};
    public void setName(String name){
        this.name = "Телевизоры";
    }

    public void open() {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
