package epsi.software.formes;

import epsi.software.formes.models.Line;
import epsi.software.formes.models.Square;
import epsi.software.formes.models.Triangle;

public class DisplayConsole {
    public static void main(String[] args) {
        var delimiter = "=".repeat(25);

        System.out.println(delimiter+"LIGNE"+delimiter);
        Line line5a = new Line();
        Line line5b = new Line();
        Line line5c = new Line();
        line5a.display();
        System.out.println("");
        line5b.display();
        System.out.println("");
        line5c.display();
        System.out.println("");
        Line line8a = new Line(8);
        Line line8b = new Line(8);
        line8a.display();
        System.out.println("");
        line8b.display();
        System.out.println("");

        System.out.println(delimiter+"CARRE"+delimiter);
        Square square7a = new Square(7);
        Square square7b = new Square(7);
        Square square7c = new Square(7);
        Square square7d = new Square(7);
        square7a.display();
        System.out.println("");
        square7b.display();
        System.out.println("");
        square7c.display();
        System.out.println("");
        square7d.display();
        System.out.println("");

        System.out.println(delimiter+"TRIANGLE"+delimiter);
        Triangle triangle5a = new Triangle();
        Triangle triangle5b = new Triangle();
        Triangle triangle5c = new Triangle();
        triangle5a.display();
        triangle5b.display();
        triangle5c.display();
        Triangle triangle6a = new Triangle(6);
        Triangle triangle6b = new Triangle(6);
        triangle6a.display();
        triangle6b.display();
    }
}
