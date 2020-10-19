package hanoi1;
public class Tour extends Pile<Disque> {

    public Tour(int capa) {
	super(capa);// test
    }

    // Propage les exceptions levees par Pile si elles surviennent
    // Leve l'exception ErreurTour si on essaye d'empiler un Disque
    // sur un disque strictement plus petit.
    public void empiler(Disque v) throws ErreurPile {
        if (estVide()) {
            empiler(v);
        } else if (sommet().val > v.val) {
                    empiler(v);
        } else { throw new ErreurTour();}
    }
}
