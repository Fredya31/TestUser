package org.sfaci.formularios.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//declaration of controls or variables
public class Formulario {
    private JPanel panel1;
    private JButton btRegister;
    private JButton btCancel;
    private JTextField tfName;
    private JTextField tfLastname;
    private JTextField tfDate;
    private JTextField tfEmail;
    private JPasswordField pfPassword;
    private JPasswordField pfConfirmPassword;
    //associate action events "Button": allows to validate the data to be recorded
    public Formulario(){
        btRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //getText: extract information from form boxes
                String Name = tfName.getText();
                String LastName = tfLastname.getText();
                String Date = tfDate.getText();
                String Email = tfEmail.getText();
                String  Password = pfPassword.getText();
                String ConfirmPasswrd = pfConfirmPassword.getText();
                //Collect information from the form and record it, you can view a bine response either by console or by text window
                //System.out.println("Successful registration: " + Name + " " + LastName);
                JOptionPane.showMessageDialog(null, "Successful registration: ", Name + LastName,
                        JOptionPane.INFORMATION_MESSAGE);

            }

        });
        //associate action events "Button": allows to validate the data to be recorded
        btCancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //setText: Assign empty text or clean the text
                tfName.setText("");
                tfLastname.setText("");
                tfDate.setText("");
                pfPassword.setText("*******");
                pfConfirmPassword.setText("********");


            }
        });
    }
    //run window or display code data
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");
        frame.setSize(400,400);
        frame.setTitle("REGISTRATION FORM");
        frame.setVisible(true);
        frame.setContentPane(new Formulario().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
