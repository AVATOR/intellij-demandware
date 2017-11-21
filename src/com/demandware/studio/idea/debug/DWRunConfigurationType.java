package com.demandware.studio.idea.debug;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.*;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DWRunConfigurationType implements ConfigurationType {
    @Override
    public String getDisplayName() {
        return "Demandware";
    }

    @Override
    public String getConfigurationTypeDescription() {
        return "Demandware Run Configuration Type";
    }

    @Override
    public Icon getIcon() {
        return IconLoader.getIcon("/icons/demandware.png");
    }

    @NotNull
    @Override
    public String getId() {
        return "DEMANDWARE_RUN_CONFIGURATION";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[]{
                new DWConfigurationFactory(this)
        };
    }


}