import java.awt.*;
import java.util.Scanner;

public class Tuiles {
    public int nmbCouronne1;
    public Color type1;
    public int nmbCouronne2;
    public Color type2;
    private Scanner iterator;
    public int numeroDomino = iterator.nextInt();

    public Tuiles (int nmbCouronne1,Color type1, int nmbCouronne2, Color type2, int numeroDomino){
        this.nmbCouronne1 = nmbCouronne1;
        this.type1=type1;
        this.nmbCouronne2 = nmbCouronne2;
        this.type2 = type2;
        this.numeroDomino = numeroDomino;
    }

    @Override
    public String toString() {
        return "Domino{" +
                "couronne1= " + nmbCouronne1 +
                ", type1= " + type1 +
                ", couronne2= " + nmbCouronne2 +
                ", type2=" + type2 +
                ", numero Domino= " + numeroDomino +
                '}';
    }
}