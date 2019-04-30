package com.geely.design.pattern.creational.singleton;

import org.apache.ibatis.executor.ErrorContext;
import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * Created by geely
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();;

//        ContainerSingleton.putInstance("object",new Object());
//        Object instance = ContainerSingleton.getInstance("object");
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();

        System.out.println(Thread.currentThread().getName()+"  "+instance);

    }
}
