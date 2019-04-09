package com.gupaoedu.vip.pattern.factory.abstractfactory;

import org.apache.ibatis.ognl.ObjectElementsAccessor;
import org.apache.ibatis.ognl.ObjectMethodAccessor;


/**
 * Created by Tom.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

    }

}
