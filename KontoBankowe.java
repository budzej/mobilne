/**
 * Klasa konta bankowego
 * Realizuje wpłaty i wypłaty
 * @author Błażej Rudnik
 * @version 1.0
 */
public class KontoBankowe {
    private String numerKonta;
    private double saldo;

/**
 * Konstruktor klasy KontoBankowe
 * @param numerKonta numer konta w zapisie EU
 * @param saldoPoczatkowe wartość stanu konta
 * @throws IllegalArgumentException przechwycenie błędu błędnej danej
 */

    public KontoBankowe(String numerKonta,double saldoPoczatkowe){
        if(numerKonta == null || numerKonta.isEmpty()){
            throw new IllegalArgumentException("Błędny numer konta... ");
        }
        this.numerKonta = numerKonta;
        this.saldo = saldoPoczatkowe;
    }

/**
 * Metoda zwracająca stan konta
 * @return zwaraca aktualny stan konta
 */

    public double getSaldo(){
        return saldo;
    }

/**
 * Metoda zwracająca numer konta
 * @return zwraca numer konta w formacie EU
 */
    public String getNumerKonta(){
        return numerKonta;
    }

/**
 * Metoda obsługująca wpłatę na konto
 * @param kwota kwota wpłaty
 */
    public void wplata(double kwota){
        if(kwota>0){
            saldo += kwota;
            System.out.printf("Wpłacono %.2f PLN. Obecny stan konta to %.2f PLN. ",kwota,saldo);
        }else{
            System.out.println("Kwota wpłaty nie może być ujemna lub zerowa ");
        }
    }


/**
 * Metoda obsługująca wypłatę z konta
 * @param kwota kwota wypłaty
 */
    public void wyplata(double kwota){
        if(kwota > 0 && kwota <=saldo){
            saldo-= kwota;
            System.out.printf("Wypłacono %.2f PLN. Obecny stan konta to %.2f PLN. ",kwota,saldo);
        }else{
            System.out.println("Kwota wpłaty nie może być ujemna lub zerowa ");
        }
    }



/**
 * Metoda wyświetlająca stan konta
 */
public void StanKonta(){
    System.out.printf("Stan konta: %.2f PLN. \n", saldo);

}

/**
 * Główna metoda main
 * @param args lista argumentów metody main
 */
    public static void main(String[] args) {
        //Tworzenie obiektu z klasy KontoBankowe
        KontoBankowe konto1 = new KontoBankowe("PL1231231231231231 ", 1000);
        //Wyswietlenie początkowych parametrów konta
        System.out.printf("Numer konta: ", konto1.getNumerKonta());
        konto1.StanKonta();

        //Wywołania metod wpłaty i wypłaty z konta
        konto1.wplata(1000);
        konto1.StanKonta();
        konto1.wyplata(500);
        konto1.StanKonta();
        konto1.wyplata(20000);
         konto1.StanKonta();
    }



}
