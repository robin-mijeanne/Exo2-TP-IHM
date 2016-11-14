package com.example.robin.exo2_tp;

/**
 * Created by robin on 08/11/16.
 */

public class Case {
    private int color;
    private String pseudo;
    private String text;

    public Case(int color, String pseudo, String text) {
        this.color = color;
        this.pseudo = pseudo;
        this.text = text;
    }

    public int getColor() {
        return color;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getText() {
        return text;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setText(String text) {
        this.text = text;
    }
}