public class ShapeMaker {
    private Shape Circle;
    private Shape Square;
    private Shape Rectangle;

    public ShapeMaker() {
        Circle = new Circle();
        Square = new Square();
        Rectangle = new Rectangle();
    }

    public void drawCircle() {
        Circle.draw();
    }
    public void drawRectangle() {
        Rectangle.draw();
    }
    public void drawSquare() {
        Square.draw();
    }
}
