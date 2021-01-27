package vn.codegym.product.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*thay the cho file dispatcher-servlet.xml*/
@Configuration
public class AppConfiguration implements WebMvcConfigurer {
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("WEB-INF/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("WEB-INF/js/");
        registry.addResourceHandler("/img/**").addResourceLocations("WEB-INF/img/");
    }
}
