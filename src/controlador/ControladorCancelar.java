/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import calculadora.Principal;
import javax.swing.Icon;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class ControladorCancelar implements MouseListener{
    private JTextField txtnum1;
    private JTextField txtnum2;
    private JTextField txtresultado;

    public ControladorCancelar(JTextField txtnum1, JTextField txtnum2, JTextField txtresultado) {
        this.txtnum1 = txtnum1;
        this.txtnum2 = txtnum2;
        this.txtresultado = txtresultado;
    }
    
            
    @Override
    public void mouseClicked(MouseEvent e) {
        
        txtnum1.setText("");
        txtnum2.setText("");
        txtresultado.setText("");
        txtnum1.grabFocus();
        
        
        JOptionPane.showMessageDialog(txtnum1, " esta seguro que desea limpiar ");
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
