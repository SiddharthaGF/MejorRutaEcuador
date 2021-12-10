package com.siddhartha.interfaz;

import com.siddhartha.clases.DiccionarioCiudades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton btnCalcular;
    private JPanel panel;
    DiccionarioCiudades obj = new DiccionarioCiudades();

    public GUI() {
        this.setContentPane(panel);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.pack();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inicio = (String) comboBox1.getSelectedItem();
                String fin = (String) comboBox2.getSelectedItem();
                String distancia = obj.Calcular(inicio, fin);
                String ruta = obj.Recorrido();
                Alerta(distancia + "\n\nRuta a seguir:\n" + ruta);
            }
        });
    }

    private static void Alerta(String Mensaje) {
        JOptionPane.showMessageDialog(null, Mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

}
