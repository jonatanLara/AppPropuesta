/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jonatanlara.propuesta;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Usuario1
 */
public class ImageDecore extends JLabel{
   private final int width;
   private final int height;
   private final String path;
   
   public ImageDecore(JPanel panel, String path){
       this.path = path;
       this.width = panel.getWidth();
       this.height = panel.getHeight();
       this.setSize(width,height);
   }
   @Override
   public void paint(Graphics graphics){
       ImageIcon Img = new ImageIcon(getClass().getResource(path));
       graphics.drawImage(Img.getImage(), 0, 0 , width, height, null);
   }
}
