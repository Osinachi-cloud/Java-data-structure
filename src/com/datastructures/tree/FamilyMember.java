package com.datastructures.tree;

public class FamilyMember implements Comparable {

    private String name;
    private String surname;
    private int age;

    public FamilyMember(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object fm) {
        FamilyMember member = (FamilyMember) fm;
        return Integer.compare(this.age, member.age);
    }
}
