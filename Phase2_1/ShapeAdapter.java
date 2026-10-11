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
        String text = printText();
        if(text.equals("Triangle") || text.equals("ShapeDiamond")){
            System.out.println(text + ", cannot grow");
        }
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