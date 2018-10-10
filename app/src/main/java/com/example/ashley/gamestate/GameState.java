package com.example.ashley.gamestate;

import java.util.ArrayList;
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
    Card deck[] = new Card[108];
    int idArr[] = new int[108];
    ArrayList<Card> hand1 = new ArrayList<Card>(7);
    ArrayList<Card> hand2 = new ArrayList<Card>(7);
    Card discardPile;



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
