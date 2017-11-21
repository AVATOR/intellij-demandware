package com.demandware.studio.facet;

import com.demandware.studio.settings.DWSettingsProvider;
import com.intellij.facet.Facet;
import com.intellij.facet.ui.FacetEditorContext;
import com.intellij.facet.ui.FacetEditorTab;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.roots.ProjectRootManager;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;

public class DWDebugConfiguration extends FacetEditorTab {
//    private final DWSettingsProvider mySettingsProvider;
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
        setHostnameField("Host");
        setUsernameField("user");
        setPasswordField("pass");
        setSite("site");
        return DWDebugConfiguration;
    }

    @NotNull
    @Override
    public JComponent createComponent() {
        return null;
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return null;
    }

    public DWDebugConfiguration() {
//        Project[] projects = ProjectManager.getInstance().getOpenProjects();
//        for (Project project : projects) {
//            Module module = ProjectRootManager.getInstance(project).getFileIndex().getModuleForFile(eventFile);
//        }
//        mySettingsProvider = DWSettingsProvider.getInstance(editorContext.getModule());
    }
}
