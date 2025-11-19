public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("Rectangle");
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        shape2.draw();
        shapeFactory = FactoryProducer.getFactory(true);
        shape1 = shapeFactory.getShape("Rectangle");
        shape2 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        shape2.draw();
    }
}
