/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controlador.ControladorAceptar;
import controlador.ControladorCancelar;
import controlador.ControladorDividir;
import controlador.ControladorMultiplicar;
import controlador.ControladorRestar;
import controlador.ControladorWindowsCalculadora;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Calculadora extends JFrame{
    private JButton aceptar = new JButton("SUMAR");
    private JButton cancelar = new JButton("LIMPIAR");
    private JButton restar = new JButton("RESTAR");
    private JButton multiplicar = new JButton("MULTIPLICAR");
    private JButton dividir = new JButton("DIVIDIR");
    private JLabel lblnum1 = new JLabel("ingrese primer numero");
    private JLabel lblnum2 = new JLabel("ingrese segundo numero");
    private JLabel lblnum3 = new JLabel("resultado");
    private JTextField txtnum1 = new JTextField("");
    private JTextField txtnum2 = new JTextField("");
    private JTextField txtresultado = new JTextField("");
    private GridLayout contenedor = new GridLayout(6,2);
    private ControladorWindowsCalculadora controladorWindowsCalculadora = new ControladorWindowsCalculadora();
    private ControladorAceptar controladorAceptar = new ControladorAceptar(txtnum1,txtnum2,txtresultado);
    private ControladorCancelar controladorCancelar = new ControladorCancelar(txtnum1,txtnum2,txtresultado);
    private ControladorRestar controladorRestar = new ControladorRestar(txtnum1,txtnum2,txtresultado);
    private ControladorMultiplicar controladorMultiplicar = new ControladorMultiplicar(txtnum1,txtnum2,txtresultado);
    private ControladorDividir controladorDividir = new ControladorDividir(txtnum1,txtnum2,txtresultado);
    
    public Calculadora (){
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setSize(300, 200);
        this.setTitle("CALCULADORA");
        this.setLocation(200, 200);
        this.setVisible(true);
        this.setBackground(Color.yellow);
        this.aceptar.addMouseListener(controladorAceptar);
        this.restar.addMouseListener(controladorRestar);
        this.multiplicar.addMouseListener(controladorMultiplicar);
        this.cancelar.addMouseListener(controladorCancelar);
        this.dividir.addMouseListener(controladorDividir);

        
    }

    private void agregarComponentes() {
        this.add(lblnum1);
        this.add(txtnum1);
        this.add(lblnum2);
        this.add(txtnum2);
        this.add(lblnum3);
        this.add(txtresultado);
        this.add(restar);
        this.add(multiplicar);
        this.add(dividir);
        this.add(aceptar);
        this.add(cancelar);
    }
    
    
}
