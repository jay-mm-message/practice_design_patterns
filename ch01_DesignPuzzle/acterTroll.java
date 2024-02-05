package ch01_DesignPuzzle;

public class acterTroll extends Character {

    @Override
    public void fight() {
        System.out.println("Troll");
        this.weapon.useWeapon();
    }
    
}
