package Lesson_3;

import javax.swing.*;
import java.awt.*;

public class ContainerElectronica extends JFrame {
    private JButton button1 = new JButton("Бытовая техника");
    private JButton button2 = new JButton("Смартфоны и смарт часы");
    private JButton button3 = new JButton("Телевизоры");
    private JButton button4 = new JButton("Ноутбуки и планшеты");
    private JButton button5 = new JButton("Компьютеры");
    private JButton button6 = new JButton("Наушники и аудиотехника");
    private JButton button7 = new JButton("Игры и консоли");

    public ContainerElectronica() {
        super("Электроника");
        this.setBounds(300, 300, 1500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1, 7, 100, 20));
        button1.addActionListener(new BytovayaTechnika());
        button2.addActionListener(new Smartphons());
        button3.addActionListener(new Tv());
        button4.addActionListener(new Laptop());
        button5.addActionListener(new Pc());
        button6.addActionListener(new Audio());
        button7.addActionListener(new PlayAndConsole());
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);
        container.add(button5);
        container.add(button6);
        container.add(button7);

    }

}
