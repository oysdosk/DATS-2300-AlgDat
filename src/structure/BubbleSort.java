package structure;

public class BubbleSort {

    public static void main(String[] args) {
        int[] values = {5, 6, 9, 2, 8, 3, 1};

        // Ytre løkke sorterer ett tall per gjennomgang:
        for (int i = 0; i < values.length-1; i++){

            // Indre løkke "bobler opp" tall til rett posisjon
            for (int j = values.length-1; j > i; j--){

                // Sjekker om tall på pos. j og j-1 er sortert riktig:
                if (values[j] < values[j-1]){
                    int temp = values[j];
                    values[j] = values[j-1];
                    values[j-1] = temp;
                }
            }
        }




    }

}
