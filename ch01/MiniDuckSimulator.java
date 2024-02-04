package ch01;

public class MiniDuckSimulator {
    public static void main(String [] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());

        mallardDuck.performFly();
        mallardDuck.performQuack();
        //mallardDuck.display();
    }
}
