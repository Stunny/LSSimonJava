package model;

import controller.MainController;
import controller.SimonController;
import view.MainView;

/**
 *
 * Created by avoge on 11/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        MainView mv = new MainView();
        mv.setVisible(true);

        SimonController sc = new SimonController(mv);
        MainController controller = new MainController(sc);
        mv.registerController(controller);
    }

}
