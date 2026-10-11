package smd_hw;


//CHECK
public class ShapeAdapter extends Visibility implements ShapeBasic {

    private ShapeSpecial shape;

   public ShapeAdapter(ShapeSpecial s){ //set?
        this.shape = s;
    }

    
    @Override
    public void draw(){
        //The method draw() must call the method drawShape() on the object in question.
        shape.drawShape(); 
    }

    
    @Override
    public void grow(){
        //The method grow() must output the text returned from the method printText() 
        // and the text ", cannot grow", e.g., for an object of the class ShapeDiamond the output would be (see example output).
        String text = printText();
        if(text == "Triangle" || text == "ShapeDiamond"){
            System.out.println(text + ", cannot grow");
        }
    }

    @Override
    public String printText(){
        /*The method printText() must output the text "Triangle", 
        "ShapeDiamond" or "This shape is not supported" depending 
        on the shape in question (study e.g., the operator instanceof). */

        if(shape instanceof Triangle){
            return "Triangle";
        }
        
        if( shape instanceof ShapeDiamond){
            return "ShapeDiamond";
        }
        
        return "This shape is not supported";
    }

    
}
