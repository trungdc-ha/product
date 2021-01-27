package vn.codegym.product.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*thay the cho file dispatcher-servlet.xml*/
@Configuration
public class AppConfiguration implements WebMvcConfigurer {
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("WEB-INF/classes/static/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("WEB-INF/classes/static/js/");
        registry.addResourceHandler("/img/**").addResourceLocations("WEB-INF/classes/static/img/");
    }
}
