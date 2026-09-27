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

    public List<T> getBasicShapes(){ //returns a new list of the elements...
       List<T> newShapes = new ArrayList<>(shapes);
       return newShapes;
    }

    public abstract void draw();
    
}

/* a. The method should have modifier ⟨abstract⟩          (1 match)
 b. The method should have name ⟨draw⟩                  (1 match)
 c. The method should have parameter count ⟨0⟩          (2 matches)
 d. The method should have visibility modifier ⟨public⟩ (2 matches) */