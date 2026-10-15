package smd_hw;

public class ShapeAdapter extends Visibility implements ShapeBasic {
    private ShapeSpecial shape;

    public ShapeAdapter(ShapeSpecial s){
        this.shape = s;
    }

    @Override
    public void draw(){
        shape.drawShape(); 
    }
    
    @Override
    public void grow(){
        System.out.println(printText() + ", cannot grow");
    }

    @Override
    public String printText(){
        if(shape instanceof Triangle){
            return "Triangle";
        }
        
        if( shape instanceof ShapeDiamond){
            return "ShapeDiamond";
        }
        
        return "This shape is not supported";
    }
}