class Mother {
       public void show() {
        System.out.println("Hello World");
    }
}
class Child extends Mother {
    public void show() {
        System.out.println("Hello JUET");
    }
}
public class TestOverriding {
public static void main(String[] args) {
	Mother mother = new Mother();
	mother.show();          
	Mother child = new Child();         
	child.show();     
 }
}
