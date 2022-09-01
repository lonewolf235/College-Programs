public class exception {
    public static void main(String[] args) {
        int a = 100, b = 0;
        int c;
        int[] ar = new int[10];
        try {
            ar[100] = 100;
            try {
                c = a / b;
            } catch (ArithmeticException ae) {
                System.out.println("java padho");
            }
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ki korchis baba,array por");
        }
    }
}
