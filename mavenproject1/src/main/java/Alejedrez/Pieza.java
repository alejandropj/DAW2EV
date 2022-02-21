package Alejedrez;
/**
 *
 * @author ale
 */
public abstract class Pieza {
    protected char color;
    protected char nombre;
    
    //sobraría
    public Pieza(char color){
        this.color=color;
    }
    public Pieza(char color,char nombre){
        this.color=color;
        this.nombre=nombre;
    }
    
    public char getColor(){
        return color;
    }
    
    public abstract boolean validoMovimiento();
    public abstract boolean pintarPieza();
    @Override
    public String toString(){
        return nombre+""+color;
    }
}
