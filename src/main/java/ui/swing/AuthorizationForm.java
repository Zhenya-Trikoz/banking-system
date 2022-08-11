package ui.swing;


import domain.iface.I_System;
import domain.models.Account;
import domain.system.SystemImpl;

import javax.swing.*;
import java.awt.*;

public class AuthorizationForm extends JDialog {
    private JPanel panelSignIn;
    private JTextField loginField;
    private JButton authorizationButton;
    private JButton registrationButton;
    private JPasswordField passwordField;
    private JButton closeButton;

    public AuthorizationForm() {
        setUndecorated(true);
        setContentPane(panelSignIn);
        setMinimumSize(new Dimension(480, 300));

        setModal(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        closeButton.addActionListener(e -> dispose());
        authorizationButton.addActionListener(e -> {
            authorization();
        });
        registrationButton.addActionListener(e -> {
            dispose();
            new RegistrationUserForm();
        });
        setVisible(true);
    }

    private void authorization() {
        I_System i_system = new SystemImpl();
        i_system.authorization(new Account(loginField.getText().toCharArray(), passwordField.getPassword()));
    }

}
