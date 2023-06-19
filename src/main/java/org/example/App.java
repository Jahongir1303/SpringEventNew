package org.example;

import org.example.config.AppConfig;
import org.example.publisher.ZeeCafePublisher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ZeeCafePublisher bean = context.getBean("zeeCafePublisher", ZeeCafePublisher.class);
        bean.streamBigBangTheory("EP - 004");
    }
}
