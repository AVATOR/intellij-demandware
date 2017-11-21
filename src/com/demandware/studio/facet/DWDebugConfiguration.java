package com.demandware.studio.facet;

import com.demandware.studio.settings.DWSettingsProvider;
import com.demandware.studio.utils.DWHelper;
import com.intellij.facet.Facet;
import com.intellij.facet.ui.FacetEditorTab;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;

public class DWDebugConfiguration extends FacetEditorTab {
    private JTextField hostnameField;
    private JTextField usernameField;
    private JTextField passwordField;
    private JTextField site;
    private JPanel DWDebugConfiguration;

    public void setHostnameField(String hostnameField) {
        this.hostnameField.setText(hostnameField);
    }

    public void setUsernameField(String usernameField) {
        this.usernameField.setText(usernameField);
    }

    public void setPasswordField(String passwordField) {
        this.passwordField.setText(passwordField);
    }

    public void setSite(String site) {
        this.site.setText(site);
    }

    public JTextField getHostnameField() {
        return hostnameField;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JTextField getPasswordField() {
        return passwordField;
    }

    public JTextField getSite() {
        return site;
    }

    public JPanel createPanel() {
        DWSettingsProvider dwSettings = DWHelper.getInstance().getDWSettings();
        setHostnameField(dwSettings.getHostname());
        setUsernameField(dwSettings.getUsername());
        setPasswordField(dwSettings.getPassword());
        setSite(dwSettings.getSite());

        return DWDebugConfiguration;
    }

    @Override
    public void onFacetInitialized(@NotNull Facet facet) {
        super.onFacetInitialized(facet);
    }

    @Override
    public void onTabEntering() {
        super.onTabEntering();
        String a = "123";
    }

    @Override
    public void apply() throws ConfigurationException {
        super.apply();
        String a = "123";
    }

    @NotNull
    @Override
    public JComponent createComponent() {
        return null;
    }

    @Override
    public boolean isModified() {
        String a = "123";
        return false;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return null;
    }

}
