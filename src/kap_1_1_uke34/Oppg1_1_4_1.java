package kap_1_1_uke34;

public class Oppg1_1_4_1 {
    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi                1
        int maksverdi = a[0];    // største verdi                           2

        for (int i = 1; i < a.length; i++)                              //  1 + n + n-1
            if (a[i] > maksverdi)                                       //  2 * (n-1)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdateres // 3*X
        }
        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks

    /*

     */

    public static void main(String[] args) {
        // Generelt: 4*n + 1 +
        // i
        int[] a = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
        //

        // ii
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    }
}