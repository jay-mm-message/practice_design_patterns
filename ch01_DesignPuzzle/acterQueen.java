package ch01_DesignPuzzle;

public class acterQueen extends Character {

    @Override
    public void fight() {
        System.out.println("Queen");
        this.weapon.useWeapon();
    }
    
}
