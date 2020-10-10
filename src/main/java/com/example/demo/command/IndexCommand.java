package com.example.demo.command;

public class IndexCommand {

    static boolean ToF = false;

    static double index = Math.random()*(150-10)+10;

    public static double getIndex() {
        return index;
    }

    public static boolean isToF() {
        return ToF;
    }

    public synchronized void subNum(double num) throws Exception{
        if(index<0){
            ToF = true;
        }
        index -= num;
        ToF = false;
    }
}
