class Mother {
        public static void show() {
        System.out.println("Hello World (Mother's Static Method)");
    }
}


class Child extends Mother {
    public static void show() {
        System.out.println("Hello JUET (Child's Static Method)");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Mother m1 = new Child(); 
        m1.show();          
       	Mother.show();  
	Child.show();  
	Mother.show();  
        Child.show();      }
}
