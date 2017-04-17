package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // can't instantiate by constructor
        // ApplicationContext object = new ApplicationContext();

        ApplicationContext instance1 = ApplicationContext.getInstance();
        ApplicationContext instance2 = ApplicationContext.getInstance();

        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.hashCode() == instance2.hashCode());
        System.out.println(Objects.equals(instance1.getId(), instance2.getId()));
        System.out.println(Objects.equals(instance1.getLanguage(), instance2.getLanguage()));

        instance1.print();
    }
}
