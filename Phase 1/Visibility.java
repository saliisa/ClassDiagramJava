package smd_hw;

public abstract class Visibility {
    private boolean inBackground = false;

    Visibility(){}

    public void changeVisibility(){
        if(inBackground == false){
            inBackground = true;
        } else{
            inBackground = false;
        }
    }
    public boolean isVisible(){
        if(inBackground == true){
            return false;
        } else{
            return true;
        }
    }

}
