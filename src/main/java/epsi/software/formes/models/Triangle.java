package epsi.software.models;

public class Triangle extends ShapeAbs {

    private String symbol = "*";

    public Triangle(int number){
        super(number);
    }
    public Triangle(){
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
