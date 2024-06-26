//package meineJavaProjekte.demo2.src.main.java.com.bergemannhoehne.stafanPack;
package main.java.com.bergemannhoehne.niels; // original Pfad von Niels

// import meineJavaProjekte.demo2.src.main.java.com.bergemannhoehne.niels.Account; // dieses mit implements
// andere brauchen: import meineJavaProjekte.demo2.src.main.java.com.bergemannhoehne.stafanPack.*;
import main.java.com.bergemannhoehne.niels.*; // alles
import main.java.com.bergemannhoehne.stafanPack.StefansKontoInterface;

//import meineJavaProjekte.demo2.src.main.java.com.bergemannhoehne.niels.Account;
import java.util.Arrays;
import java.util.List;

public class AccountStefan implements StefansKontoInterface{
	boolean Geld_abheben(Account a){
		return true;
	}
	boolean Geld_einzahlen(){
		return true;
	}
	boolean Geld_ueberweisen(Account a, double betrag){
		return true;
	}


	boolean Geld_einzahlen(Account o);
	boolean Geld_abheben(Account o);
	double	Kontostand_abfragen();
	boolean Geld_ueberweisen(Account o,double betrag);


}
