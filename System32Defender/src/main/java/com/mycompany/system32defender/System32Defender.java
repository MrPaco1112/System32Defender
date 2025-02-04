

package com.mycompany.system32defender;

import static View.Ventanas.*;
import static View.Imagenes.*;
import static View.Botones.*;
import View.Ventanas;
import View.Imagenes;
import View.Botones;

import java.awt.*;
import javax.swing.*;


public class System32Defender {
    static JFrame ventana1 = new JFrame("System_32 Defender");
    static JPanel panel1 = new JPanel(new BorderLayout());
    static JFrame ventana2 = new JFrame("Acertijo 1");
    static JFrame ventana3 = new JFrame("Acertijo 2");
    static JFrame ventana4 = new JFrame("Acertijo 3");
    static JFrame ventana5 = new JFrame("Acertijo 4");
    static Ventanas menuPrincpl = new Ventanas(1,ventana1);
    static Ventanas acertijo1 = new Ventanas(2,ventana2);
    static JButton boton1 = new JButton("COMENZAR");
    static Botones iniciar = new Botones(1,250,500,boton1);
    static Imagenes pruebita = new Imagenes("C:\\Users\\USUARIO\\OneDrive\\Documentos\\NetBeansProjects\\System32Defender\\JPGs\\GHOSTpng.png",600, 700, 0, 0);
    static JTextArea inicial = new JTextArea("TU COMPUTADORA A SIDO INFECTADA POR EL FANTASMA ROGELIO EL CUAL TE BORRARÁ EL SYSTEM32 A MENOS QUE LO DERROTES EN SUS ACERTIJOS");
    
        
    
    
    public static void main(String[] args) {
        //GestorVentanas.menuPrincipal();
        
    }
}
