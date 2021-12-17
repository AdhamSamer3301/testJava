package Factory;

public class ShapeFactory {

    //#region method 1
    // public Shape getShape(String shape) {
        
    //     if (shape.equalsIgnoreCase("Circle")) {
    //         Factory.Circle circle = new Factory.Circle();
    //         circle.draw();
    //         return circle;
    //     } else if (shape.equalsIgnoreCase("Square")){
    //         Factory.Square square = new Factory.Square();
    //         square.draw();
    //         return square;
    //     }
        
    //     return null;
    // }
    //#endregion

    public void getShape(String shape){
        if (shape.equalsIgnoreCase("circle")) {
            Factory.Circle c = new Factory.Circle();
            c.draw();
        } else if (shape.equalsIgnoreCase("square")) {
            Factory.Square s = new Factory.Square();
            s.draw();
        } else {
            System.out.println("Not Found !");
        }
    }
}
