package kap_1_1;

public class Oppg1_1_2_1 {
    public static void main(String[] args){
        int[] numbers = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int lowestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            int compare = numbers[i];
            if (compare < lowestNumber) {
                lowestNumber = compare;
            }
        }

        System.out.println("Det laveste tallet er " + lowestNumber + ".");
        System.out.println("Indeksen til det laveste tallet er " + minimumIndex(numbers) + ".");
    }

    // Metode for å finne indeksen til det samme tallet;
    public static int minimumIndex(int[] numbers){
        if (numbers.length < 1) throw new java.util.NoSuchElementException("Tabellen er tom");

        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < numbers[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

}
