package com.llxk.xkapiclientsdk;

import com.llxk.xkapiclientsdk.client.XkApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: XkApiClientConfig
 * Package: com.llxk.xkapiclientsdk
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/8/24 23:51
 */
@Configuration
@Data
@ConfigurationProperties("xkapi.client")
@ComponentScan
public class XkApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public XkApiClient xkApiClient() {
        return new XkApiClient(accessKey, secretKey);
    }
}
