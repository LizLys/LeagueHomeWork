package Lesson_3;

import javax.swing.*;
import java.awt.*;

public class SearchPoisk extends JFrame {
    private JButton button = new JButton("Везде");
    private JButton button1 = new JButton("Поиск");
    private JTextField input = new JTextField("", 24); // текстовое поле
    private JLabel label = new JLabel("Озон"); //надпись для поля


    public SearchPoisk() {                      //создание формы, в которой будет реализовываться программа
        super("Озон");
        this.setBounds(300, 300, 1500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane(); //создание контейнера для формы, где все будет размещаться
        container.setLayout(new GridLayout(1, 4, 4, 4)); //ряды, колонки, отступы по вертикали и горизонтали
        container.add(label);
        container.add(input);
        button.addActionListener(new ButtonSearch());
        button.addActionListener(new ButtonCategory());
        container.add(button);
        container.add(button1);
    }
}
