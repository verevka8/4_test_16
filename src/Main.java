import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        Tree2 t = new Tree2();
        while (true){
            x = scan.nextInt();
            if (x == 0){
                break;
            }
            else {
                t.insert(x);
            }
        }
        System.out.println(t.depth(t.root));
    }
}



class Node {
    int key;
    Node leftchild;
    Node rightchild;
}

class Tree2 {
    Node root;
    int rightside;
    int leftside;

    public void insert(int n) {
        Node t = root;
        int r = 1;
        if(t == null ) {
            root = new Node();
            root.key = n;
            return;
        }
        while(true) {
            if(n > t.key){
                if(t.rightchild != null) {
                    t = t.rightchild;
                } else {
                    t.rightchild = new Node();
                    t.rightchild.key = n;
                    break;
                }

            } else if(n == t.key) {
                break;
            } else {
                if(t.leftchild != null) {
                    t = t.leftchild;

                } else {
                    t.leftchild = new Node();
                    t.leftchild.key = n;
                    break;
                }
            }
        }
    }

    public int depth(Node node){
        int max_count = -1;
        if (node != null){
            max_count = Math.max(depth(node.leftchild),depth(node.rightchild));
        }
        if (node == root){
            return max_count;
        }
        return max_count + 1;
    }
}