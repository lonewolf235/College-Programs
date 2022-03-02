import java.util.*;

public class Bstusinglist {
    static Node head;

     static class Node {
        int data;
        Node right;
        Node left;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the root node");
        head.data = sc.nextInt();
        head.right = null;
        head.left = null;
        System.out.println("Enter the number of elements for binary tree");
        int x=sc.nextInt();
        Bstusinglist bst=new Bstusinglist();
        while(x-->0){

            Node temp=new Node(sc.nextInt());
            if(temp.data>head.data){
                head.right = temp;
            }
            else{
                head.left=temp;
            }
        }
        

    }

}