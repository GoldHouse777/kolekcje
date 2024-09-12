public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //TABLICA
        /*
        -tablica musi miec zdefiniowant rozmiar, ktorego potem nie mozemy zmienic.
        -tablica przechowuje typy proste i zlozone.
         */

        int [] tablicaLiczbLosowych = new int[6];
        //losujemy wartosci z zakresu od 1 do 100
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = (int)(Math.random()*100);
        }
        //wypisywanie tablicy na ekranie
        for (int element:tablicaLiczbLosowych) {
            System.out.println(element+", ");
        }
    }
}