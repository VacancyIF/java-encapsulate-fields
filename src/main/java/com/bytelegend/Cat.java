package com.bytelegend;

public class Cat {
    private String name;
    private int age;
    private String color;
    private boolean cute;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }


    public boolean isCute() {
        return cute;
    }
}
