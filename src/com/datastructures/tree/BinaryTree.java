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

    public boolean delete(X item) {
        boolean deleted = false;
        Node currentNode = getNode(item);
        if (currentNode == null) {
            deleted = false;
        } else {
            // We have found the node to be deleted.
            if (currentNode.getLeft() == null && currentNode.getRight() == null) {
                // No Child Case
                unlink(currentNode, null);
                deleted = true;
            } else if (currentNode.getLeft() == null && currentNode.getRight() != null) {
                // One Right Child Case
                unlink(currentNode, currentNode.getRight());
                deleted = true;
            } else if (currentNode.getLeft() != null && currentNode.getRight() == null) {
                // One Left Child Case
                unlink(currentNode, currentNode.getLeft());
                deleted = true;
            } else {
                // Both Child Case
                Node child = currentNode.getLeft();
                while (child.getRight() != null && child.getLeft() != null) {
                    child = child.getRight();
                }
                child.getParent().setRight(null);
                child.setLeft(currentNode.getLeft());
                child.setRight(currentNode.getRight());
                unlink(currentNode, child);
                deleted = true;

            }
        }
        if (deleted) {
            this.size--;
        }
        return deleted;
    }

    private void unlink(Node currentNode, Node newNode) {

        // if this is the root node, we replace that a little differently
        if (currentNode == this.root) {
            newNode.setLeft(currentNode.getLeft());
            newNode.setRight(currentNode.getRight());
            this.root = newNode;
        } else if (currentNode.getParent().getRight() == currentNode) {
            currentNode.getParent().setRight(newNode);
        } else {
            currentNode.getParent().setLeft(newNode);
        }
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
