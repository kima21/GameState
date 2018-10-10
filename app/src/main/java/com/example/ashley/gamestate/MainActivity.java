package com.example.ashley.gamestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Main Activity Class for Uno
 *
 * @author Andrew, Meredith, Ashley
 * @date October 2018
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View button){
        //TODO
    }

        //TODO fix the button ID
//need to find the listener
        GameState gameState = new GameState();
        //After creating the listener, I have to connect it
        Button runTestButton = (Button)findViewByID(R.id.runTestButton);




    }

