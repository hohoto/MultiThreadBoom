package com.example.demo.command;

public class IndexCommand {

    static boolean ToF;

    static int index = (int)(Math.random()*(150-10)+10);

    public static double getIndex() {
        return index;
    }

    public static boolean isToF() {
        return ToF;
    }

    public synchronized void subNum(double num) throws Exception{
        if(!ToF){
            if((index-=num) < 0 ){
                ToF = true;
            }
            else {
                ToF = false;
            }
        }
    }
}
