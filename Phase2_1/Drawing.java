package smd_hw;

import java.util.ArrayList;
import java.util.List;

public abstract class Drawing<T> {

    private List<T> shapes = new ArrayList<>();

    public Drawing(){}

    public void addBasicShape(T T){
        if(T!= null){
            shapes.add(T);
        }
    }

    public List<T> getBasicShapes(){
       List<T> newShapes = new ArrayList<>(shapes);
       return newShapes;
    }

    public abstract void draw();
    
}
