package com.yurii.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class App
{
    public static void main( String[] args )
    {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(factory);
        xbdr.loadBeanDefinitions(new FileSystemResource("src/main/resources/spring/xmlBeanFactory.xml"));

        Kore kore = (Kore) factory.getBean("kore");
        System.out.println(kore.defineMeaningsOfLife());
    }
}
