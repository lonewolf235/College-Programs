public class queueimplement {
    static int i = 0;
    static int j=0;
    static int[] ar = new int[1000];

    static void enqueue(int n) {
        if (i > ar.length)
            System.out.println("Queue is full");
        else {
            ar[i] = n;
            i++;
        }
    }
    static int  dequeue() {
        if (i <= 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int x = ar[j];
            j++;
            return x;
        }


    }
    static int size(){
        // this will return number of elements present in queue

    return i-j;
    }
    
    static void display() {
        for (int k = j; k < i; k++) {
            System.out.print(ar[k] + " ");
        }
System.out.println();
    }

    public static void main(String[] args) {
        enqueue(5);
        enqueue(7);
        enqueue(8);
        enqueue(2);
        display();
        System.out.println(dequeue());
        System.out.println(dequeue());
        display();
        System.out.println(size());
    }

}
