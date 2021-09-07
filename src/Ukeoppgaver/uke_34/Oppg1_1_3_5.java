package Ukeoppgaver.uke_34;

public class Oppg1_1_3_5 {
    public static int[] minmaks(int[] a){
        if (a.length != 2) {
            System.out.println("Tabellen må ha en lengde på 2!");
            return null;
        }

        int minIndeks = 0; int maksIndeks = 0;     // Deklarerer posisjonene til min og maks
        int minVerdi = a[0]; int maksVerdi = a[0]; // Deklarerer verdiene til min og maks

        for (int i = 1; i < a.length; i++){
            int compare = a[i];     // Deklarerer tallet som skal brukes til å sammenlikne med
            if (compare > maksVerdi) {maksVerdi = compare; maksIndeks = i;}     // Utføres 2-1 ganger
            else if (compare < minVerdi) {minVerdi = compare; minIndeks = i;}   // Utføres hvis testen over var usann
        }

        return new int[] {minIndeks, maksIndeks};
    }

    public static void main(String[] args){
        int[] totallsTabell = {31, 17};
        System.out.println("Posisjonene til minste og største verdi i tabellen: " +
                minmaks(totallsTabell)[0] + " og " + minmaks(totallsTabell)[1]);
    }

    // Metoden bruker 2n - 2 sammenlikninger når det største tallet står først, og noe mindre gjennomsnittlig fordi den
    // første sammenlikningen tidvis også er sann.
}
