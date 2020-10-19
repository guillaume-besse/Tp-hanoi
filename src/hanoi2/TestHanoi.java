package hanoi2;
import java.util.ArrayList;

public class TestHanoi {
    static public void main (String[] args) throws ErreurPile {
	try {
            // On travaille avec une ArrayList de Disque
	    ArrayList<Disque> ld = new ArrayList<Disque>();
	    for(int i = 6; i > 0; i--) {
		Disque d = new Disque(i);
		ld.add(d);
	    }
	    Hanoi<Disque> h = new Hanoi<Disque>(ld);
            System.out.println("\nApplication 1:");
	    System.out.println("Situation initiale avec h:");
	    h.affiche();
	    h.jouer();
	    System.out.println("Situation finale avec h:");
	    h.affiche();


            // Idem avec une ArrayList de MesEntiers
	    ArrayList<MesEntiers> ml = new ArrayList<MesEntiers>();
	    for(int i = 6; i > 0; i--) {
		MesEntiers m = new MesEntiers(i);
		ml.add(m);
	    }
	    Hanoi<MesEntiers> h2 = new Hanoi<MesEntiers>(ml);
            System.out.println("\nApplication 2:");
	    System.out.println("Situation initiale avec h2:");
	    h2.affiche();
	    h2.jouer();
	    System.out.println("Situation finale avec h2:");
	    h2.affiche();


	    /* On construit une ArrayList de Disque2 dont se sert
	     * pour une instande de Hanoi prevue pour des Disques.
	     */
	    ArrayList<Disque2> m2 = new ArrayList<Disque2>();
	    for(int i = 6; i > 0; i--) {
		Disque2 m = new Disque2(i);
		m2.add(m);
	    }
	    Hanoi<Disque> h3 = new Hanoi<Disque>(m2);
            System.out.println("\nApplication 3:");
	    System.out.println("Situation initiale avec h3:");
	    h3.affiche();
	    h3.jouer();
	    System.out.println("Situation finale avec h3:");
	    h3.affiche();


	    // On cree une instance de Hanoi<Disque> mais on empile un Disque2
	    // au milieu des Disques pour verifier que toutes les comparaisons
	    // se passent bien (verifier les traces pour voir qui est appele).
	    // La version de compareTo dans Disque2 doit etre semantiquement
	    // compatible avec celle dans Disque donc ca ne doit pas affecter
	    // le resultat obtenu.
	    Disque2 d2 = new Disque2(7);
	    ld.add(0, d2);
	    Hanoi<Disque> h4 = new Hanoi<Disque>(ld);
            System.out.println("\nApplication 4:");
	    System.out.println("Situation initiale avec h4:");
	    h4.affiche();
	    h4.jouer();
	    System.out.println("Situation finale avec h4:");
	    h4.affiche();


	    ArrayList<Disque2> m3 = new ArrayList<Disque2>();
	    for(int i = 6; i > 0; i--) {
		Disque2 d = new Disque2(i);
		m3.add(d);
	    }
	    Hanoi<Disque2> h5 = new Hanoi<Disque2>(m3);
            System.out.println("\nApplication 5:");
	    System.out.println("Situation initiale avec h5:");
	    h5.affiche();
	    h5.jouer();
	    System.out.println("Situation finale avec h5:");
	    h5.affiche();

	    ArrayList<MesEntiers3> m4 = new ArrayList<MesEntiers3>();
	    // Ne doit pas compiler, MesEntiers3 n'implementant pas la bonne
	    // interface
	    //	    Hanoi<MesEntiers3> h6 =  new Hanoi<MesEntiers3>(m4);

	} catch (ClassCastException e) {
	    System.out.println("ErreurClassCast: " + e.getMessage());
	}
    }
}
