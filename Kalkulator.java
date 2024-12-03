/**
 * Kalkulator obliczający pole koła i kwadratu
 * @author Błażej Rudnik
 * @version 1.0
 */
public class Kalkulator {

    /**
     * Metoda obliczająca pole kwadratu
     * @param bok wartość boku kwadratu
     * @return zwraca pole kwadratu
     * @throws IllegalArgumentException przechwytuje błąd wartości boku
     */
    public double calculateSquareArea(double bok){
        
        if(bok>0){
        return bok*bok;}
        else{
            throw new IllegalArgumentException("Wartość boku nie może byc ujemna");
        }
    }

    /**
     * Metoda obliczająca pole koła
     * @param r promień
     * @return zwraca pole koła
     * @throws IllegalArgumentException przechwytuje błąd wartości promienia
     */
    public double calculateCircleArea(double r){

        if(r>0){
        return Math.PI*r*r;}
        else{
            throw new IllegalArgumentException("Wartość boku nie może byc ujemna");
        }
    }

public void showInfo (String komunikat, double x){
    System.out.printf("{komunikat} {x}");
}

    /**
     * Głowna metoda prezentujaca działanie kalkulatora
     * @param args lista argumentów
     */
    public static void main(String[] args) {
        
        Kalkulator kolo = new Kalkulator();
        double poleKola = kolo.calculateCircleArea(2);
        kolo.showInfo("Pole koła wynosi " ,poleKola);    

        Kalkulator kwadrat = new Kalkulator();
        double poleKwadratu = kwadrat.calculateSquareArea(5);
        kwadrat.showInfo("Pole kwadratu wynosi " ,poleKwadratu);
    }
}
