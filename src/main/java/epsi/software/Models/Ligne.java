package epsi.software.Models;

public class Ligne extends ShapeAbs{
    private String symbol = "*" ;

    public Ligne(int number){
        super(number);
    }
    public Ligne(){
        this(5);
    }
    @Override
    public void display() {
        for (int i=0;i<getNumber();i++){
            System.out.print(symbol);
        }
    }
}
