package com.datastructures.tree;

public class BinaryTreeTest {

    public static void main(String[] args) {

        BinaryTree<FamilyMember> bst = new BinaryTree<FamilyMember>();

        FamilyMember testMember = new FamilyMember("A", "Gencosmanoglu", 54);
        bst.add(new FamilyMember("M", "Gencosmanoglu", 29));
        bst.add(new FamilyMember("A", "Gencosmanoglu", 24));
        bst.add(new FamilyMember("Z", "Gencosmanoglu", 25));
        bst.add(new FamilyMember("M", "Tokar", 27));
        bst.add(new FamilyMember("M", "Gencosmanoglu", 19));
        bst.add(new FamilyMember("S", "Tokar", 30));
        bst.add(testMember);
        bst.add(new FamilyMember("A", "Gencosmanoglu", 56));
        bst.add(new FamilyMember("K", "Gencosmanoglu", 75));

        System.out.println("After adding testMember : contains ->" + bst.contains(testMember));
        bst.delete(testMember);
        System.out.println("After deleting testMember : contains ->" + bst.contains(testMember));

    }
}
