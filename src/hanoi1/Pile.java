// Pile Homogene de <T>, de capacite fixee a l'instantiation

public class Pile<T> {
    final int capacite;

    // suppose 'capa' strictement positif !
    public Pile(int capa) {
        throw new UnsupportedOperationException();
    }

    // Doit lever l'exception si la pile est pleine
    public void empiler(T v) throws ErreurPile {
        throw new UnsupportedOperationException();
    }

    // Doit lever l'exception si la pile est vide
    public void depiler () throws ErreurPile {
        throw new UnsupportedOperationException();
    }

    // renvoie le sommet de la pile mais ne le depile pas.
    // Doit lever l'exception si la pile est vide.
    public T sommet() throws ErreurPile {
        throw new UnsupportedOperationException();
    }

    public boolean estVide() {
        throw new UnsupportedOperationException();
    }

    public int hauteur () {
        throw new UnsupportedOperationException();
    }

    public int capacite () {
        throw new UnsupportedOperationException();
    }

    /* on imprime le sommet de pile au dessus ! */
    public void affiche () { 
        throw new UnsupportedOperationException();
    }
}
