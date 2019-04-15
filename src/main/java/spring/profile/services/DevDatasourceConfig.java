package spring.profile.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//This annotation is used on classes to indicate a Spring component. The @Component annotation marks the Java class as a bean or say component so that the component-scanning mechanism of Spring can add into the application context.
@Profile("dev")
public class DevDatasourceConfig implements DatasourceConfig {
    @Override
    public void setup() { // implementation of the method in the interface, this could be reading from a file system or a webservice
        System.out.println("Setting up datasource for DEV environment. ");
    }
}
