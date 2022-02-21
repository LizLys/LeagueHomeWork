package Lesson_3;

//данный интерфейс будет содержать в себе реализацию кнопки в сервисе, ведущую к следующему уровню в каталоге - к новому списку.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public interface Element {
    //  String getName = null;
    // JButton button = new JButton(String getName);



    //button.addActionListener(new ButtonAction());

    void click();
}
