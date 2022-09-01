import java.util.*;

public class invoice {
    String partno, part_desc;
    int quantity;
    double price;

    public invoice(String partno, String part_desc, int quantity, double price) {
        this.partno = partno;
        this.part_desc = part_desc;
        this.quantity = quantity;
        this.price = price;
    }

    public double getamount() {
        return ((quantity * price) > 0 ? (quantity * price) : 0);
    }

    void set(String partno, String part_desc, int quantity, double price) {
        this.partno = partno;
        this.part_desc = part_desc;
        this.quantity = quantity;
        this.price = price;
    }

    int getquantity() {
        return quantity;

    }

    String getpartno() {
        return partno;
    }

    String getpartdesc() {
        return part_desc;
    }

    double getprice() {
        return price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter values");
        invoice i = new invoice(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
        System.out.println("Original invoice information");
        System.out.println("Part number:  " + i.partno);
        System.out.println("Part description:  " + i.part_desc);
        System.out.println("quantiy:  " + i.quantity);
        System.out.println("Price:  " + i.price);
        System.out.println("Invoice amount:  " + i.getamount());
        System.out.println("please enter updated values");
        i.set(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
        System.out.println("Updated invoice information");
        System.out.println("Part number:  " + i.getpartno());
        System.out.println("Part description:  " + i.getpartdesc());
        System.out.println("quantiy:  " + i.getquantity());
        System.out.println("Price:  " + i.getprice());
        System.out.println("Invoice amount:  " + i.getamount());
    }
}
