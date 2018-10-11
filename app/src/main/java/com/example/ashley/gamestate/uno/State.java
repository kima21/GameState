package com.example.ashley.gamestate.uno;

import java.util.ArrayList;
import com.example.ashley.gamestate.uno.Card;

public class State {
    int playerId;
    int deckSize;
    int turn;
    Card deck[] = new Card[108];
    String idArr[] = new String[108];
    ArrayList<Card> hand1 = new ArrayList<Card>(7);
    ArrayList<Card> hand2 = new ArrayList<Card>(7);
    Card discardPile;

    public State() {
        playerId = 0;
        deckSize = deck.length;
        turn = 0;
        makeDeck();

    }

    public void makeDeck() {
        int i, n, k, j;

        //number cards with value 0
        for (i = 0; i < 4; i++) {
            deck[i].setColor(i);
            deck[i].setValue(0);
            deck[i].setType('n');
            idArr[i] = "card" + i;
        }

        //number cards with values 1-9
        while (i < 76) {
            for (n = 0; n < 2; n++) {
                for (k = 0; k < 10; k++) {
                    for (j = 0; j < 4; j++) {
                        deck[i].setColor(j);
                        deck[i].setValue(k);
                        deck[i].setType('n');
                        idArr[i] = "card" + i;
                        i++;
                    }
                }
            }
        }

        //skip cards
        while (i < 84) {
            for (k = 0; k < 2; k++) {
                for (j = 0; j < 4; j++) {
                    deck[i].setColor(j);
                    deck[i].setValue(0);
                    deck[i].setType('s');
                    idArr[i] = "card" + i;
                    i++;
                }
            }
        }

        //draw 2 cards
        while (i < 92) {
            for (k = 0; k < 2; k++) {
                for (j = 0; j < 4; j++) {
                    deck[i].setColor(j);
                    deck[i].setValue(0);
                    deck[i].setType('d');
                    idArr[i] = "card" + i;
                    i++;
                }
            }
        }

        //reverse cards
        while (i < 100) {
            for (k = 0; k < 2; k++) {
                for (j = 0; j < 4; j++) {
                    deck[i].setColor(j);
                    deck[i].setValue(0);
                    deck[i].setType('r');
                    idArr[i] = "card" + i;
                    i++;
                }
            }
        }

        //wild cards
        while (i < 104) {
            for (j = 0; j < 4; j++) {
                deck[i].setColor(4);
                deck[i].setValue(0);
                deck[i].setType('w');
                idArr[i] = "card" + i;
                i++;
            }
        }

        //wild draw 4 cards
        while (i < 108) {
            for (j = 0; j < 4; j++) {
                deck[i].setColor(4);
                deck[i].setValue(0);
                deck[i].setType('d');
                idArr[i] = "card" + i;
                i++;
            }
        }
    }

    public String getGameState() {
        return "Player ID: " + playerId + ", Deck Size: " + deckSize + ", Turn: " + turn;
    }

    /**
     * toString
     *
     * @return Game State
     */
    @Override
    public String toString() {
        int i;
        String out = "";
        for (i = 0; i < 108; i++) {
            out = out + deck[i].getColor() + " " + deck[i].getValue() + " " + deck[i].getType() + " " + idArr[i] + " ";
        }
        out = out + deckSize + " " + turn + " " + " " + discardPile.getColor() + " " + discardPile.getValue() + " " + discardPile.getType();
        for (i = 0; i < hand1.size(); i++) {
            out = out + " " + hand1.get(i).getColor() + " " + hand1.get(i).getValue() + " " + hand1.get(i).getType() + " ";
        }
        for (i = 0; i < hand2.size(); i++) {
            out = out + " " + hand2.get(i).getColor() + " " + hand2.get(i).getValue() + " " + hand2.get(i).getType() + " ";
        }
        out = out + playerId;
        return out;
    }

}

