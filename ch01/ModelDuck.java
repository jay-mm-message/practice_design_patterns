package ch01;

public class ModelDuck extends Duck {
    
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
       System.out.println("I'm a model duck");
    }
    
}
