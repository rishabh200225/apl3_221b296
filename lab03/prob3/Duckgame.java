interface Flyable {
    void fly();
}
interface Quackable {
    void quack();
}
interface Squeakable {
    void squeak();
}
interface Muteable {
    void mute();
}
interface Swimmable {
    default void swim() {
        System.out.println("swimming");
    }
}
class RubberDuck implements Squeakable, Swimmable {
  public void squeak() {
        System.out.println("squeaking");
    }
}
class WoodenDuck implements Muteable, Swimmable {
  public void mute() {
        System.out.println("silence");
    }
}
class RedHeadDuck implements Flyable, Quackable, Swimmable {
	public void fly() {
        System.out.println("flying");
    }
    public void quack() {
        System.out.println("quacking");
    }
}
class LakeDuck implements Flyable, Quackable, Swimmable {
    public void fly() {
        System.out.println("flying");
    }
public void quack() {
        System.out.println("quacking");
    }
}
 class DuckGame {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();
        
     
        rubberDuck.squeak();
        rubberDuck.swim();
        
        woodenDuck.mute();
        woodenDuck.swim();
        
        redHeadDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.swim();
        
        lakeDuck.fly();
        lakeDuck.quack();
        lakeDuck.swim();
    }
}