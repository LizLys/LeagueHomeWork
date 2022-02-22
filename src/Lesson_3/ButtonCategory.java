package Lesson_3;

import java.awt.event.ActionListener;

public class ButtonCategory extends Category implements ActionListener {

    public void setName(String name) {
        super.name = "Везде";
    }

    public void open() {
        BytovayaTechnika bytovayaTechnika = new BytovayaTechnika();
        Audio audio = new Audio();
        Laptop laptop = new Laptop();
        Pc pc = new Pc();
        PlayAndConsole playAndConsole = new PlayAndConsole();
        Smartphons smartphons = new Smartphons();
        Tv tv = new Tv();

        for (int a=0; a<bytovayaTechnika.array.length; a++)
        {
        System.out.println(bytovayaTechnika.array[a]);
        }
        for (int a=0; a<audio.array.length; a++)
        {
            System.out.println(audio.array[a]);
        }
        for (int a=0; a<laptop.array.length; a++)
        {
            System.out.println(laptop.array[a]);
        }
        for (int a=0; a<pc.array.length; a++)
        {
            System.out.println(pc.array[a]);
        }
        for (int a=0; a<playAndConsole.array.length; a++)
        {
            System.out.println(playAndConsole.array[a]);
        }
        for (int a=0; a< smartphons.array.length; a++)
        {
            System.out.println(smartphons.array[a]);
        }
        for (int a=0; a<tv.array.length; a++)
        {
            System.out.println(tv.array[a]);
        }
    }

}
