package epsi.software.models;

public abstract class ShapeAbs {

    private Integer number;

    public ShapeAbs(Integer number){
        this.number = number;
    }

    public abstract void display ();

    public Integer getNumber() {
        return number;
    }

}
