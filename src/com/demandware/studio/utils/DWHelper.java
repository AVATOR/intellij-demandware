package com.demandware.studio.utils;

import com.demandware.studio.projectWizard.DWModuleType;
import com.demandware.studio.settings.DWSettingsProvider;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.module.ModuleServiceManager;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.project.Project;

public class DWHelper {

    public DWSettingsProvider getDWSettings(Project project) {
        DWSettingsProvider dwSettings = null;

        if (project != null) {
            for (Module module : ModuleManager.getInstance(project).getModules()) {
                if (ModuleType.get(module) instanceof DWModuleType) {
                    dwSettings = ModuleServiceManager.getService(module, DWSettingsProvider.class);
                }
            }
        }
        return dwSettings;
    }
}
