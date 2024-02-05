package ch01_strategy_pattern;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("I'm flying with a rocket!");
    }

}
