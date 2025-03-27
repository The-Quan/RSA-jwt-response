package org.example.demorsaopenssl;

import org.example.demorsaopenssl.configation.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class DemoRsaOpenSslApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRsaOpenSslApplication.class, args);
    }

}
