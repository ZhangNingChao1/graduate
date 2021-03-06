package ll.p3143.config;

import ll.p3143.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

}
