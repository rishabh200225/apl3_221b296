class Mother {
    int x = 10; // Example integer member
	void show() {
        System.out.println("Mother's value of x: " + x);
    }
}
class Child extends Mother {
    
}
class Application {
    public static void main(String args[]) {
      Mother m = new Mother();
        m.show(); 
	Child ch = new Child();
        ch.show(); 
    }
}
