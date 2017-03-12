package controller;

import view.MainView;

/**
 * Created by avoge on 11/03/2017.
 */
public class Timer extends Thread {

    private MainView view;

    public Timer(MainView view){
        this.view = view;
    }

    public void run(){

        String[] time = view.getTime().split(":");

        int minutes = Integer.parseInt(time[0]);
        int seconds = Integer.parseInt(time[1]);
        try {
            while(true){
                sleep(1000);
                if(seconds == 59){
                    seconds = 0;
                    minutes++;
                }else{
                    seconds++;
                }
                view.setJlTime(minutes,seconds);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
