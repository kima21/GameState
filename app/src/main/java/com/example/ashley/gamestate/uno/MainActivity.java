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

    public TextView noText;

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

        noText = (TextView)findViewById(R.id.editText);
        noText.setOnClickListener(this);

        Button runTestButton = (Button)findViewById(R.id.runButton);

    }

    /** When program starts, EditText gets set to empty
     *
     * @param v
     */
    @Override
    public void onClick(View v){
        noText.setText("");

        State firstInstance = new State();



    }





}

