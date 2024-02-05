package ch01_DesignPuzzle;

public class acterKnight extends Character{

    @Override
    public void fight() {
        System.out.println("Knight");
        this.weapon.useWeapon();
    }
    
}
