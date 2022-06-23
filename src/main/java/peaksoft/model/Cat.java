package peaksoft.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat {
    @Value("${cat.name}")
    private String name;

    @Value("${cat.age}")
    private int age;

    @Value("${cat.mass}")
    private double mass;

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @PostConstruct
    public void init() {
        System.out.println("init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = " + name +
                ", age = " + age +
                ", mass = " + mass +
                '}';
    }

    public void say() {
        System.out.println(name + " says: meo-meo");
    }
}
