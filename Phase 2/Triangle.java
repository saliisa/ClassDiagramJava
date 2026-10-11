package smd_hw;

import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored{
    private double a = 3.0;
    private double b = 3.0;
    private double c = 3.0;

    static private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";


    public Triangle(){} //set?

    public Triangle(String c){
        this.color = setColor(c); //correct meh?
    }//set?

    public Triangle(double a, double b, double c){
        //Note that the double type parameters for the Triangle constructors (receiving the double values) must be greater than or equal to 3.0 (i.e., min values are 3.0, 3.0 and 3.0, any lower value will be ignored).
        if(a >= 3.0 && b>= 3.0 && c>=3.0){ //exception?
            this.a = a;
            this.b=b;
            this.c=c;
        }
    }

     public Triangle(double a, double b, double c, String color){
        //Note that the double type parameters for the Triangle constructors (receiving the double values) must be greater than or equal to 3.0 (i.e., min values are 3.0, 3.0 and 3.0, any lower value will be ignored).
        if(a >= 3.0 && b>= 3.0 && c>=3.0){ //exception?
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
        //Note that the class utilizes the DecimalFormat class for the output, see tutorial.
        System.out.println("This is a triangle with area: " + df2.format(calculateArea()) + " and perimeter: " + df2.format(calculatePerimeter()) + ". Color: " + getColor());
    }

    @Override 
    public String setColor(String c){ //explain + research more
       this.color = CanBeColored.super.setColor(c);
        return this.color;

    }

    @Override 
    public String getColor(){
        return color;
    }







}
