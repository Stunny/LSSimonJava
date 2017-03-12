package controller;

import model.Sequence;
import view.MainView;

/**
 * Created by avoge on 12/03/2017.
 */
public class SequencePlayer extends Thread {

    private MainView mainView;

    private Sequence sequence;

    private Timer timer;

    public SequencePlayer(MainView view, Sequence currentSequence, Timer timer){

        mainView = view;
        sequence = currentSequence;
        this.timer = timer;
    }

    public void run(){


        mainView.enableColors();

        timer.start();
    }

}
