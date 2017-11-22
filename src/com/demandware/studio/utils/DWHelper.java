package com.demandware.studio.utils;

import com.demandware.studio.projectWizard.DWModuleType;
import com.demandware.studio.settings.DWSettingsProvider;
import com.demandware.studio.webdav.DWServerConnection;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.module.ModuleServiceManager;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.project.Project;
import org.apache.http.client.protocol.HttpClientContext;

public class DWHelper {

    /**
     * @param project
     * @return
     */
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

    /**
     * @param project
     * @param dwSettings
     * @return
     */
    public HttpClientContext refreshDWconnection(Project project, DWSettingsProvider dwSettings) {
        HttpClientContext context = null;
        if (project != null) {
            for (Module module : ModuleManager.getInstance(project).getModules()) {
                if (ModuleType.get(module) instanceof DWModuleType) {
                    DWServerConnection service = ModuleServiceManager.getService(module, DWServerConnection.class);
                    try {
                        context = service.connectToServer(dwSettings);
                    } catch (Exception ex) {

                    }
                }
            }
        }
        return context;
    }
}
