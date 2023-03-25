package ru.chitushka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.chitushka.configurations.SpringConfig;
import ru.chitushka.services.message.MessageService;
import ru.chitushka.services.music.MusicPlayer;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Hello, Spring framework!");
        System.out.println("");

        //ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class); // for JavaConfig file annotation
        ApplicationContext context = new ClassPathXmlApplicationContext("mainapp-context.xml"); // for xml file
        MessageService message = context.getBean(MessageService.class);
        MusicPlayer music = context.getBean(MusicPlayer.class);

        System.out.println("Message service: ");
        System.out.println(message.getMessage());

        System.out.println("");

        System.out.println("Music service: ");
        System.out.println(music.getMusicType());
    }
}
