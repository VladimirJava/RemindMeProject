package kz.zhelezyaka.RemindMeServer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("kz.zhelezyaka.RemindMeServer")
public class WebConfig extends WebMvcConfigurerAdapter {
}
