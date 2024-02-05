package ch01_DesignPuzzle;

public class Game {
    public static void main(String [] args) {
        System.out.println();
        
        Character king = new acterKing();
        king.setWeapon(new BehaviorSword());
        king.fight();

        Character queen = new acterQueen();
        queen.setWeapon(new BehaviorBowAndArrow());
        queen.fight();

        Character knight = new acterKnight();
        knight.setWeapon(new BehaviorKnife());
        knight.fight();

        Character troll = new acterTroll();
        troll.setWeapon(new BehaviorAxe());
        troll.fight();
    }
}
