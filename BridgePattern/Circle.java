public class Circle extends Shape{
    
    int rad, x, y;
    public Circle(DrawAPI drawAPI,int rad, int x, int y) {
        super(drawAPI);
        this.rad = rad;
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {
        drawAPI.drawCircle(rad,x,y);
    }
    
}
