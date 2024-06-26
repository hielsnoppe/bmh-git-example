/**
 * Das Interface BankAccount definiert die grundlegenden Operationen,
 * die für ein Bankkonto erforderlich sind.
 */
public interface BankAccount {
    
    /**
     * Zahlt einen Betrag auf das Konto ein.
     *
     * @param amount der Betrag, der eingezahlt werden soll
     * @throws IllegalArgumentException wenn der Betrag negativ ist
     */
    void deposit(double amount);

    /**
     * Hebt einen Betrag vom Konto ab.
     *
     * @param amount der Betrag, der abgehoben werden soll
     * @throws IllegalArgumentException wenn der Betrag negativ ist
     * @throws InsufficientFundsException wenn nicht genügend Guthaben vorhanden ist
     */
    void withdraw(double amount) throws InsufficientFundsException;

    /**
     * Gibt den aktuellen Kontostand zurück.
     *
     * @return der aktuelle Kontostand
     */
    double getBalance();

    /**
     * Überweist einen Betrag auf ein anderes Konto.
     *
     * @param amount der Betrag, der überwiesen werden soll
     * @param targetAccount das Zielkonto, auf das überwiesen werden soll
     * @throws IllegalArgumentException wenn der Betrag negativ ist
     * @throws InsufficientFundsException wenn nicht genügend Guthaben vorhanden ist
     */
    void transfer(double amount, BankAccount targetAccount) throws InsufficientFundsException;
}

/**
 * Diese Ausnahme wird geworfen, wenn nicht genügend Guthaben für eine Operation vorhanden ist.
 */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}