package epsi.software.models;

public class Line extends ShapeAbs{
    private String symbol = "*" ;

    public Line(int number){
        super(number);
    }
    public Line(){
        this(5);
    }
    @Override
    public void display() {
        for (int i=0;i<getNumber();i++){
            System.out.print(symbol);
        }
    }
}
