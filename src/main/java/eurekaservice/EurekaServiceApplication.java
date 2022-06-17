package eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.netflix.appinfo.AmazonInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaServiceApplication {
    @Bean
    ApplicationRunner applicationRunner(Environment environment) {
        return args -> {
            log.error("XXXXXXXX-Systrem starting up " );

        };
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }

}
