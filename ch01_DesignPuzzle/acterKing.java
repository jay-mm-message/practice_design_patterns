package ch01_DesignPuzzle;

public class acterKing extends Character {

    @Override
    public void fight() {
        System.out.println("King");
        this.weapon.useWeapon();
    }
    
}
