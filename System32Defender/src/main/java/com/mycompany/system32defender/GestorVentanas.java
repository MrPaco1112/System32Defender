
package com.mycompany.system32defender;

import static com.mycompany.system32defender.System32Defender.*;
import java.awt.*;
import javax.swing.*;


public class GestorVentanas {
    public static void menuPrincipal(){
        menuPrincpl.abrirVentana(ventana1,1000,1000);
        boton1.addActionListener(e -> { iniciar.cerrarVentana(ventana1,menuPrincpl)
                ;iniciar.cambiarVentana(ventana2,acertijo1);
        });
        JPanel botonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Centra el botón
        botonPanel.add(boton1);
        JPanel imgPanel1 = new JPanel(new BorderLayout());
        imgPanel1.setPreferredSize(new Dimension(600, 700));  // Tamaño fijo para la imagen
        imgPanel1.add(pruebita, BorderLayout.CENTER);
        panel1.add(botonPanel,BorderLayout.CENTER);
        //boton1.setVisible(true);
        panel1.add(imgPanel1,BorderLayout.NORTH);
        panel1.add(inicial);
        ventana1.add(panel1);
        
        ventana1.revalidate();
        ventana1.repaint();
    }
    public static void acertijo1(){
        
    }
    public static void acertijo2(){
        
    }
    public static void acertijo3(){
        
    }
    public static void acertijo4(){
        
    }
}
