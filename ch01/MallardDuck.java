package ch01;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I'm real a Mallard duck!");
    }
    
}
