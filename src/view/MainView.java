package view;

import controller.MainController;
import model.Sequence;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by avoge on 11/03/2017.
 */
public class MainView extends JFrame{

    private static final String FRAME_TITLE = "LS Simon";
    private static final int FRAME_HEIGHT = 500;
    private static final int FRAME_WIDTH = 500;

    private static final String TIME_FORMAT = "%1$02d:%2$02d";

    // Elementos de control e informacion
    private JLabel jlTime;
    private JLabel jlLevel;
    private JButton jbStartGame;

    private ArrayList<JButton> colorButtons;

    //Botones de colores de Simon Says
    private JButton jbRed;
    private JButton jbBlue;
    private JButton jbYellow;

    private JButton jbGreen;
    private JButton jbPink;
    private JButton jbEmerald;

    private JButton jbPurple;
    private JButton jbCyan;
    private JButton jbOrange;

    public MainView(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(FRAME_TITLE);
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
        setResizable(false);

        configureInfoPanel();
        configureGamePanel();
        groupButtons();
    }

    public void registerController(MainController controller){

        jbStartGame.setActionCommand(MainController.ACTION_START);
        jbStartGame.addActionListener(controller);

        jbRed.setActionCommand(MainController.ACTION_RED);
        jbBlue.setActionCommand(MainController.ACTION_BLUE);
        jbYellow.setActionCommand(MainController.ACTION_YELLOW);
        jbGreen.setActionCommand(MainController.ACTION_GREEN);
        jbPink.setActionCommand(MainController.ACTION_PINK);
        jbEmerald.setActionCommand(MainController.ACTION_EMERALD);
        jbPurple.setActionCommand(MainController.ACTION_PURPLE);
        jbCyan.setActionCommand(MainController.ACTION_CYAN);
        jbOrange.setActionCommand(MainController.ACTION_ORANGE);

        jbRed.addActionListener(controller);
        jbBlue.addActionListener(controller);
        jbYellow.addActionListener(controller);
        jbGreen.addActionListener(controller);
        jbPink.addActionListener(controller);
        jbEmerald.addActionListener(controller);
        jbPurple.addActionListener(controller);
        jbCyan.addActionListener(controller);
        jbOrange.addActionListener(controller);

    }

    private void configureInfoPanel() {

        JPanel jpNorthPanel = new JPanel(new GridLayout(1, 3));
        add(jpNorthPanel, BorderLayout.NORTH);

        // Panel de timepo de partida

        JPanel jpTime = new JPanel();
        JLabel jlAuxTime = new JLabel("Time: ");
        jlTime = new JLabel("00:00");

        jpTime.add(jlAuxTime);
        jpTime.add(jlTime);
        jpNorthPanel.add(jpTime);

        // Panel de nivel de partida

        JPanel jpLevel = new JPanel();
        JLabel jlAuxLevel = new JLabel("Level: ");
        jlLevel = new JLabel("--");

        jpLevel.add(jlAuxLevel);
        jpLevel.add(jlLevel);
        jpNorthPanel.add(jpLevel);

        // Panel de boton de inicio de partida

        JPanel jpStart = new JPanel(new BorderLayout());
        jbStartGame = new JButton("Start Game");

        jpStart.add(jbStartGame, BorderLayout.CENTER);
        jpNorthPanel.add(jpStart);

    }

    private void configureGamePanel(){

        JPanel jpColorsPanel = new JPanel(new GridLayout(3, 3));
        add(jpColorsPanel, BorderLayout.CENTER);

        jbRed = new JButton();
        jbRed.setBackground(Color.GRAY);
        jpColorsPanel.add(jbRed);

        jbBlue = new JButton();
        jbBlue.setBackground(Color.GRAY);
        jpColorsPanel.add(jbBlue);

        jbYellow = new JButton();
        jbYellow.setBackground(Color.GRAY);
        jpColorsPanel.add(jbYellow);

        jbGreen = new JButton();
        jbGreen.setBackground(Color.GRAY);
        jpColorsPanel.add(jbGreen);

        jbPink = new JButton();
        jbPink.setBackground(Color.GRAY);
        jpColorsPanel.add(jbPink);

        jbEmerald = new JButton();
        jbEmerald.setBackground(Color.GRAY);
        jpColorsPanel.add(jbEmerald);

        jbPurple = new JButton();
        jbPurple.setBackground(Color.GRAY);
        jpColorsPanel.add(jbPurple);

        jbCyan = new JButton();
        jbCyan.setBackground(Color.GRAY);
        jpColorsPanel.add(jbCyan);

        jbOrange = new JButton();
        jbOrange.setBackground(Color.GRAY);
        jpColorsPanel.add(jbOrange);

    }

    private void groupButtons(){

        colorButtons = new ArrayList<>();
        colorButtons.add(jbRed);
        colorButtons.add(jbBlue);
        colorButtons.add(jbYellow);
        colorButtons.add(jbGreen);
        colorButtons.add(jbPink);
        colorButtons.add(jbEmerald);
        colorButtons.add(jbPurple);
        colorButtons.add(jbCyan);
        colorButtons.add(jbOrange);

    }

    public void enableColors(){
        jbRed.setBackground(SimonColors.RED);
        jbBlue.setBackground(SimonColors.BLUE);
        jbYellow.setBackground(SimonColors.YELLOW);
        jbGreen.setBackground(SimonColors.GREEN);
        jbPink.setBackground(SimonColors.PINK);
        jbEmerald.setBackground(SimonColors.EMERALD);
        jbPurple.setBackground(SimonColors.PURPLE);
        jbCyan.setBackground(SimonColors.CYAN);
        jbOrange.setBackground(SimonColors.ORANGE);
    }

    public void disableColors(){
        jbRed.setBackground(Color.GRAY);
        jbBlue.setBackground(Color.GRAY);
        jbYellow.setBackground(Color.GRAY);
        jbGreen.setBackground(Color.GRAY);
        jbPink.setBackground(Color.GRAY);
        jbEmerald.setBackground(Color.GRAY);
        jbPurple.setBackground(Color.GRAY);
        jbCyan.setBackground(Color.GRAY);
        jbOrange.setBackground(Color.GRAY);
    }

    public String getTime(){
        return jlTime.getText();
    }

    public void setJlTime(int mins, int secs) {
        jlTime.setText(String.format(TIME_FORMAT, mins, secs));
    }

    public void setJlLevel(int level) {
        if(level == 0){
            jlLevel.setText("--");
            return;
        }

        jlLevel.setText(Integer.toString(level));
    }

    public ArrayList<JButton> getColorButtons(){return colorButtons;}

}
