package Ukeoppgaver.uke_34;

public class Oppg1_1_4_1 {
    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi                1
        int maksverdi = a[0];    // største verdi                           2

        for (int i = 1; i < a.length; i++)                              //  1 + n + n-1
            if (a[i] > maksverdi)                                       //  2*(n-1)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdateres // 3*X
        }
        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks

    /*

     */

    public static void main(String[] args) {
        // Generelt: 4*n + 2 + 3*X
        // i
        int[] a = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
        // 4*10 + 2 + 3*0 = 42 ganger.

        // ii
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 4*10 + 2 + 3*9 = 69 ganger.
    }
}
