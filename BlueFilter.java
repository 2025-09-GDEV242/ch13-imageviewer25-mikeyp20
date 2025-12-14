import java.awt.Color;
/**
 * This shows a gray scale of a image from blue RGB
 *
 * @author Michael Patterson 
 * @version (a version number or a date)
 */
public class BlueFilter extends Filter
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class BlueFilter
     */
    public BlueFilter(String name )
    {
        super(name);
    }

    
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        
        for(int y = 0; y< height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x,y);
                int gray = pix.getBlue();
                image.setPixel(x,y, new Color(gray, gray,gray));
            }
        }
    }
}
