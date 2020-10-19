package hanoi1;

import java.util.ArrayList;

// Pile Homogene de <T>, de capacite fixee a l'instantiation

//Salut salut
public class Pile<T> {
    final int capacite;
    protected ArrayList<T> contenu; 

    // suppose 'capa' strictement positif !
    public Pile(int capa) {
        capacite=capa;
        contenu=new ArrayList<T>();
    }

    // Doit lever l'exception si la pile est pleine
    public void empiler(T v) throws ErreurPile {
    	if(contenu.size()>=capacite) {
        	throw new ErreurPile();
        }else {
        	contenu.add(v);
        }
    }

    // Doit lever l'exception si la pile est vide
    public void depiler () throws ErreurPile {
    	if (estVide()) {
        	throw new ErreurPile();
        }else {
        	contenu.remove(contenu.size()-1);
        }
    }

    // renvoie le sommet de la pile mais ne le depile pas.
    // Doit lever l'exception si la pile est vide.
    public T sommet() throws ErreurPile {
        if (estVide()) {
        	throw new ErreurPile();
        }else {
        	return contenu.get(contenu.size()-1);
        }
    }

    public boolean estVide() {
        if (contenu.size()==0) {
        	return true;
        }else {
        	return false;
        }
    }

    public int hauteur () {
        return contenu.size();
    }

    public int capacite () {
        return capacite;
    }

    /* on imprime le sommet de pile au dessus ! */
    public void affiche () { 
        
		for(int i=contenu.size()-1;i>=0;i--) {
			System.out.println(contenu.get(i).toString());
		}
        	
    }
}
