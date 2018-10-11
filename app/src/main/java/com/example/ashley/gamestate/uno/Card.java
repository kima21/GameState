package com.example.ashley.gamestate.uno;

/**
 * Card Class for Uno
 *
 * @author Andrew, Meredith, Ashley
 * @date October 2018
 */
public class Card {

    int value;
    char type;
    int color;
    String id;

    public Card()
    {
        value = 0;
        type = ' ';
        color = 0;
    }

    public Card(Card card)
    {
        value = getValue();
        type = getType();
        color = getColor();
    }

    public int getValue()
    {
        return value;
    }

    public char getType()
    {
        return type;
    }

    public int getColor()
    {
        return color;
    }

    public String getId(){
        return id;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void setType(char type)
    {
        this.type = type;
    }

    public void setColor(int color)
    {
        this.color = color;
    }

    public void setId(String i) {
        this.id = i;
    }
}