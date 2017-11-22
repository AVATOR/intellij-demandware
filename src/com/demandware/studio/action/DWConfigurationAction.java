package com.demandware.studio.action;

import com.demandware.studio.dialog.DWConfigurationDialog;
import com.demandware.studio.settings.DWSettingsProvider;
import com.demandware.studio.utils.DWHelper;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class DWConfigurationAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        DWHelper dwHelper = new DWHelper();
        DWSettingsProvider dwSettings = dwHelper.getDWSettings(e.getProject());

        // show dialog with form
        DWConfigurationDialog dlgWrapper = new DWConfigurationDialog(dwSettings);
        dlgWrapper.setTitle("Demandware Configuration");
        dlgWrapper.show();
        if (dlgWrapper.isOK()) {
            dwHelper.refreshDWconnection(e.getProject(), dwSettings);
        }
    }
}
