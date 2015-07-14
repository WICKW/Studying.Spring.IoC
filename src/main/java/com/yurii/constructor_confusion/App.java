package com.yurii.constructor_confusion;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        GenericXmlApplicationContext gxac = new GenericXmlApplicationContext();
        gxac.load("classpath:constructor-confusion.xml");
        gxac.refresh();

        ConstructorConfusion cc = (ConstructorConfusion) gxac.getBean("constructorConfusion");
        System.out.println(cc);
    }
}
