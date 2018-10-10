package com.example.ashley.gamestate;

import java.util.ArrayList;

public class GameState {
    int playerId;
    int deckSize;
    int turn;
    Card deck[] = new Card[108];
    int idArr[] = new int[108];
    ArrayList<Card> hand1 = new ArrayList<Card>(7);
    ArrayList<Card> hand2 = new ArrayList<Card>(7);
    Card discardPile;
}
