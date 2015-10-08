package com.sandeep.interview.samples.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Created by SMALA on 10/8/2015.
 */
@Configuration
@ComponentScan
public class ApplicationSpring {

    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationSpring.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
