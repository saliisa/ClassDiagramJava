package smd_hw;

public class ShapeDrawer extends Drawing<ShapeBasic> {
   public ShapeDrawer(){}

    @Override 
    public void draw(){
        if(!getBasicShapes().isEmpty()){
            for(ShapeBasic shape: getBasicShapes()){
                shape.draw();
            }
        }else{
            System.out.println("Drawing is empty!");
        }

    }
 
    public void grow(){
         if(!getBasicShapes().isEmpty()){
            for(ShapeBasic shape: getBasicShapes()){
                shape.grow();
            }
        }else{
            System.out.println("Drawing is empty!");
        }
    }

    public void showVisibility(){
        int count = 0;
         if(!getBasicShapes().isEmpty()){
            for(ShapeBasic shape: getBasicShapes()){
                count++; 
                System.out.print(count + ". "); 
                
                if(shape.isVisible()){
                    System.out.println("shape is visible: " + shape.printText());
                } else{
                    System.out.println("shape is in the background: " + shape.printText());
                }       
           }
            System.out.println("Total number of shapes: " + count);
 
        }else{
            System.out.println("Drawing is empty!");
        }
    } 
}