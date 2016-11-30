
package stickymemories;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author andre
 */
public class Constants {
    public static String STICKY_MEMORIES_TITLE = "Sticky Memories";
    
    public static final String OPTIONS_FILE_NAME = "optionsFile.bin";
    
    public static final String MAIN_PANEL = "main_panel";
    public static final String OPTIONS_PANEL = "options_panel";
    
    public static final String ON_TEXT = "ON";
    public static final String OFF_TEXT = "OFF";
    
    public static final String UP_TEXT = "Up";
    public static final String DOWN_TEXT = "Down";
    
    public static String PATH_IMG_BACK_SIGN = "images/back_sign.png";
    public static String PATH_IMG_PLUS_SIGN = "images/plus_sign.png";
    public static String PATH_IMG_MINUS_SIGN = "images/minus_sign.png";
    public static String PATH_IMG_EDIT_SIGN = "images/edit_sign.png";
    public static String PATH_IMG_HELP_SIGN = "images/help_sign.png";
    public static String PATH_IMG_OPTIONS_SIGN = "images/options_sign.png";
    public static String PATH_IMG_UP_SIGN = "images/up_sign.png";
    public static String PATH_IMG_DOWN_SIGN = "images/down_sign.png";
    
    public static String PATH_IMG_DEFFAULT_IMAGE = "images/deffault_img.png";
    
    public static String PATH_IMG_EXCLAMATION_SIGN = "images/exclamation_sign.png";
    
    public static ImageIcon getButtonImageIcon(String path) {
        try {
            return new ImageIcon(ImageIO.read(Resources.getResourceFile(path)).getScaledInstance(25, 25,java.awt.Image.SCALE_SMOOTH ));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ImageIcon getSelectedImageIcon(int mode, String path) {
        //mode -> 0 classPath; 1 fullPath
        try {
            if(mode == 0)
                return new ImageIcon(ImageIO.read(Resources.getResourceFile(path)).getScaledInstance(190, 175,java.awt.Image.SCALE_SMOOTH ));
            else
                return new ImageIcon(ImageIO.read(new File(path)).getScaledInstance(160, 160,java.awt.Image.SCALE_SMOOTH));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
