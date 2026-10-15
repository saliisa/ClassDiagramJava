package smd_hw;
import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored{
    private double a = 3.0;
    private double b = 3.0;
    private double c = 3.0;
    static private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public Triangle(){} 

    public Triangle(String color){
      setColor(color); 
    }

    public Triangle(double a, double b, double c){
        if(a >= 3.0 && b>= 3.0 && c>=3.0){ 
            this.a = a;
            this.b=b;
            this.c=c;
        }
    }

    public Triangle(double a, double b, double c, String color){
        if(a >= 3.0 && b>= 3.0 && c>=3.0){ 
            this.a = a;
            this.b=b;
            this.c=c;
        }
        setColor(color);
    }

    @Override 
    public double calculateArea(){
        double p = calculatePerimeter()/2;
        double area = Math.sqrt(p*(p-a) * (p-b) * (p-c));
        return area;
    }

    @Override 
    public double calculatePerimeter(){
        return a+b+c;
    }

    @Override 
    public void drawShape(){
        System.out.println(
            "This is a triangle with area: " + df2.format(calculateArea()) + 
            " and perimeter: " + df2.format(calculatePerimeter()) + 
            ". Color: " + getColor());
    }

    @Override 
    public String setColor(String color){
       this.color = CanBeColored.super.setColor(color);
        return this.color;
    }

    @Override 
    public String getColor(){
        return color;
    }
}
