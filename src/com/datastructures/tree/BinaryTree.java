package com.datastructures.tree;

public class BinaryTree<X extends Comparable> {

    private Node root;
    private int size;


    public BinaryTree() {
        this.root = null;
    }

    public int size() {
        return size;
    }

    public void add(X item) {
        Node node = new Node(item);
        if (this.root == null) {
            this.root = node;
            System.out.println("Setting root :" + node.getItem());
            this.size++;
        } else {
            insert(this.root, node);
        }
    }

    private void insert(Node parent, Node child) {

        if (child.getItem().compareTo(parent.getItem()) < 0) {
            if (parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getLeft(), child);
            }

        } else if (child.getItem().compareTo(parent.getItem()) > 0) {
            if (parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getRight(), child);
            }
        }

        // else, do nothing since binary tree nodes are assumed to be unique

    }

    public boolean contains(X item) {
        return getNode(item) != null;
    }

    private Node getNode(X item) {
        Node currentNode = this.root;

        while (currentNode != null) {

            int val = item.compareTo(currentNode.getItem());

            // if the val is less than 0 we go left side of tree
            if (val < 0) {
                currentNode = currentNode.getLeft();
            }
            // if the val is bigger than 0 we go right side of tree
            else if (val > 0) {
                currentNode = currentNode.getRight();
            }
            // the node is a match, return it
            else {
                return currentNode;
            }
        }
        return null;
    }


    private class Node {

        private Node left;
        private Node right;
        private Node parent;
        private X item;

        Node(X item) {
            this.left = null;
            this.right = null;
            this.parent = null;
            this.item = item;
        }

        Node getLeft() {
            return left;
        }

        void setLeft(Node left) {
            this.left = left;
        }

        Node getRight() {
            return right;
        }

        void setRight(Node right) {
            this.right = right;
        }

        Node getParent() {
            return parent;
        }

        void setParent(Node parent) {
            this.parent = parent;
        }

        X getItem() {
            return item;
        }

        void setItem(X item) {
            this.item = item;
        }

    }
}
