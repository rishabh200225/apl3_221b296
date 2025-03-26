abstract class Beverage{
private void pour(int qty){
System.out.println("pour"+qty+"ml of beverage into a glass ");
}
protected abstract void addcondiment();
protected void stir(){
System.out.println("pour"+qty+"ml of beverage into a glass ");
}
private void serve (){
System.out.println("serve through waiter");
}
public void templateMethod(int qty){
pour();
add Condiment(qty);
stir();
serve();
}
}

