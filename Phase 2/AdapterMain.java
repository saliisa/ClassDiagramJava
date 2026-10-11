package smd_hw;

public class AdapterMain {
    public static void main(String[] args){
        ShapeDrawer shapeDrawer = new ShapeDrawer();

        Rectangle rect1 = new Rectangle();
        shapeDrawer.addBasicShape(rect1);

        Rectangle rect2 = new Rectangle();  
        rect2.changeVisibility();
        shapeDrawer.addBasicShape(rect2);

        Circle circ1 = new Circle();
        shapeDrawer.addBasicShape(circ1);

        Circle circ2 = new Circle();
        circ2.changeVisibility();
        shapeDrawer.addBasicShape(circ2);
       
        Rectangle rect3 = new Rectangle();
        shapeDrawer.addBasicShape(rect3);

        Triangle tri1 = new Triangle("Other color");
        ShapeAdapter shapeAdapter = new ShapeAdapter(tri1);
        shapeDrawer.addBasicShape(shapeAdapter);

        ShapeDiamond dia1 = new ShapeDiamond("PURPLE");
        shapeAdapter = new ShapeAdapter(dia1);
        shapeDrawer.addBasicShape(shapeAdapter);

        ShapeDiamond dia2 = new ShapeDiamond("somethingElse");
        shapeAdapter = new ShapeAdapter(dia2);
        shapeAdapter.changeVisibility();
        shapeDrawer.addBasicShape(shapeAdapter);

        ShapeDiamond dia3 = new ShapeDiamond(4.0,4.0);
        dia3.setColor("Yellow");
        shapeAdapter = new ShapeAdapter(dia3);
        shapeAdapter.changeVisibility();
        shapeDrawer.addBasicShape(shapeAdapter);

        Triangle tri2 = new Triangle(6.0,6.0,6.0);
        tri2.setColor("blue");
        shapeAdapter = new ShapeAdapter(tri2);
        shapeAdapter.changeVisibility(); 
        shapeDrawer.addBasicShape(shapeAdapter);

        ShapeDiamond dia4 = new ShapeDiamond(1.0,1.0,"Green");
        shapeAdapter = new ShapeAdapter(dia4);
        shapeDrawer.addBasicShape(shapeAdapter);
       
        shapeDrawer.draw();
        shapeDrawer.grow();

        shapeDrawer.showVisibility();
    }
}
