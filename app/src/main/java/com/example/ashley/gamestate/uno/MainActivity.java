package com.example.ashley.gamestate.uno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    }

    public void onClick(View button){
        //TODO
    }

        //TODO fix the button ID
//need to find the listener
        State gameState = new State();
        //After creating the listener, I have to connect it
        Button runTestButton = (Button)findViewById(R.id.runButton);




    }

