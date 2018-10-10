package com.example.ashley.gamestate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Game State Class for Uno
 *
 * @author Andrew, Meredith, Ashley
 * @date October 2018
 */
public class GameState {
    int playerId;
    int deckSize;
    int turn;

    public GameState(){

    }

    public String getGameState(){
        return "Player ID: " + playerId + ", Deck Size: " + deckSize + ", Turn: " + turn;
    }

    /**toString
     *
     * @return Game State
     */
    @Override
    public String toString(){
       return "[" +getGameState()+ "]";
    }

}
