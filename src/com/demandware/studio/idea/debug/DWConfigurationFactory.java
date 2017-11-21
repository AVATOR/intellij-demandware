package com.demandware.studio.idea.debug;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;

public class DWConfigurationFactory extends ConfigurationFactory {
    private static final String FACTORY_NAME = "Demandware configuration factory";

    protected DWConfigurationFactory(ConfigurationType type) {
        super(type);
    }

    @Override
    public RunConfiguration createTemplateConfiguration(Project project) {
        return new DWRunConfiguration(project, this, "Demandware");
    }

    @Override
    public String getName() {
        return FACTORY_NAME;
    }
}