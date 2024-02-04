package ch01;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck() {};

    public void performFly() {
        flyBehavior.fly();
    };
    public void performQuack() {
        quackBehavior.quack();
    };
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public abstract void display();
}
