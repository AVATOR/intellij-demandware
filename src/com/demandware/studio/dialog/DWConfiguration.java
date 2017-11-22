package com.demandware.studio.dialog;

import javax.swing.*;

public class DWConfiguration {

    private JTextField hostnameField;
    private JTextField usernameField;
    private JTextField versionField;
    private JPasswordField passwordField;
    private JComboBox versionsField;
    private JPanel dwConfigurationPanel;
    private JCheckBox autoUploadEnabledField;

    public String getHostname() {
        return hostnameField.getText();
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getVersion() {
        return versionField.getText();
    }

    public String getPassword() {
        return String.valueOf(passwordField.getPassword());
    }

    public String getVersionsFiled() {
        return String.valueOf(versionsField.getSelectedItem());
    }

    public boolean getAutoUploadEnabled() {
        return autoUploadEnabledField.isSelected();
    }

    public void setHostname(String hostname) {
        hostnameField.setText(hostname);
    }

    public void setUsername(String username) {
        usernameField.setText(username);
    }

    public void setVersion(String version) {
        versionField.setText(version);
    }

    public void setPassword(String password) {
        passwordField.setText(password);
    }

    public void setVersionsFiled(String password) {
        versionsField.setSelectedItem(password);
    }

    public void setAutoUploadEnabled(boolean checked) {
        autoUploadEnabledField.setSelected(checked);
    }

    public JPanel createPanel() {
        return dwConfigurationPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public String getDisplayName() {
        return "Demandware";
    }
}
