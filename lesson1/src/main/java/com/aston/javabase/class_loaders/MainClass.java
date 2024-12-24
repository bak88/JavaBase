package com.aston.javabase.class_loaders;

import lesson1.src.main.java.com.aston.javabase.class_loaders.ClassLoaders;

public class MainClass {

    public static void main(String[] args) {
        Class<ClassLoaders> aClass = ClassLoaders.class;
        printClassLoaders();
    }

    private static void printClassLoaders() {

        ClassLoaders classLoaders = new ClassLoaders();

        classLoaders.printBootstrapClassLoaders();

        classLoaders.printPlatformClassLoaders();

        classLoaders.printApplicationClassLoaders();

        classLoaders.printReflectionExample();
    }
}
