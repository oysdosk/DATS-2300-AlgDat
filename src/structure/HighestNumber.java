package structure;

public class HighestNumber {
    public static void main(String[] args){
        int[] numbers = {16, 3, 8, 19, 22, 7 ,26};
        int highestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            int compare = numbers[i];
            if (compare > highestNumber) {
                highestNumber = compare;
            }
        }

        System.out.println(highestNumber);
    }

    /* Datastruktur: Måten vi lagrer data på:
    Eks: array, trestruktur, hashmap

    Algoritmeanalyse intro:
    Hvor effektiv er algoritmen?
    Grunnleggende operasjoner:
- En tilordning - en variabel får en verdi (eller initialisering)
- En tabelloperasjon - en tabellverdi aksesseres ([0])
- En sammenligning - to verdier sammenlignes ( <, <=, >, == ...)
- En regneoperasjon - f.eks. en addisjon av to tall (+, -, &, % ...)

int[] numbers = {16, 3, 8, 19, 22, 7 ,26};
        int highestNumber = numbers[0];             2
        for (int i = 1; i < numbers.length; i++){   1 + 7 + 6
            int compare = numbers[i];               2 * 6
            if (compare > highestNumber) {          1 * 6
                highestNumber = compare;            1 * 3

            37 operasjoner for 7 tall.

            For n:
            2
            1 + n + n-1
            2 * (n-1)
            1 * (n-1)
            X
            Totalt: 5n - 1 + X

    Kompleksitet: O(n)

    */

}