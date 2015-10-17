package com.org.interview.sandeep.samples.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SMALA on 10/8/2015.
 */

public class ApplicationSpring {

    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        //AbstractApplicationContext has multiple implementation
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:context/application-context.xml");

        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
        context.registerShutdownHook();
    }
}