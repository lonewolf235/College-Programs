import java.util.Scanner;

 public class stackimplement {
    static int i = 0;
    static int[] ar = new int[1000];

    static void push(int n) {
        if (i > ar.length)
            System.out.println("Overflow");
        else {
            ar[i] = n;
            i++;
        }
    }

    static int pop() {
        if (i <= 0) {
            System.out.println("UNDERFLOW");
            return -1;
        } else {
            int x = ar[i - 1];
            i--;
            return x;
        }
    }

    static void display() {
        for (int j = 0; j < i; j++) {
            System.out.println(ar[j] + " ");
        }

    }

    public static void main(String[] args) {
      push(5);
      push(7);
      push(8);
      push(2);
      display();
      System.out.println(pop());
      System.out.println(pop());
      display();

         
    }
}