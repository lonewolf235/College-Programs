import java.util.*;

public class balanced_paranthese {
    static int i = 0;
    static char[] ar = new char[1000];

    static void push(char n) {
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
            char x = ar[i - 1];
            i--;
            return x;
        }
    }

    static int size() {
        return i;
    }

    static char peek() {
        return ar[i - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.println("Enter the string: \n");
        String str = sc.nextLine();
        int l = str.length();
        for (int i = 0; i < l; i++) {
            char c = str.charAt(i);
            if (size() == 0) {
                if (c == '{' || c == '[' || c == '(')
                    push(c);
                else {
                    System.out.println("Unbalanced Paranthesis");
                    flag = -1;
                    break;
                }
            } else {
                if (c == '{' || c == '[' || c == '(')
                    push(c);
                else {
                    if (c == ')' && peek() == '(')
                        pop();
                    else if (c == ']' && peek() == '[')
                        pop();
                    else if (c == '}' && peek() == '{')
                        pop();
                    else {
                        System.out.println("Unbalanced Paranthesis");
                        flag = -1;
                        break;
                    }
                }

            }
        }
        if (flag == 0) {
            if (size() == 0)
                System.out.println("Balanced Paranthesis");
            else
                System.out.println("Unbalanced paranthesis");
        }
    }

}
