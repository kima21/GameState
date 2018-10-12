package com.example.ashley.gamestate.uno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ashley.gamestate.R;
import com.example.ashley.gamestate.game.GameConfig;
import com.example.ashley.gamestate.game.GameMainActivity;
import com.example.ashley.gamestate.game.LocalGame;
import com.example.ashley.gamestate.game.infoMsg.GameState;

/**
 * Main Activity Class for Uno
 *
 * @author Andrew, Meredith, Ashley
 * @date October 2018
 */
public class MainActivity extends GameMainActivity {

    public TextView noText= (TextView)findViewById(R.id.editText);

    @Override
    public GameConfig createDefaultConfig() {
        return null;
    }

    @Override
    public LocalGame createLocalGame() {
        return null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noText.setOnClickListener(this);

        Button runTestButton = (Button)findViewById(R.id.runButton);
        runTestButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                noText.setText("");

                State firstInstance = new State();
                State secondInstance = new State(firstInstance);
                State thirdInstance = new State();
                State fourthInstance = new State(thirdInstance);

                firstInstance.makeDeck();
                noText.append("Makes the deck for all the cards.\n");
                firstInstance.shuffleDeck();
                noText.append("shuffles the deck\n");
                firstInstance.drawCard(firstInstance.getHand(1));
                noText.append("Player 1 draws a card\n");
                firstInstance.drawCard(firstInstance.getHand(2));
                noText.append("Player 2 draws a card\n");
                firstInstance.updatePileSize();
                noText.append("Updates the discard pile size\n");
                firstInstance.updateDeckSize();
                noText.append("Updates the deck size\n");
                firstInstance.playCard(firstInstance.getHand(1), Card c1);
                noText.append("lets player 1 play a card\n");
                firstInstance.playCard(firstInstance.getHand(2), Card c2);
                noText.append("lets player 2 play a card\n");
                firstInstance.isUno(firstInstance.getHand(1));
                noText.append("Checks if player 1 can declare uno\n");
                firstInstance.isUno(firstInstance.getHand(2));
                noText.append("Checks if player 2 can declare uno\n");
                firstInstance.getHandSize(firstInstance.getHand(1));
                noText.append("this is the size of Player 1's hand\n");
                firstInstance.getHandSize(firstInstance.getHand(2));
                noText.append("this is the size of Player 2's hand\n");
                firstInstance.selectCard(firstInstance.getPlayer1Id());
                noText.append("lets player 1 select a card\n");
                firstInstance.selectCard(firstInstance.getPlayer2Id());
                noText.append("lets player 2 select a card\n");
                firstInstance.declareUno(firstInstance.getPlayer1Id());
                noText.append("Lets player 1 declare uno\n");
                firstInstance.declareUno(firstInstance.getPlayer2Id());
                noText.append("Lets player 2 declare uno\n");
                firstInstance.drawCard(firstInstance.getHand(1));
                noText.append("Player 1 draws a card\n");

                firstInstance.toString();
                fourthInstance.toString();

            }
        });

    }
}