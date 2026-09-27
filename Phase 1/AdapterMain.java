package smd_hw;

public class AdapterMain {
    public static void main(String[] args){
        ShapeDrawer shapeDrawer = new ShapeDrawer();

        Rectangle rect1 = new Rectangle();
        shapeDrawer.addBasicShape(rect1);
        rect1.isVisible();

        Rectangle rect2 = new Rectangle();
        shapeDrawer.addBasicShape(rect2);
        rect2.changeVisibility();

        Circle circ1 = new Circle();
        shapeDrawer.addBasicShape(circ1);
    

        Circle circ2 = new Circle();
        shapeDrawer.addBasicShape(circ2);
        circ2.changeVisibility();

        Rectangle rect3 = new Rectangle();
        shapeDrawer.addBasicShape(rect3);

        shapeDrawer.draw();
        shapeDrawer.grow();

        shapeDrawer.showVisibility();
    }
}
