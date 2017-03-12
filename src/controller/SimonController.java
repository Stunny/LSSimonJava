package controller;

import model.Sequence;
import view.MainView;

import java.awt.*;

/**
 * Created by avoge on 11/03/2017.
 */
public class SimonController{

    private MainView view;

    private Timer timer;

    private int level;

    private int nextColor;

    private Sequence currentSequence;

    public SimonController(MainView view){
        this.view = view;
        nextColor = 0;
        timer = new Timer(view);
    }

    public void startNewGame(){
        setLevel(0);
        nextLevel();
    }

    public void startNewLevel(){
        view.setJlTime(0, 0);
        timer.interrupt();
        timer = new Timer(view);


    }

    public void nextLevel(){

        setLevel(level+1);

        currentSequence = new Sequence(level);

        startNewLevel();
    }

    public void colorPressed(int simonPosition){
        if(!timer.isAlive()) return;

        if(simonPosition == currentSequence.getColor(nextColor)){
            nextColor++;
            if(nextColor == currentSequence.getLength()-1){
                nextColor = 0;
                view.disableColors();
                nextLevel();
            }
        }else{
            endGame();
        }


    }

    public void setLevel(int level){
        this.level = level;
        view.setJlLevel(level);
    }

    public void endGame(){
        view.disableColors();
        setLevel(0);
        timer.interrupt();
        view.setJlTime(0, 0);
    }

}
