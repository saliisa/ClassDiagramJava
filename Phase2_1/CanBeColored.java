package smd_hw;

public interface CanBeColored {
    default public String setColor(String c){ 
        if(c != null && !c.isEmpty()){
           c = c.substring(0,1).toUpperCase() + c.substring(1).toLowerCase();
            if(c.equals("Blue") || c.equals("Green")  || c.equals("Red")|| c.equals("Yellow")){
                return c;
            }
        }
        return "No color";
    }
    public abstract String getColor();
}
