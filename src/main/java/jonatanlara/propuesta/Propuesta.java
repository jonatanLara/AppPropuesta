/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jonatanlara.propuesta;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author @JonatanLara
 */
public class Propuesta {

    public static void main(String[] args) {
        
        Runnable mRun = () ->{
            Splash splash = new Splash();
            splash.setVisible(true);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Propuesta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            splash.dispose();
            Main login = new Main();
            login.setVisible(true);
        };
        
        Thread mHiloSplash = new Thread(mRun);
        mHiloSplash.start();
        /*
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }*/
    }
}
