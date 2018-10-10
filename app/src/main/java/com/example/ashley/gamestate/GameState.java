package com.example.ashley.gamestate;

import java.util.ArrayList;

public class GameState {
    int player1;
    int player2;
    int deckSize;
    int turn;
    Card deck[] = new Card[108];
    int idArr[] = new int[108];
    ArrayList<Card> hand1 = new ArrayList<Card>(7);
    ArrayList<Card> hand2 = new ArrayList<Card>(7);
    Card discardPile;

    @Override
    public String toString(){
        int i;
        String out= "";
        for(i = 0; i < 108; i++){
            out = out+deck[i].getColor()+" "+deck[i].getValue()+" "+deck[i].getType()+" "+idArr[i]+" ";
        }
        out = out+deckSize+" "+turn+" "+player1+" "+player2+" "+discardPile.getColor()+" "+discardPile.getValue()+" "+discardPile.getType();
        for(i = 0; i < hand1.size(); i++){
            out = out+" "+hand1.get(i).getColor()+" "+hand1.get(i).getValue()+" "+hand1.get(i).getType()+" ";
        }
        for(i = 0; i < hand2.size(); i++){
            out = out+" "+hand2.get(i).getColor()+" "+hand2.get(i).getValue()+" "+hand2.get(i).getType();
        }
        return out;
    }
}
