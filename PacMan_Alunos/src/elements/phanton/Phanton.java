package elements.phanton;

import elements.Element;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import utils.Drawing;
import utils.Position;

public abstract class Phanton extends Element {

    public Phanton(String imageName) {
        super(imageName);
    }
    
    public Phanton(ImageIcon image) {
        super(image);
    }
    
    abstract protected void navigation(Position PacManPosition);

    @Override
    public void autoDraw(Graphics g) {
        Drawing.draw(g, this.imageIcon, pos.getY(), pos.getX());
    }
    
}