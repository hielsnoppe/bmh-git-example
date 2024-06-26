package main.java.com.bergemannhoehne.stefan;

/*package meineJavaProjekte.demo2.src.main.java.com.bergemannhoehne.stafanPack;

import meineJavaProjekte.demo2.src.main.java.com.bergemannhoehne.niels.Account;
import meineJavaProjekte.demo2.src.main.java.com.bergemannhoehne.niels.MyAccount;
*/

import main.java.com.bergemannhoehne.niels.StefanAccount;

public class StefanAccountTestMain {
    
    /**
     * Schreibe eine Test-Klasse, in der du die Klasse deines "Nachbarn",
     * die dein Interface implementiert, verwendest und testest.
     */
	public static void main(String[] args) {
		System.out.println("meineJavaProjekte.demo2.src.main.java.com.bergemannhoehne.stafanPack von Klasse stefanAccountTestMain" + args.length);

		StefansKontoInterface stefa = new StefanAccount(); // Klasse ist noch leer

		// Account stef = new AccountStefan(); // mit erweitereten Interface StefansKotoInterface
		// Account niels = new MyAccount();

		StefanAccount ste = new StefanAccount();

		// // weiteren Code um die AccountObjekte zu benutzen
		
		System.out.println(stefa.Kontostand_abfragen());
		
		stefa.Geld_ueberweisen(ste, 500);

		System.out.println(stefa.Kontostand_abfragen());
		System.out.println(ste.Kontostand_abfragen());
	}

}
