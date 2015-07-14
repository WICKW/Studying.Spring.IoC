package com.yurii.aplicationcontext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        GenericXmlApplicationContext gxac = new GenericXmlApplicationContext();
        gxac.load("classpath:app-context-xml.xml");
        gxac.refresh();

        MsgProvider mp = gxac.getBean("msgProvider", MsgProvider.class);
        System.out.println(mp.getMsg());
    }
}
