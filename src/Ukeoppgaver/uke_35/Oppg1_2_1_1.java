package Ukeoppgaver.uke_35;

public class Oppg1_2_1_1 {

    public static void main(String[] args) {
        int[] values = {4, 3, 2, 9, 1};
        System.out.println(min(values,0, values.length));
        System.out.println(min(values));
    }

    public static int min(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til minste verdi i a[fra:til>
        int minVerdi = a[fra];   // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minVerdi) {
                m = i;                // indeks til minste verdi oppdateres
                minVerdi = a[m];     // Minste verdi oppdateres
            }
        }

        return m;  // posisjonen til minste verdi i a[fra:til>
    }

    public static int min(int[] a)  // bruker hele tabellen
    {
        return min(a,0,a.length);     // kaller metoden over
    }


}
