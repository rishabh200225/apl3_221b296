class One {
    One(int x) {
        System.out.println("Class One: x = " + x);
    }
}
class Two extends One {
   Two(int x) {
        super(x);  
        System.out.println("Class Two: x = " + x);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Two obj = new Two(10); 
    }
}
