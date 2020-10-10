package com.example.demo.command;

public class Player extends Thread{

    IndexCommand indexCommand;

    public double num;

    public Player(IndexCommand indexCommand,String mode){
        this.indexCommand = indexCommand;
    }

    public void setNum(double num){
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void run(){
        if(num>0){
            try{
                indexCommand.subNum(num);
            }catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            Thread.yield();

        }
    }
}
