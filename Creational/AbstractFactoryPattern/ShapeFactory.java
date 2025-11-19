public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("rectangle")) return new Rectangle();
        else if(shapeType.equalsIgnoreCase("Square")) return new Square();
        else {
            System.out.println("Wrong Shape.");
            return null;
        }
    }
}
