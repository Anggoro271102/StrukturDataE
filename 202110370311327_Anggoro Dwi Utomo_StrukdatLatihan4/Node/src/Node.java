public class Node {
    int data;
    Node left;
    Node right;
    public Node (int data){
        this.data=data;
    }
    public static void main(String[] args) {
        BinaryTree pohon =new BinaryTree();
        pohon.newNode(20);
        pohon.newNode(2);
        pohon.newNode(25);
        pohon.newNode(37);
        pohon.newNode(16);
        System.out.println("==============");
        System.out.print("Pre Order\t: ");
        pohon.preOrder(pohon.root);
        System.out.println("\n==============");
        System.out.print("In Order\t: ");
        pohon.inOrder(pohon.root);
        System.out.println("\n==============");
        System.out.print("Post Order\t: ");
        pohon.postOrder(pohon.root);

    }
}
