package com.example.ashley.gamestate;

import android.graphics.Color;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class Card {
    private int color;
    private int value;
    private char type;

    public Card(){
        color = 0;
        value = 0;
        type = ' ';
    }

    public int getColor() {
        return color;
    }

    public void setColor(int c) {
        color = c;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int v) {
        value = v;
    }

    public char getType() {
        return type;
    }

    public void setType(char t) {
        type = t;
    }

}