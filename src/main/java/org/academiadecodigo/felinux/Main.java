package org.academiadecodigo.felinux;

import org.academiadecodigo.felinux.Services.GameCycle;
import org.academiadecodigo.felinux.sound.Music;

public class Main {

    public static void main(String[] args) {
        GameCycle game = new GameCycle();
        /*Music music = new Music();
        music.play();*/
        game.setupGame();
        game.start();
    }
}
