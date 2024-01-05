package com.bxcode.microservices;

import com.bxcode.tools.loader.base.MicroServicesBaseApplication;
import com.bxcode.tools.loader.componets.properties.MicroServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application
 * <p>
 * Application class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author bxcode
 * @author bacsystem.sac@gmail.com
 * @since 28/12/2023
 */

@SpringBootApplication(scanBasePackages = {"com.bxcode.tools.loader"})

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}