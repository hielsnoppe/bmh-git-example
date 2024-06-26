package main.java.com.bergemannhoehne.niels;

import main.java.com.bergemannhoehne.stefan.StefansKontoInterface;

public class StefanAccount implements StefansKontoInterface {

    private double kontostand;

    public StefanAccount () {
        this.kontostand = 0;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        return this.kontostand <= 0;
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean Geld_einzahlen(Account o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Geld_einzahlen'");
    }

    @Override
    public boolean Geld_abheben(Account o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Geld_abheben'");
    }

    @Override
    public double Kontostand_abfragen() {
        return this.kontostand;
    }

    @Override
    public boolean Geld_ueberweisen(Account o, double betrag) {
        this.kontostand = this.kontostand - betrag;
        // Leider haben wir keine Möglichkeit,
        // das Geld dem Empfänger gutzuschreiben.
        // Die Bank gewinnt immer. ;-)

        return false;
    }
    
}
