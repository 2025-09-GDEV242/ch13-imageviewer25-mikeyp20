import java.awt.Color;
/**
 * Write a description of class GreenTint here.
 *
 * @author Michael Patterson 
 * @version (a version number or a date)
 */
public class GreenTint extends Filter
{
    public GreenTint(String name)
    {
        super(name);
    }
    public void apply(OFImage image)
    {
       int height = image.getHeight();
       int width =  image.getWidth();
       
       for(int y = 0; y < height; y++) {
           for(int x = 0; x < width; x++) {
               Color pix = image.getPixel(x,y);
               
               int green = Math.min(255,pix.getGreen() +50);
               int red = pix.getRed();
               int blue = pix.getBlue();
               image.setPixel(x,y, new Color(red,green,blue));
           }
       }
    }
    
}
