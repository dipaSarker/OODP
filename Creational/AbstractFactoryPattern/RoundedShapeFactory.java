public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("rectangle")) return new RoundedRectangle();
        else if(shapeType.equalsIgnoreCase("Square")) return new RoundedSquare();
        else {
            System.out.println("Wrong Shape.");
            return null;
        }
    }
}
