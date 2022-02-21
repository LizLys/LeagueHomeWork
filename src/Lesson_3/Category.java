package Lesson_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public abstract class Category implements ActionListener {

    protected String iconDescription;
    protected String name;

    protected void setIconDescription(String iconDescription) {
        this.iconDescription = "Вы открыли ";
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(iconDescription + name);
        // прописать открытие мапы, содержащей каталог товаров данной категории
    }

    public abstract void open();
}
