package spring.profile.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.profile.services.DatasourceConfig;

@Controller
public class SpringProfilesController {

    DatasourceConfig datasourceConfig;

    @Autowired
    public void setupDatasourceConfig(DatasourceConfig datasourceConfig) {
        this.datasourceConfig = datasourceConfig;

    }

    public void setupDatasourceConfig() {
        datasourceConfig.setup();
    }
}