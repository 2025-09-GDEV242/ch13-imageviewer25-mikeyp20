import java.awt.Color;
/**
 * This gives a red tint on a image 
 *
 * @author Michael Patterson 
 * @version (a version number or a date)
 */
public class RedTInt extends Filter
{
    public RedTInt(String name)
    {
        super(name); 
    }
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x,y);
                
                int red = Math.min(255,pix.getRed() + 50);
                
                int green = pix.getGreen();
                int blue = pix.getBlue();
                image.setPixel(x,y,new Color(red,green,blue));
            }
        }
    }
}
