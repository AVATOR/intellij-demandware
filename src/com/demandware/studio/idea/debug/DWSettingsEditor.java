package com.demandware.studio.idea.debug;

import com.demandware.studio.facet.DWDebugConfiguration;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.ComponentWithBrowseButton;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DWSettingsEditor extends SettingsEditor<DWRunConfiguration> {

    @Override
    protected void resetEditorFrom(@NotNull DWRunConfiguration dwRunConfiguration) {}

    @Override
    protected void applyEditorTo(@NotNull DWRunConfiguration dwRunConfiguration) throws ConfigurationException {
        String a = "123";
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        DWDebugConfiguration dwFT = new DWDebugConfiguration();
        return dwFT.createPanel();
    }


    private void createUIComponents() {
        LabeledComponent<ComponentWithBrowseButton> myMainClass = new LabeledComponent<ComponentWithBrowseButton>();
        myMainClass.setComponent(new TextFieldWithBrowseButton());
    }
}
