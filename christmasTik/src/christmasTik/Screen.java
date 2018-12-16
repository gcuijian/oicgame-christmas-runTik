package christmasTik;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class Screen {

	public Color getScreenPixel(int x, int y) throws AWTException { // 函数返回值为颜色的RGB值。  
        Robot rb = null; // java.awt.image包中的类，可以用来抓取屏幕，即截屏。  
        rb = new Robot();  
        Toolkit tk = Toolkit.getDefaultToolkit(); // 获取缺省工具包  
        Dimension di = tk.getScreenSize(); // 屏幕尺寸规格  
//        System.out.println("("+di.width);  
//        System.out.print(","+di.height+")");  
        Rectangle rec = new Rectangle(0, 0, di.width, di.height);  
        BufferedImage bi = rb.createScreenCapture(rec);  
        int pixelColor = bi.getRGB(x, y);  
        Color color = new Color(16777216 + pixelColor);
        return color; // pixelColor的值为负，经过实践得出：加上颜色最大值就是实际颜色值。  
    } 
	
}
