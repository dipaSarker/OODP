public class RedCircle implements DrawAPI{
    
    @Override
    public void drawCircle(int rad, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + rad + ", x: " + x + ", " + y + "]");
    }
}
