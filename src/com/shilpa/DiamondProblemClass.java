package com.shilpa;

public class DiamondProblemClass implements DiamondInterface1,DiamondInterface2{
    @Override
    public void name() {
        DiamondInterface1.super.name(); //I am Tom
        //DiamondInterface2.super.name(); //I am Jerry
    }

    public static void main(String[] args) {
        DiamondProblemClass dpc = new DiamondProblemClass();
        dpc.name();
    }
}
