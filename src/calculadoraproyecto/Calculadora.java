/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraproyecto;

import java.awt.Color;
import javax.swing.*;


/**
 *
 * @author lautaro
 */
public class Calculadora extends JFrame{
    public Calculadora(){
        this.setSize(500, 500);//Defino el tamaño de la ventana
        //this.setLocation(500, 0);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Defino al accion al cerrar la ventana
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
        this.initComponents();
    }
    
    private void initComponents(){
        //Editando el panel
        JPanel panel = new JPanel();//Creo el panel
        panel.setLayout(null);//Deshabilito los layouts predeterminados de las etiquetas
        this.getContentPane().add(panel);//Agrego el panel a la ventana
        
        
        //Editando el label
        JLabel lbl = new JLabel("Hola mundo");//Creo una etiqueta label
        lbl.setOpaque(true);
        lbl.setSize(100, 10);
        lbl.setBackground(Color.yellow);
        panel.add(lbl);
        
        
        
    }
}
