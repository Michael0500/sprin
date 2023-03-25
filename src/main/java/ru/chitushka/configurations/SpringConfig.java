package ru.chitushka.configurations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.chitushka.services.message.HelloMessageService;
import ru.chitushka.services.message.MessageService;
import ru.chitushka.services.music.ClassicalMusicPlayer;
import ru.chitushka.services.music.MusicPlayer;

@Configuration
public class SpringConfig {
    @Bean
    public MessageService getHelloMessageService() {
        return new HelloMessageService();
    }

    @Bean
    public MusicPlayer getMusicPlayer() {
        return new ClassicalMusicPlayer();
    }

    @Bean
    public BeanPostProcessor messagePostProcessor() {
        return new BeanPostProcessor() {
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
                System.out.println("beforeInitialization: " + beanName);

                return bean;

            }

            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                System.out.println("afterInitialization: " + beanName);

                return bean;
            }
        };
    }
}
