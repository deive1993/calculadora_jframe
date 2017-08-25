/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ControladorDividir implements MouseListener{
    private JTextField txtnum1;
    private JTextField txtnum2;
    private JTextField txtresultado;

    public ControladorDividir(JTextField txtnum1, JTextField txtnum2, JTextField txtresultado) {
        this.txtnum1 = txtnum1;
        this.txtnum2 = txtnum2;
        this.txtresultado = txtresultado;
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        int num1,num2,rst;
        num1=Integer.parseInt(txtnum1.getText());
        num2=Integer.parseInt(txtnum2.getText());
        rst=num1/num2;
        txtresultado.setText("" + rst);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
