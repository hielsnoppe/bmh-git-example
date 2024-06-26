//package meineJavaProjekte.demo2.src.main.java.com.bergemannhoehne.stafanPack;
package main.java.com.bergemannhoehne.stefan;        // Pfadanpassung
import main.java.com.bergemannhoehne.niels.Account; // Pfadanpassung

//import meineJavaProjekte.demo2.src.main.java.com.bergemannhoehne.niels.Account;
import java.util.Arrays;

//import java.util.List;
//public interface StefansKontoInterface<E> extends Account {
public interface StefansKontoInterface extends Account {

	static final int REVERSE_THRESHOLD = 42;
    /**
     * Returns the number of elements in this Account.  If this Account contains
     * more than <tt>Integer.MAX_VALUE</tt> elements, returns
     * <tt>Integer.MAX_VALUE</tt>.
     *
     * @return the number of elements in this Account
     */
    int size();

    /**
		 * um schlnell zu sehen ob das Konto Leer ist ;-)
     * Returns if this Account contains nothing
     *
     * @return true if this Account contains a value
     */
    boolean isEmpty();

    /**
     *
     * @param o als Objekt von Accounts
     * @return <tt>true</tt> if this Account contains the specified element
     * @throws ClassCastException wenn das Cast nicht geklappt hat
     * @throws NullPointerException falls das Objekt nicht vorhanden ist
     */
    boolean contains(Object o);

    /**
     * Returns an iterator over the elements in this Account in proper sequence.
     *
     * @return an iterator over the elements in this Account in proper sequence
     */
    // List<E> iterator(); // Zeile am begin auskommentiert

    /**
     * Returns an array containing all of the elements in this Account.
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this Account.  (In other words, this method must
     * allocate a new array even if this Account is backed by an array).
     * The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this Account in proper
     *         sequence
     * @see Arrays#asAccount(Object[])
     */
    Object[] toArray();

// --------- ab hier die pflicht Methoden ------------------		

	boolean Geld_einzahlen(Account o);
	boolean Geld_abheben(Account o);
	double	Kontostand_abfragen();
	boolean Geld_ueberweisen(Account o,double betrag);

}

// public interface Account {

// 	/*
// 	 * Schreibe ein Interface für ein Bankkonto und schicke dein Ergebnis an deinen "Nachbarn":
// 	 * 
// 	 * Folgende Funktionen soll das Bankkonto haben:
// 	 * - Geld einzahlen
// 	 * - Geld abheben
// 	 * - Kontostand abfragen
// 	 * - Geld auf ein anderes Konto überweisen
// 	 * 
// 	 * Wenn du ein Interface von deinem "Nachbarn" erhalten hast,
// 	 * schreibe eine Klasse, die das Interface implementiert.
// 	 */
// }
