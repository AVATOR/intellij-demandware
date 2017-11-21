package com.demandware.studio.settings;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleServiceManager;

@State(
        name = "DWSettingsProvider",
        storages = {
                @Storage(file = StoragePathMacros.MODULE_FILE)
        }
)
public class DWSettingsProvider implements PersistentStateComponent<DWSettingsProvider.State> {
    public static final Logger LOG = Logger.getInstance(DWSettingsProvider.class);
    private State myState = new State();

    public static DWSettingsProvider getInstance(Module module) {
        return ModuleServiceManager.getService(module, DWSettingsProvider.class);
    }

    public void setHostname(String hostname) {
        myState.hostname = hostname;
    }

    public void setUsername(String username) {
        myState.username = username;
    }

    public void setPassword(String password) {
        myState.password = password;
    }

    public void setVersion(String version) {
        myState.version = version;
    }

    public void setSite(String site) {
        myState.site = site;
    }

    public void setAutoUploadEnabled(boolean autoUploadEnabled) {
        myState.autoUploadEnabled = autoUploadEnabled;
    }

    public String getHostname() {
        return myState.hostname;
    }

    public String getUsername() {
        return myState.username;
    }

    public String getPassword() {
        return myState.password;
    }

    public String getVersion() {
        return myState.version;
    }

    public String getSite() {
        return myState.site;
    }

    public boolean getAutoUploadEnabled() {
        return myState.autoUploadEnabled;
    }

    @Override
    public State getState() {
        return myState;
    }

    @Override
    public void loadState(State state) {
        myState.hostname = state.hostname;
        myState.username = state.username;
        myState.password = state.password;
        myState.version = state.version;
        myState.site = state.site;
        myState.autoUploadEnabled = state.autoUploadEnabled;
    }

    public static class State {
        public String hostname;
        public String username;
        public String password;
        public String version;
        public String site;
        public boolean autoUploadEnabled;
    }
}
