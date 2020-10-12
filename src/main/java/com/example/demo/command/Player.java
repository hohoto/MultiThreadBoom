package com.example.demo.command;

public class Player extends Thread{

    IndexCommand indexCommand;

    public int num;

    public String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public Player(IndexCommand indexCommand,String username){
        this.indexCommand = indexCommand;
        this.username = username;
    }

    public void setNum(int num){
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
