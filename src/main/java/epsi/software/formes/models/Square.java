package epsi.software.models;

public class Square extends ShapeAbs{

    private String symbol = "*";

    public Square(int number){
        super(number);
    }
    public Square(){
        this(5);
    }

    @Override
    public void display() {
        for (int i = 0; i < getNumber(); i++) {
            for (int j = 0; j < getNumber(); j++) {
                System.out.print(symbol);
            }
            System.out.println("");
        }
    }
}
