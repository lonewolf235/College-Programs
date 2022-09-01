public class staticmethod {
    static int a=1,b=2,c=3;
    public static void add(){
    System.out.println((a+b+c));
    }
}
class overidden extends staticmethod{
    static int g=0,h=9;
    public  void add(){
System.out.println(g+h);
    }
}
class Main{
    public static void main(String[] args) {
        overidden c=new overidden();
        c.add();
    }
}