package com.geely.design.pattern.creational.factorymethod;

import sun.misc.Launcher;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
        video = videoFactory2.getVideo();
        video.produce();
        video = videoFactory3.getVideo();
        video.produce();
        Collection collection = new ArrayList();
        Iterator iterator = collection.iterator();
        URLStreamHandlerFactory urlStreamHandlerFactory = new URLStreamHandlerFactory() {
            @Override
            public URLStreamHandler createURLStreamHandler(String protocol) {
                return null;
            }
        };
        Launcher launcher = new Launcher();
    }
}
