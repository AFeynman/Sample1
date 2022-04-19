package net.absoft.game;

public class AgeChecker {
    private  final int MIN_AGE=18;
    public boolean CanPlayGame(int age){
        return age>=MIN_AGE;
    }
}
