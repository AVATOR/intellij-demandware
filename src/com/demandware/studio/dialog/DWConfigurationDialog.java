package com.demandware.studio.dialog;

import com.demandware.studio.settings.DWSettingsProvider;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DWConfigurationDialog extends DialogWrapper {
    private DWConfiguration form;
    private DWSettingsProvider dwSettingsProvider;

    public DWConfigurationDialog(DWSettingsProvider dwSettings) {
        super(false);
        dwSettingsProvider = dwSettings;

        init();
    }

    @Nullable
    protected JComponent createCenterPanel() {

        form = new DWConfiguration();

        return form.createPanel();
    }

    @NotNull
    @Override
    protected Action[] createActions() {
        if (this.dwSettingsProvider != null) {
            form.setHostname(this.dwSettingsProvider.getHostname());
            form.setUsername(this.dwSettingsProvider.getUsername());
            form.setPassword(this.dwSettingsProvider.getPassword());
            form.setVersion(this.dwSettingsProvider.getVersion());
            form.setAutoUploadEnabled(this.dwSettingsProvider.getAutoUploadEnabled());
        }

        return super.createActions();
    }

    @Override
    protected void doOKAction() {
        if (this.dwSettingsProvider != null) {
            this.dwSettingsProvider.setHostname(form.getHostname());
            this.dwSettingsProvider.setUsername(form.getUsername());
            this.dwSettingsProvider.setPassword(form.getPassword());
            this.dwSettingsProvider.setVersion(form.getVersion());
            this.dwSettingsProvider.setAutoUploadEnabled(form.getAutoUploadEnabled());
        }

        super.doOKAction();
    }
}