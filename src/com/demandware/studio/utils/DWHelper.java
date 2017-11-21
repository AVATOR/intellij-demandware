package com.demandware.studio.utils;

import com.demandware.studio.projectWizard.DWModuleType;
import com.demandware.studio.settings.DWSettingsProvider;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.module.ModuleServiceManager;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.project.Project;

public class DWHelper {
    private static DWHelper instance = null;
    private Project project = null;

    protected DWHelper() {}

    public static DWHelper getInstance() {
        if(instance == null) {
            instance = new DWHelper();
        }
        return instance;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        if (null == this.project) {
            this.project = project;
        }
    }

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

    public DWSettingsProvider getDWSettings() {
        DWSettingsProvider dwSettings = null;

        if (this.project != null) {
            for (Module module : ModuleManager.getInstance(this.project).getModules()) {
                if (ModuleType.get(module) instanceof DWModuleType) {
                    dwSettings = ModuleServiceManager.getService(module, DWSettingsProvider.class);
                }
            }
        }

        return dwSettings;
    }
}
