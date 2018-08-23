import java.awt.*;

public class Main implements Myshape
{
    protected int height;
    protected int width;
    protected Color color;
    public MyTriangle(int width, int height, Color color)
    {
        this.height = height;
        this.width= width;
        this.color= color;


    }
    public void drawMe(Graphics g, Point location)
    {
        g.setColor(color);
        g.drawLine((int) location.getX(), (int) location.getY(), width, height);


    }
}

