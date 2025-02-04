

package View;

import javax.swing.*;
import java.awt.*;


public class Ventanas extends JFrame{
   
    //Atribs
    private int numVentana;
    private int anchoVentana;
    private int altoVentana;
    private JFrame ventana;
    
    //Inicializar atribs
    public Ventanas(int numVentana,  JFrame ventana){
        this.numVentana = numVentana;
        /*this.altoVentana = altoVentana;
        this.anchoVentana = anchoVentana;*/
        this.ventana = ventana;
        
    }
    
    public int getNumVentana(){
        return numVentana;
    }
    
    public static void abrirVentana(JFrame ventana,int altoVentana,int anchoVentana){
        //Creacion de panel y ventana
        JPanel panel1 = new JPanel();
        
        //Hacer visible los elementos
        
        
        ventana.setSize(anchoVentana,altoVentana);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Permite cerrar bien
        
    }
   
    
}

