/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jonatanlara.propuesta;

import javax.swing.JProgressBar;

/**
 *
 * @author Usuario1
 */
public class Cargar extends Thread{
    
    JProgressBar progreso;
    
    public Cargar(JProgressBar progreso){
        super();
        this.progreso=progreso;
    }
    public void run(){
        for (int i = 1; i < 100; i++) {
            progreso.setValue(i);
            pausa(30);
            
        }
    }
    public void pausa(int mlSeg){
        try {
            Thread.sleep(mlSeg);
        } catch (Exception e) {
        }
    }
}