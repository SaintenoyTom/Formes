package epsi.software;

import javax.sound.sampled.Line;
import java.util.Scanner;

import epsi.software.Models.Ligne;
import epsi.software.Models.Pyramid;
import epsi.software.Models.Square;

public class Formes {
    public static void main(String[] args) {

        System.out.println("LIGNE");
        Ligne line5a = new Ligne();
        Ligne line5b = new Ligne();
        Ligne line5c = new Ligne();
        line5a.display();
        System.out.println();
        line5b.display();
        System.out.println();
        line5c.display();
        System.out.println();
        Ligne line8a = new Ligne(8);
        Ligne line8b = new Ligne(8);
        line8a.display();
        System.out.println();
        line8b.display();
        System.out.println();

        System.out.println("CARRE");
        Square square7a = new Square(7);
        Square square7b = new Square(7);
        Square square7c = new Square(7);
        Square square7d = new Square(7);
        square7a.display();
        System.out.println();
        square7b.display();
        System.out.println();
        square7c.display();
        System.out.println();
        square7d.display();
        System.out.println();

        System.out.println("TRIANGLE");
        Pyramid triangle5a = new Pyramid();
        Pyramid triangle5b = new Pyramid();
        Pyramid triangle5c = new Pyramid();
        triangle5a.display();
        triangle5b.display();
        triangle5c.display();
        Pyramid triangle6a = new Pyramid(6);
        Pyramid triangle6b = new Pyramid(6);
        triangle6a.display();
        triangle6b.display();
    }
}
