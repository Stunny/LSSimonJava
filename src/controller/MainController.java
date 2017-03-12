package controller;

import model.Sequence;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by avoge on 11/03/2017.
 */
public class MainController implements ActionListener{

    public static final String ACTION_START = "START";

    public static final String ACTION_RED = "RED";
    public static final String ACTION_BLUE = "BLUE";
    public static final String ACTION_YELLOW = "YELLOW";
    public static final String ACTION_GREEN = "GREEN";
    public static final String ACTION_PINK = "PINK";
    public static final String ACTION_EMERALD = "EMERALD";
    public static final String ACTION_PURPLE = "PURPLE";
    public static final String ACTION_CYAN = "CYAN";
    public static final String ACTION_ORANGE = "ORANGE";

    private SimonController sc;

    public MainController(SimonController sc){
        this.sc= sc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch(e.getActionCommand()){

            case ACTION_START:
                sc.startNewGame();
                break;

            case ACTION_RED:
                sc.colorPressed(Sequence.RED);
                break;
            case ACTION_BLUE:
                sc.colorPressed(Sequence.BLUE);
                break;
            case ACTION_YELLOW:
                sc.colorPressed(Sequence.YELLOW);
                break;
            case ACTION_GREEN:
                sc.colorPressed(Sequence.GREEN);
                break;
            case ACTION_PINK:
                sc.colorPressed(Sequence.PINK);
                break;
            case ACTION_EMERALD:
                sc.colorPressed(Sequence.EMERALD);
                break;
            case ACTION_PURPLE:
                sc.colorPressed(Sequence.PURPLE);
                break;
            case ACTION_CYAN:
                sc.colorPressed(Sequence.CYAN);
                break;
            case ACTION_ORANGE:
                sc.colorPressed(Sequence.ORANGE);
                break;

        }

    }
}
