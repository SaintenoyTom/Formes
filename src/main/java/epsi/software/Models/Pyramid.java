package epsi.software.Models;

public class Pyramid extends ShapeAbs {

    private String symbol = "*";

    public Pyramid(int number){
        super(number);
    }
    public Pyramid(){
        this(5);
    }

    @Override
    public void display() {
        for (int i=0;i<getNumber();i++){
            for (int j=0;j<=i;j++) {
                System.out.print(symbol);
            }
            System.out.println("");
        }
    }
}