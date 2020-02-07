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
        this.setSize(500, 500);
        //this.setLocation(500, 0);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
        this.initComponents();
    }
    
    private void initComponents(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setSize(400, 333);
        panel.setForeground(Color.yellow);
        
    }
}
