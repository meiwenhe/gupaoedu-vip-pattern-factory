package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.ICourse;
import com.gupaoedu.vip.pattern.factory.JavaCourse;
import com.gupaoedu.vip.pattern.factory.PythonCourse;

/**
 * 小作坊式的工厂模型
 * Created by Tom.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse course = new JavaCourse();
//        course.record();

//        ICourseFactory factory = new ICourseFactory();
//        ICourse course = factory.create("com.gupaoedu.vip.pattern.factory.JavaCourse");
//        course.record();

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        ICourse pythonCourse = factory.create(PythonCourse.class);
        course.record();
        System.out.println("44");
        pythonCourse.record();

    }
}
