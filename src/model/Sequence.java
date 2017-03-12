package model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by avoge on 11/03/2017.
 */
public class Sequence {

    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int YELLOW = 2;
    public static final int GREEN = 3;
    public static final int PINK = 4;
    public static final int EMERALD = 5;
    public static final int PURPLE = 6;
    public static final int CYAN = 7;
    public static final int ORANGE = 8;

    private ArrayList<Integer> sequence;

    public Sequence(){
        sequence = new ArrayList<>();
    }

    public Sequence(int length){

        Random randomizer = new Random(System.currentTimeMillis());

        sequence = new ArrayList<>();

        for(int i = 0; i < length; i++){
            sequence.add(randomizer.nextInt(9));
        }
    }

    public int getLength(){return sequence.size();}

    public int getColor(int index){return sequence.get(index);}

    public void addColor(int simonPosition){
        sequence.add(simonPosition);
    }

}
