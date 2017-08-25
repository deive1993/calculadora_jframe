/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datos.DAOCalculadora;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ControladorAceptar implements MouseListener{
    private JTextField txtnum1;
    private JTextField txtnum2;
    private JTextField txtresultado;

    public ControladorAceptar(JTextField txtnum1, JTextField txtnum2, JTextField txtresultado) {
        this.txtnum1 = txtnum1;
        this.txtnum2 = txtnum2;
        this.txtresultado = txtresultado;
    }

    public void setTxtnum1(JTextField txtnum1) {
        this.txtnum1 = txtnum1;
    }

    public void setTxtnum2(JTextField txtnum2) {
        this.txtnum2 = txtnum2;
    }

    public void setTxtresultado(JTextField txtresultado) {
        this.txtresultado = txtresultado;
    }
    
       
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
      int num1,num2,rst;
      num1= Integer.parseInt(txtnum1.getText());
      num2= Integer.parseInt(txtnum2.getText());
      rst=num1+num2;
      
      txtresultado.setText(""+rst);
      
    }

    @Override
    public void mousePressed(MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
