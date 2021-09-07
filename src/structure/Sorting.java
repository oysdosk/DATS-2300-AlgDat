package structure;

// Skal sortere en liste med tall fra høyest til lavest.
// Lage test: alt + enter, JUnit5,

public class Sorting {

    public static void main(String[] args) {
        // Initialisering av arrayet som skal sorteres
        int values[] = {1, 7, 2, 4, 6, 9};

        // Løkke som bruker findMax med nye grenser for hver gjennomkjøring
        for(int k = 0; k < values.length; k++){
            int max_index = findMax(values, k, values.length);
            System.out.println("Største verdi ligger på plass " + max_index +
                    " og har verdien " + values[max_index] + ".");

            // Bytter plass på tall på plass 0 og max_index
            int temp = values[k];               // Midlertidig variabel for første tall
            values[k] = values[max_index];      // Det største tallet blir flyttet til første plass i arrayet
            values[max_index] = temp;           // Det første tallet blir flyttet til der hvor det største tallet var.

            // Skriver ut det nye arrayet
            System.out.print("Arrayet etter omflytting: ");
            for (int i = 0; i < values.length; i++){
                System.out.print(values[i] + ", ");
            }
            System.out.println("\n");   // Ekstra linjer på utskrift
        }
    }

    // Metode som returnerer indeks til største tall i et array
    // Søker bare innenfor intervallene [fra, til]. Det gir mer fleksibilitet ved kall på metoden.
    public static int findMax(int[] values, int fra, int til){
        // Initialisering av foreløpig største tall (Settes til laveste indeks = fra)
        int index = fra;
        int max_value = values[fra];

        // Sjekker om verdien på neste plass i arrayet er større enn gjeldende
        for (int i = fra+1; i < til; i++){
            if (values[i] > max_value) {
                max_value = values[i];
                index = i;
            }
        }

        return index;
    }
}
