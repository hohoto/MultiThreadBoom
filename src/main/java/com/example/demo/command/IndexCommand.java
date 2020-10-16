package com.example.demo.command;

public class IndexCommand {

    static boolean ToF;

    static int index = (int)(10+Math.random()*(20-10+1));

    public static double getIndex() {
        return index;
    }

    public static boolean isToF() {
        return ToF;
    }

    public synchronized void subNum(double num){
        if(!ToF){
            if((index+=num) >= 100 ){
                ToF = true;
            }
            else {
                ToF = false;
            }
        }
    }
}
