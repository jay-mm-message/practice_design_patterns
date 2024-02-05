package ch01_DesignPuzzle;

public abstract class Character {
    BehaviorWeapon weapon;

    public void setWeapon(BehaviorWeapon bw) {
        this.weapon = bw;
    }
    public abstract void fight();
}
