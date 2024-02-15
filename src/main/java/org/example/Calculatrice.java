//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Calculatrice extends JFrame implements ActionListener {
    private JButton b0 = new JButton("0");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");
    private JButton bAdd = new JButton("+");
    private JButton bSubstract = new JButton("-");
    private JButton bMultiply = new JButton("*");
    private JButton bDivide = new JButton("/");
    private JButton bEqual = new JButton("=");
    private JButton bClear = new JButton("C");
    private JLabel result = new JLabel("");
    private String resultText = "";

    public Calculatrice(String title) {
        super(title);
        this.setSize(new Dimension(300, 250));
        this.setDefaultCloseOperation(2);
        this.setLocationRelativeTo((Component)null);
        this.setResizable(false);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JPanel panelResult = new JPanel();
        JPanel panelBouton = new JPanel();
        panelResult.setLayout(new FlowLayout());
        panelResult.add(Box.createRigidArea(new Dimension(-5, 75)));
        panelResult.add(this.result);
        panelBouton.setLayout(new GridLayout(4, 4));
        panelBouton.add(this.b7);
        panelBouton.add(this.b8);
        panelBouton.add(this.b9);
        panelBouton.add(this.bDivide);
        panelBouton.add(this.b4);
        panelBouton.add(this.b5);
        panelBouton.add(this.b6);
        panelBouton.add(this.bMultiply);
        panelBouton.add(this.b1);
        panelBouton.add(this.b2);
        panelBouton.add(this.b3);
        panelBouton.add(this.bSubstract);
        panelBouton.add(this.bClear);
        panelBouton.add(this.b0);
        panelBouton.add(this.bEqual);
        panelBouton.add(this.bAdd);
        this.b0.addActionListener(this);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);
        this.b5.addActionListener(this);
        this.b6.addActionListener(this);
        this.b7.addActionListener(this);
        this.b8.addActionListener(this);
        this.b9.addActionListener(this);
        this.bAdd.addActionListener(this);
        this.bSubstract.addActionListener(this);
        this.bMultiply.addActionListener(this);
        this.bDivide.addActionListener(this);
        this.bClear.addActionListener(this);
        this.bEqual.addActionListener(this);
        this.setContentPane(panel);
        panel.add(panelResult, "North");
        panel.add(panelBouton, "South");
        panelBouton.setBackground(Color.DARK_GRAY);
        panel.setBackground(Color.DARK_GRAY);
        panelResult.setBackground(Color.DARK_GRAY);
        this.bAdd.setBackground(Color.GRAY);
        this.bMultiply.setBackground(Color.GRAY);
        this.bSubstract.setBackground(Color.GRAY);
        this.bDivide.setBackground(Color.GRAY);
        this.bEqual.setBackground(Color.CYAN);
        this.bClear.setBackground(Color.CYAN);
        this.result.setForeground(Color.WHITE);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException var2) {
            var2.printStackTrace();
        }

        Calculatrice fw = new Calculatrice("Calculatrice");
        fw.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        switch (((JButton)e.getSource()).getText()) {
            case "*":
                this.resultText = this.resultText + this.bMultiply.getText();
                this.result.setText(this.resultText);
                break;
            case "+":
                this.resultText = this.resultText + this.bAdd.getText();
                this.result.setText(this.resultText);
                break;
            case "-":
                this.resultText = this.resultText + this.bSubstract.getText();
                this.result.setText(this.resultText);
                break;
            case "/":
                this.resultText = this.resultText + this.bDivide.getText();
                this.result.setText(this.resultText);
                break;
            case "0":
                this.resultText = this.resultText + this.b0.getText();
                this.result.setText(this.resultText);
                break;
            case "1":
                this.resultText = this.resultText + this.b1.getText();
                this.result.setText(this.resultText);
                break;
            case "2":
                this.resultText = this.resultText + this.b2.getText();
                this.result.setText(this.resultText);
                break;
            case "3":
                this.resultText = this.resultText + this.b3.getText();
                this.result.setText(this.resultText);
                break;
            case "4":
                this.resultText = this.resultText + this.b4.getText();
                this.result.setText(this.resultText);
                break;
            case "5":
                this.resultText = this.resultText + this.b5.getText();
                this.result.setText(this.resultText);
                break;
            case "6":
                this.resultText = this.resultText + this.b6.getText();
                this.result.setText(this.resultText);
                break;
            case "7":
                this.resultText = this.resultText + this.b7.getText();
                this.result.setText(this.resultText);
                break;
            case "8":
                this.resultText = this.resultText + this.b8.getText();
                this.result.setText(this.resultText);
                break;
            case "9":
                this.resultText = this.resultText + this.b9.getText();
                this.result.setText(this.resultText);
                break;
            case "=":
                String result = this.calcul(this.resultText);
                this.result.setText(this.resultText + " = " + result);
                break;
            case "C":
                this.result.setText((String)null);
                this.resultText = "";
        }

    }

    public String calcul(String calcul) {
        int calculLength = calcul.length();
        String[] numbers = calcul.split("[+-/*]");
        int indexNumber = 0;
        float resultat = Float.parseFloat(numbers[0]);

        for(int i = 1; i < calculLength; ++i) {
            char operator = calcul.charAt(i);
            switch (operator) {
                case '*':
                    ++indexNumber;
                    resultat *= Float.parseFloat(numbers[indexNumber]);
                    break;
                case '+':
                    ++indexNumber;
                    resultat += Float.parseFloat(numbers[indexNumber]);
                case ',':
                case '.':
                default:
                    break;
                case '-':
                    ++indexNumber;
                    resultat -= Float.parseFloat(numbers[indexNumber]);
                    break;
                case '/':
                    ++indexNumber;
                    resultat /= Float.parseFloat(numbers[indexNumber]);
            }
        }

        return Float.toString(resultat);
    }
}