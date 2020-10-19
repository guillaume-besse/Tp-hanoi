package hanoi2;
import hanoi1.Disque;
import hanoi1.Pile;

public class Tour<T> extends Pile<? extends Comparable> { // Tres approximatif

    public Tour(int capa) {
	super(capa);
    }

    public void empiler(T v) throws ErreurPile {
	if (estVide() || sommet().compareTo(v) >= 0)
	    super.empiler(v);
	else throw new ErreurTour("Disque inadapte");
    }
}
