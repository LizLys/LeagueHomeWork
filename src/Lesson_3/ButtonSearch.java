package Lesson_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ButtonSearch extends Category implements ActionListener {

    public void setName(String name) {
        super.name = "Поиск";
    }

    public void actionPerformed(ActionEvent e) {
        BytovayaTechnika bytovayaTechnika = new BytovayaTechnika();
        Audio audio = new Audio();
        Laptop laptop = new Laptop();
        Pc pc = new Pc();
        PlayAndConsole playAndConsole = new PlayAndConsole();
        Smartphons smartphons = new Smartphons();
        Tv tv = new Tv();

        Scanner input = new Scanner(System.in);
        String zapros = input.nextLine();
        for (int a = 0; a < bytovayaTechnika.array.length; a++) {
            if (zapros.equals(bytovayaTechnika.array[a])) {
                System.out.println(bytovayaTechnika.array[a]);
                break;
            } else if (zapros.equals(audio.array[a])) {
                for (int b = 0; b < audio.array.length; b++) {
                    if (zapros.equals(audio.array[b])) {
                        System.out.println(audio.array[b]);
                        break;
                    } else if (zapros.equals(laptop.array[a])) {
                        for (int c = 0; c < laptop.array.length; c++) {
                            if (zapros.equals(laptop.array[c])) {
                                System.out.println(laptop.array[c]);
                                break;
                            } else if (zapros.equals(pc.array[a])) {
                                for (int d = 0; d < pc.array.length; d++) {
                                    if (zapros.equals(pc.array[d])) {
                                        System.out.println(pc.array[d]);
                                        break;
                                    } else if (zapros.equals(playAndConsole.array[a])) {
                                        for (int f = 0; f < playAndConsole.array.length; f++) {
                                            if (zapros.equals(playAndConsole.array[f])) {
                                                System.out.println(playAndConsole.array[f]);
                                                break;
                                            } else if (zapros.equals(smartphons.array[a])) {
                                                for (int g = 0; g < smartphons.array.length; g++) {
                                                    if (zapros.equals(smartphons.array[g])) {
                                                        System.out.println(smartphons.array[g]);
                                                        break;
                                                    } else if (zapros.equals(tv.array[a])) {
                                                        for (int h = 0; h < tv.array.length; h++) {
                                                            if (zapros.equals(tv.array[h])) {
                                                                System.out.println(tv.array[h]);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("Извините, товар не найден :(");
            }
        }
    }

    public void open() {
        System.out.println("А точно ли в задании надо было сделать именно это?");
    }
}