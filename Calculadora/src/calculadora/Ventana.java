/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author estudios
 */
public class Ventana implements ActionListener {
    Operaciones op= new Operaciones();
    String[] sumas, restas, multi, div;
    JFrame marco;
    JPanel panel;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bSuma, bResta, bMulti, bDiv, bLimpa, bResul;
    JTextField texto;
    String formula, completo = "";
    int a, resultado = 0, b;
    Boolean suma, rest, mult, divi;

    Ventana() {
        marco = new JFrame("Claculadora");
        panel = new JPanel();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bResul = new JButton("Resultado");
        bSuma = new JButton("+");
        bResta = new JButton("-");
        bMulti = new JButton("x");
        bDiv = new JButton("/");
        bLimpa = new JButton("Limpa");
        texto = new JTextField();

        marco.setLocation(540, 260);
        marco.setSize(500, 500);
        panel.setLayout(null);
        texto.setBounds(75, 20, 200, 75);
        b1.setBounds(50, 150, 50, 50);
        b2.setBounds(125, 150, 50, 50);
        b3.setBounds(200, 150, 50, 50);
        b4.setBounds(50, 225, 50, 50);
        b5.setBounds(125, 225, 50, 50);
        b6.setBounds(200, 225, 50, 50);
        b7.setBounds(50, 300, 50, 50);
        b8.setBounds(125, 300, 50, 50);
        b9.setBounds(200, 300, 50, 50);
        b0.setBounds(125, 375, 50, 50);
        bSuma.setBounds(275, 150, 50, 50);
        bResta.setBounds(275, 225, 50, 50);
        bMulti.setBounds(275, 300, 50, 50);
        bDiv.setBounds(275, 375, 50, 50);
        bLimpa.setBounds(300, 20, 100, 75);
        bResul.setBounds(350, 375, 100, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bSuma.addActionListener(this);
        bResta.addActionListener(this);
        bMulti.addActionListener(this);
        bDiv.addActionListener(this);
        bLimpa.addActionListener(this);
        bResul.addActionListener(this);

        panel.add(bResul);
        panel.add(bSuma);
        panel.add(bResta);
        panel.add(bMulti);
        panel.add(bDiv);
        panel.add(bLimpa);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b0);
        panel.add(texto);
        marco.add(panel);
        marco.setDefaultCloseOperation(3);
        marco.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o == b1) {
            completo = completo + "1";
            texto.setText(completo);
        } else if (o == b2) {
            completo = completo + "2";
            texto.setText(completo);
        } else if (o == b3) {
            completo = completo + "3";
            texto.setText(completo);
        } else if (o == b4) {
            completo = completo + "4";
            texto.setText(completo);
        } else if (o == b5) {
            completo = completo + "5";
            texto.setText(completo);
        } else if (o == b6) {
            completo = completo + "6";
            texto.setText(completo);
        } else if (o == b7) {
            completo = completo + "7";
            texto.setText(completo);
        } else if (o == b8) {
            completo = completo + "8";
            texto.setText(completo);
        } else if (o == b9) {
            completo = completo + "9";
            texto.setText(completo);
        } else if (o == b0) {
            completo = completo + "0";
            texto.setText(completo);
        } else if (o == bSuma) {
            suma = true;
            completo = completo + "+";
            texto.setText(completo);
        } else if (o == bResta) {
            completo = completo + "-";
            rest = true;
            texto.setText(completo);
        } else if (o == bMulti) {
            mult = true;
            completo = completo + "x";
            texto.setText(completo);
        } else if (o == bDiv) {
            completo = completo + "/";
            texto.setText(completo);
        } else if (o == bLimpa) {
            texto.setText("");
            completo = "";
        } else {
            if (suma == true) {
                sumas = completo.split("\\+");
                for (int i = 0; i < sumas.length; i++) {
                    a = Integer.parseInt(sumas[i]);
                    if (i == 0) {
                        b = a;
                    }
                    resultado=op.suma(a, b);
                    
                }
                texto.setText("" + resultado);
                
                a = 0;
                completo = "";
                suma = false;

            } else if (rest == true) {
                
                restas = completo.split("-");
                for (int i = 0; i < restas.length; i++) {
                    a = Integer.parseInt(restas[i]);
                    if (i == 0) {
                        b = a;
                    }
                    resultado=op.resta(b,a);

                }
                texto.setText("" + resultado);
                
                
                rest = false;
            } else if (mult == true) {
                multi = completo.split("x");
                for (int i = 0; i < multi.length; i++) {
                    a = Integer.parseInt(multi[i]);
                    if (i == 0) {
                        b = a;
                    }
                    resultado = op.multi(b, a);
                }
                texto.setText("" + resultado);
                
                completo = "";
                mult = false;
            } else {

                div = completo.split("/");
                for (int i = 0; i < div.length; i++) {
                    a = Integer.parseInt(div[i]);
                    if (i == 0) {
                        b = a;
                    }
                    resultado = op.div(b, a);
                }
                texto.setText("" + resultado);
                
                completo = "";
                divi = false;

            }

        }

    }
}
