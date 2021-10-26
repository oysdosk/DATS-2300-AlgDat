package structure;

import java.util.ArrayDeque;

public class BinaryTree {

    static class BinaryTreeNode {
        char value;
        BinaryTreeNode left_child;
        BinaryTreeNode right_child;

        public BinaryTreeNode(char value){
            this.value = value;
            this.left_child = null;
            this.right_child = null;
        }

        BinaryTreeNode addLeftChild(char value){
            return this.left_child = new BinaryTreeNode(value);
        }

        BinaryTreeNode addRightChild(char value){
            return this.right_child = new BinaryTreeNode(value);
        }
    }

    /* Tre steg:
    1. Ta ut noden først i køen
    2. Legg til nodens barn
    3. Skriv ut
     */
    static void printLevelOrder(BinaryTreeNode root){
        ArrayDeque<BinaryTreeNode> queue = new ArrayDeque<BinaryTreeNode>();

        // Legger til rot-noden
        queue.addLast(root);

        while (!queue.isEmpty()){
            // Ta ut første fra køen
            BinaryTreeNode current = queue.removeFirst();

            // Legg til currents to barn
            if (current.left_child != null){
                queue.addLast(current.left_child);
            }
            if(current.right_child != null){
                queue.addLast(current.right_child);
            }

            // Skriv ut
            System.out.print(current.value + " ");
        }
    }

    // Dybde først-traversering pre-orden
    static void printPreOrder(BinaryTreeNode node){
        if(node == null) return;

        System.out.print(node.value + " ");
        printPreOrder(node.left_child);
        printPreOrder(node.right_child);

    }

    // Dybde først-traversering in-orden
    static void printInOrder(BinaryTreeNode node){
        if(node == null) return;

        printInOrder(node.left_child);
        System.out.print(node.value + " ");
        printInOrder(node.right_child);
    }

    // Dybde først-traversering post-orden
    static void printPostOrder(BinaryTreeNode node){
        if(node == null) return;

        printPostOrder(node.left_child);
        printPostOrder(node.right_child);
        System.out.print(node.value + " ");
    }

    // Dybde først-traversering uten rekursjon
    static void printPreOrderNonRecursive(BinaryTreeNode root){
        ArrayDeque<BinaryTreeNode> stack = new ArrayDeque<BinaryTreeNode>();

        stack.addLast(root);

        while(!stack.isEmpty()){
            BinaryTreeNode current = stack.removeLast();

            if(current.right_child != null) stack.addLast(current.right_child);
            if(current.left_child != null) stack.addLast(current.left_child);

            System.out.print(current.value + " ");
        }
    }

    public static void main(String[] args) {
        // Lager root på nivå 0
        BinaryTreeNode root = new BinaryTreeNode('A');

        // Legger inn resterende noder på nivå 1
        BinaryTreeNode b = root.addLeftChild('B');
        BinaryTreeNode c = root.addRightChild('C');

        // Legger inn noder på nivå 2
        BinaryTreeNode d = b.addLeftChild('D');
        BinaryTreeNode e = b.addRightChild('E');
        BinaryTreeNode f = c.addLeftChild('F');
        BinaryTreeNode g = c.addRightChild('G');

        // Kall funksjonen som printer
        System.out.println("Bredde først-traversering: ");
        printLevelOrder(root);
        System.out.println();

        System.out.println("Dybde først-traversering - pre-orden: ");
        printPreOrder(root);
        System.out.println();

        System.out.println("Dybde først-traversering - in-orden: ");
        printInOrder(root);
        System.out.println();

        System.out.println("Dybde først-traversering - post-orden: ");
        printPostOrder(root);
        System.out.println();

        System.out.println("Dybde først-traversering - pre-orden - uten rekursjon: ");
        printPreOrderNonRecursive(root);
    }
}
