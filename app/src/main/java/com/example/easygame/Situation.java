package com.example.easygame;

public class Situation {
    public Situation[] direction;
    String subject,text;
    int dHealth,dFatigue,dPanic;
    public Situation (String subject, String text, int variants, int dh,int df,int dp) {
        this.subject=subject;
        this.text=text;
        dHealth=dh;
        dFatigue=df;
        dPanic=dp;
        direction=new Situation[variants];
    }
}

