package structure;

public class TournamentTree {

    // Node i et turneringstre hvor hver node har en peker til sine til children.
    public static class Node {
         char value;
         Node left_child;
         Node right_child;

        public Node(char value){
            this.value = value;
        }
        // Verdien av en char bestemmes av ASCII-tabellen.

        // Metode som printer ut en nodes verdi, samt alle dens barn og deres barn.
        public void print(){
            System.out.print(value + ", ");
            if(this.left_child != null){
                this.left_child.print();
            }
            if(this.right_child != null){
                this.right_child.print();
            }
        }
    }

    // Metode som avgjør hvilken av to noder som har største verdi.
    public static Node playMatch(Node team_1, Node team_2){
        char winner;
        if(team_1.value > team_2.value) {
            winner = team_1.value;
        }
        else {
            winner = team_2.value;
        }

        // Lager en ny foreldrenode som bruker de to input-nodene som attributtene
        // left_child og right_child
        Node parent = new Node(winner);
        parent.left_child = team_1;
        parent.right_child = team_2;

        return parent;
    }

    // Main
    public static void main(String[] args) {
        // Initialiserer noen noder:
        Node z = new Node('Z');
        Node c = new Node('C');
        Node f = new Node('F');
        Node k = new Node('K');

        // Avgjør hvilken char som er størst:
        Node semi_1 = playMatch(z,c);
        Node semi_2 = playMatch(f,k);
        Node vinner = playMatch(semi_1,semi_2);

        // Utskrift
        System.out.println("\nVinner:");
        vinner.print();
        System.out.println("\nSemifinalevinnere:");
        semi_1.print();
        semi_2.print();

        System.out.println("Turneringstreet i pre-orden:\n"); // Forventer z,z,z,c,k,f,k
        vinner.print();
    }
}
