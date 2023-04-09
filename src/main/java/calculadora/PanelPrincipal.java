package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class PanelPrincipal extends JPanel implements ActionListener {


    private PanelBotones botonera;
    private JTextArea areaTexto;
    private int tipoOperacion;


    public PanelPrincipal(){
        initComponents();
        tipoOperacion = -1;
    }


    private void initComponents(){

        botonera = new PanelBotones();

        areaTexto = new JTextArea(10,50);
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.white);


        this.setLayout(new BorderLayout());

        this.add(areaTexto, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

        for (JButton boton: this.botonera.getgrupoBotones()){
            boton.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o instanceof JButton) {
            System.out.println(((JButton) o).getText());
            areaTexto.setText(((JButton) o).getText());
        }

        //Crear un switch para cada boton con su respectivo metodo y que se ejecute al pulsar el boton con funcion actionPerformed

        switch (ae.getActionCommand()) {
            case "0":
                areaTexto.setText("0");
                break;
            case "1":
                areaTexto.setText("1");
                break;
            case "2":
                areaTexto.setText("2");
                break;
            case "3":
                areaTexto.setText("3");
                break;
            case "4":
                areaTexto.setText("4");
                break;
            case "5":
                areaTexto.setText("5");
                break;
            case "6":
                areaTexto.setText("6");
                break;
            case "7":
                areaTexto.setText("7");
                break;
            case "8":
                areaTexto.setText("8");
                break;
            case "9":
                areaTexto.setText("9");
                break;
            case "+":
                areaTexto.setText("+");
                break;
            case "-":
                areaTexto.setText("-");
                break;
            case "*":
                areaTexto.setText("*");
                break;
            case "/":
                areaTexto.setText("/");
                break;
            case "=":
                areaTexto.setText("=");
                break;
            case "C":
                areaTexto.setText("C");
                break;
        }



    }


}




