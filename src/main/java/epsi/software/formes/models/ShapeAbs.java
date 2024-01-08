package epsi.software.models;

/**
 * Cette classe abstraite permet de factoriser le code et la structure des objets qui en hérite
 * Une classe abstraite ne peut pas être instanciée
 */
public abstract class ShapeAbs {

    private Integer number;

    public ShapeAbs(Integer number){
        this.number = number;
    }
    // Déclaration d'une méthode abstraite qui permettra le polymorphisme
    // Implementation de la méthode doit être faite par la classe "fille" (classe "mère" ou superclasse)
    public abstract void display ();

    public Integer getNumber() {
        return number;
    }

}
