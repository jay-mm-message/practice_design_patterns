package ch01_strategy_pattern;

public class Squack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("squack");
    }
    
}
