package JHW_Conditional_App.askovorodko.config;

import JHW_Conditional_App.askovorodko.model.DevProfile;
import JHW_Conditional_App.askovorodko.model.ProductionProfile;
import JHW_Conditional_App.askovorodko.model.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @ConditionalOnProperty(value = "askovorodko.profile.dev", havingValue = "true", matchIfMissing = true)
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty(value = "askovorodko.profile.dev", havingValue = "false")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
