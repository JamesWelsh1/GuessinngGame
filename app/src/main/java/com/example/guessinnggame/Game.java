package com.example.guessinnggame;
import java.util.Random;

public class Game {
    private int secret;
    private Random random = new Random();

    public Game() {
        secret = random.nextInt(10)+1;
    }

    public boolean check(int guess) {
        return guess == secret;
    }
}

