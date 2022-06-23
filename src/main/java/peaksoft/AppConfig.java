package peaksoft;

import org.springframework.context.annotation.*;
import peaksoft.model.Cat;

@Configuration
@ComponentScan(basePackages = "peaksoft")
@PropertySource("classpath:application.properties")
public class AppConfig {
        @Bean(name="helloWorld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Scope("prototype")
    @Bean
    public Cat getCat() {
        return new Cat();
    }
}
