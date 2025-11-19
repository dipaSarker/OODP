public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType==null)return null;
        if(shapeType.equalsIgnoreCase("circle")) return new Circle();
        else if(shapeType.equalsIgnoreCase("rectangle")) return new Rectangle();
        else if(shapeType.equalsIgnoreCase("Square")) return new Square();
        else {
            System.out.println("Wrong Shape.");
            return null;
        }
    }
}
