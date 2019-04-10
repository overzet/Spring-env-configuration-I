package spring.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.profile.controllers.SpringProfilesController;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        SpringProfilesController controller = (SpringProfilesController) ctx.getBean("dependencyInjectionApplication");
        controller.setupDatasourceConfig();
    }

}
