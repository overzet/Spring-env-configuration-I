package spring.profile.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.profile.services.DatasourceConfig;

@Controller
public class SpringProfilesController {

    private DatasourceConfig datasourceConfig;// define field

    @Autowired
    public void setupDatasourceConfig(DatasourceConfig datasourceConfig) {//called by Spring during setter injection
        this.datasourceConfig = datasourceConfig;
    }

    public void saySomething() {

        @Qualifier("dev")
        String choice = datasourceConfig.setup();

        System.out.println(choice);

        //return choice;
    }

}