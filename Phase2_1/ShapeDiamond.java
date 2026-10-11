package smd_hw;
import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored {
    private double a = 2.0;
    private double b = 2.0;
    static private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public ShapeDiamond(){}

    public ShapeDiamond(String color){
        setColor(color); 
    }

    public ShapeDiamond(double a, double b){
        if(a >= 2.0 && b >= 2.0){
            this.a = a;
            this.b=b;
        }
    }

    public ShapeDiamond(double a, double b, String c){
        if(a >= 2.0 && b >= 2.0){ 
            this.a = a;
            this.b=b;
        }
        setColor(c);
    }

    @Override
    public double calculateArea(){ 
        return a*b;
    }

    @Override
    public double calculatePerimeter(){
       return (2*a) + (2*b);
    }

    @Override
    public void drawShape(){
        System.out.println(
            "This is a diamond shape with area: " + df2.format(calculateArea()) + 
            " and perimeter: " + df2.format(calculatePerimeter()) + 
            ". Color: " + getColor() );
    }

    @Override
    public String setColor(String color){ 
        this.color = CanBeColored.super.setColor(color);
        return this.color;
    }

    @Override
    public String getColor(){
        if(color.equals("No color")){
            return "The shape is not colored";
        }
        return color;
    }
}