package kap_1_1_uke34;

public class Oppg1_1_3_6 {
    public static int fakultet(int n){
        if (n < 0) throw new IllegalArgumentException("n må være større enn 0!");

        int fakultet = 1;

        for (int i = 2; i <= n; i++){
            fakultet *= i;
        }

        return fakultet;
    }

    public static void main(String[] args) {
        System.out.println(fakultet(2));
    }

    // Det utføres n - 1 multiplikasjoner så lenge n ikke er lik 0 eller 1.
}
