package smd_hw;
//import java.util.List; //delete?
public class ShapeDrawer extends Drawing<ShapeBasic> {
   public ShapeDrawer(){}

    @Override 
    public void draw(){
       // List<ShapeBasic> getShapes = getBasicShapes();
        if(!getBasicShapes().isEmpty()){
            for(ShapeBasic shape: getBasicShapes()){
                shape.draw();
            }
        }else{
            System.out.println("Drawing is empty!");
        }

    }

   //@Override
    public void grow(){
         if(!getBasicShapes().isEmpty()){
            for(ShapeBasic shape: getBasicShapes()){
                shape.grow();
            }
        }else{
            System.out.println("Drawing is empty!");
        }

    }
        //@Override 
    public void showVisibility(){


        int count = 0;
         if(!getBasicShapes().isEmpty()){
            for(ShapeBasic shape: getBasicShapes()){ //returns elements in shapes list
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


/*for(int i = 0; i <getBasicShapes().size(); i++){
                   // if(shape.isVisible()){
                        System.out.println(getBasicShapes().get(i));
                   // }

                } */